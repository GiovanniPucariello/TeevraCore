/**
 * 
 */
package com.headstrong.fusion.launcher.jar.resolver;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class JarResolver {

	public static void main(String[] args) throws Exception {

		File bundlesDir = new File(
				"E:/Teevra/TeevraServer/assembler/target/teevra.server.assembler-2.0.0-bin.dir/fusion/resources/bundles");

		for (File bundle : bundlesDir.listFiles()) {

			JarFile jarFile = new JarFile(bundle);

			Manifest manifest = jarFile.getManifest();

			if (!(manifest.getMainAttributes().keySet()
					.contains(new Attributes.Name("Export-Package")))) {
//				System.out.println(manifest.getMainAttributes().keySet());
				System.out.println(jarFile.getName());
			}
			/*
			 * List<String> clazzes = new ArrayList<String>();
			 * 
			 * for (Enumeration<JarEntry> em1 = jarFile.entries(); em1
			 * .hasMoreElements();) { JarEntry entry = em1.nextElement(); if
			 * (!entry.isDirectory() && entry.getName().endsWith(".class")) {
			 * clazzes.add(entry.getName()); } }
			 * 
			 * List<String> validPackages = new ArrayList<String>(); for
			 * (String clazz : clazzes) { String dir = clazz.substring(0,
			 * clazz.lastIndexOf("/") + 1); if (!validPackages.contains(dir)) {
			 * validPackages.add(dir); } }
			 * 
			 * for (String vDir : validPackages) {
			 * System.out.println(vDir.substring(0, vDir.length() - 1)
			 * .replace('/', '.')); }
			 */

		}

	}
}
