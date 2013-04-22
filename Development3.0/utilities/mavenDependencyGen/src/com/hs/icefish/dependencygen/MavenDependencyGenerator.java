package com.hs.teevra.dependencygen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Lists the direct dependency the given Maven project and its children has
 * @author akrishnamoorthy
 *
 */
public class MavenDependencyGenerator {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.err
					.println("Please specify root directory of the project, "
							+ "the depth till where it has to search for POM file and "
							+ "the target file name in which dependencies need to be listed");
			System.exit(0);
		}
		String rootDirName = args[0];
		int depth = Integer.parseInt(args[1]);
		String outputFileName = args[2];

		MavenDependencyGenerator gen = new MavenDependencyGenerator();
		List<File> pomFiles = gen
				.getMavenPomFiles(new File(rootDirName), depth);
		try {
			gen.generateDependencyList(pomFiles, new PrintWriter(new FileOutputStream(outputFileName)));
		} catch (FileNotFoundException e) {
			System.err.println("A file with the given name " + outputFileName
					+ " cannot be created.");
			e.printStackTrace();
		}

	}

	/**
	 * Fetches all the POM files from the directory given and goes down to as
	 * many level as given <code>depth</code> in the hierarchy
	 * 
	 * @param dir
	 * @param depth
	 * @return list of POM files
	 */
	public List<File> getMavenPomFiles(File dir, int depth) {
		List<File> mavenProjects = new ArrayList<File>();
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files) {
				// navigate sub-directories till you reach depth
				if (file.isDirectory()) {
					if (depth <= 0) {
						continue; // end of nesting
					} else {
						List<File> subPoms = getMavenPomFiles(file, depth - 1);
						mavenProjects.addAll(subPoms);
					}
				} else if ("pom.xml".equals(file.getName().toLowerCase())) {
					mavenProjects.add(file);
				}
			}
		}
		return mavenProjects;
	}

	/**
	 * Extract dependency from the POM file and write the details of dependency
	 * in the POM file
	 * 
	 * @param pomFiles
	 * @param outputFile
	 */
	public void generateDependencyList(List<File> pomFiles,
			PrintWriter outputFile) {
		outputFile.println("POM Absolute Path, Group ID, Artifact ID, Version");
		for (File pomFile:pomFiles) {
			//parse the pomFile
			try {
				Document pomDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile);
				NodeList dependencyElements = pomDoc.getElementsByTagName("dependency");
				for(int i=0;i<dependencyElements.getLength();i++) {
					Element depenedency = (Element)dependencyElements.item(i);
					String version = getElementChildContents(depenedency, "version");
					if ("${project.version}".equals(version)) {
						continue;
					}
					StringBuffer currentLine = new StringBuffer(pomFile.getAbsolutePath() + ",");
					currentLine.append(getElementChildContents(depenedency, "groupId")).append(",");
					currentLine.append(getElementChildContents(depenedency, "artifactId")).append(",");
					currentLine.append(version);
					outputFile.println(currentLine.toString());
				}
			} catch (SAXException e) {
				System.err.println("Error while parsing the xml file :" + pomFile.getAbsolutePath());
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("Error while reading the xml file :" + pomFile.getAbsolutePath());
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				System.err.println("Error in the parser while reading the xml file :" + pomFile.getAbsolutePath());
				e.printStackTrace();
			}
		}
		outputFile.close();
	}
	
	/**
	 * Returns the text content of the given childElement in its parent node 
	 * @param parentElement
	 * @param childElementName
	 * @return
	 */
	private String getElementChildContents(Element parentElement, String childElementName) {
		NodeList children = parentElement.getElementsByTagName(childElementName);
		return (children.getLength() > 0) ? children.item(0).getTextContent().trim() : "";
	}
}
