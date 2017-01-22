package com.crack.interview.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

public class CodeExecutorUtil {

	private static final String FILE_NAME = "TestCode";
	private static final String JAVA_EXTENSION = ".java";

	public static void main(String[] args) {
		startProcess("hello");
	}

	public static String startProcess(String code) {
		prepareFile(code);
		String output = compileAndRun();
		return output;
	}

	private static String compileAndRun() {

		StringBuilder outputBuilder = new StringBuilder();
		String[] command = new String[] { "javac", FILE_NAME + JAVA_EXTENSION };
		try {
			ProcessBuilder builder = new ProcessBuilder(command);
			Process process = builder.start();

			InputStream errorStream = process.getErrorStream();

			Reader reader = new InputStreamReader(errorStream);
			int ch;
			while ((ch = reader.read()) != -1) {
				outputBuilder.append((char) ch);
				System.out.print((char) ch);
			}

			process.waitFor();
			reader.close();

			if (outputBuilder.length() == 0) {
				// Code compiled now execute.
				System.out.println(outputBuilder);
				command = new String[] { "java", FILE_NAME };
				builder = new ProcessBuilder(command);
				process = builder.start();
				InputStream inputStream = process.getInputStream();
				Reader reader1 = new InputStreamReader(inputStream);
				int ch1;
				while ((ch1 = reader1.read()) != -1) {
					outputBuilder.append((char) ch1);
				}

				process.waitFor();
				reader.close();
			} else {
				System.out.println("-------");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(outputBuilder);

		System.out.println("Program complete");
		return outputBuilder.toString();
	}

	private static void prepareFile(String code) {
		try {
			Path path = Paths.get(FILE_NAME + JAVA_EXTENSION);
			if (!path.toFile().exists()) {
				Files.createFile(path);
			}
			FileUtils.writeStringToFile(path.toFile(), code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
