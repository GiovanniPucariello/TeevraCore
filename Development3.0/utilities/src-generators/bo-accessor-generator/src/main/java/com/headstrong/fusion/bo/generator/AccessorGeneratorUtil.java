package com.headstrong.fusion.bo.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class AccessorGeneratorUtil {

	public static Set<Class> getClassesByName(String delimitedClassName) {
		if (delimitedClassName == null) {
			return new HashSet();
		}
		Set<Class> inputClassSet = new HashSet();
		for (String inputClassName : delimitedClassName.split(",")) {
			Class clazz = null;
			try {
				clazz = Class.forName(inputClassName);
			} catch (ClassNotFoundException e) {
				System.out.println("Could not load class named " + inputClassName + ". \n");
			}
			inputClassSet.add(clazz);
		}
		return inputClassSet;
	}

	public static Set<Class> getAllClassesFromPackage(String packageName) {
		if (packageName == null) {
			return new HashSet();
		}
		Set<Class> inputClassSet = new HashSet();
		Enumeration<URL> urls = null;
			String packagePath = packageName.replace('.', '/');
			try {
				urls = AccessorGeneratorUtil.class.getClassLoader().getResources(packagePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
			Set<Class> classNames = new HashSet();
			int numberOfClasses = 0;
			while (urls.hasMoreElements()) {
				numberOfClasses++;
				URL url = urls.nextElement();
				String path="";
				try {
					path = URLDecoder.decode(url.getPath(), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				if(path.contains("!")){
					path = path.replace("file:/", "");
					classNames.addAll(getClassesFromJar(path.split("!")[0], packageName));
				}else{
					classNames.addAll(getClassesFromFolder(path,packageName));
				}
			}
			if(numberOfClasses==0){
				System.err.print("No Package named "+packageName+" could be found in the classpath. Please make sure the package exists.");
			}	
		return classNames;
	}

	/**
	 * @param path
	 * @param packageName
	 * @return
	 */
	private static Set getClassesFromFolder(String path, String packageName) {
		Set inputClassSet = new HashSet();
		File[] classes = (new File(path)).listFiles();
		for(File nextClass : classes){
			String className = packageName+nextClass.getName().split("[.]")[0];
			if(nextClass.getName().startsWith("package-info")){
				continue;
			}
			try {
				Class clazz = Class.forName(className);
				inputClassSet.add(clazz);
			} catch (ClassNotFoundException e) {
				System.out.println("Could not load class named "+className+" . \n");
			}
		}
		return inputClassSet;
	}

	private static List<String> getClassNames(String jarName, String packagePath) {
		File jar = new File(jarName);
		FileInputStream fis;
		List<String> classNames = new ArrayList();
		try {
			fis = new FileInputStream(jar);
			packagePath = packagePath.replace(".", "/");
			JarInputStream jis = new JarInputStream(fis);
			JarEntry entry = null;

			while ((entry = jis.getNextJarEntry()) != null) {
				String className = entry.getName();
				System.out.println(className);
				if (entry.getName().startsWith(packagePath)) {
					try {
						className = className.substring(0, className.indexOf("."));
						classNames.add(className.replace("/", "."));
					} catch (Exception e) {
						System.out.println(className + " is not a class.");
					}

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return classNames;
	}

	private static Set<Class> getClassesFromJar(String jarName, String packagePath) {
		List<String> classNames = getClassNames(jarName, packagePath);
		Set<Class> classes = new HashSet();
		for (String className : classNames) {
			if(className.startsWith("package-info")){
				continue;
			}
			try {
				classes.add(Class.forName(className));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return classes;
	}

	public static String writeClass(byte[] stream, String path, String fileName){
	    (new File(path)).mkdirs();
		File f = new File(path+"\\"+fileName);
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Could not create file or directory.", e);
			}
		}
		OutputStream os=null;
		try {
			os = new FileOutputStream(f);
			os.write(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not create file or directory.", e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not create file or directory.", e);
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Could not create file or directory.", e);
			}
		}
		return path;
	}
}
