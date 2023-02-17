package com.co.softworld.java11.filesMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class App2 {

	/**
	 * Crea un archivo, y en caso de que exista, lo remplaza.
	 */
	Path write(Path path, String text) throws IOException {
		Path result = Files.writeString(path, text, StandardOpenOption.CREATE);
		System.out.println("wrote: \"" + text + "\" in the file " + path.getFileName() + " successful!!!");
		return result;
	}

	/**
	 * Crea un nuevo archivo, y en caso de que exista, genera una exception.
	 */
	Path writeNewIfNotExist(Path path, String text) throws IOException {
		Path result = Files.writeString(path, text, StandardOpenOption.CREATE_NEW);
		System.out.println("wrote: \"" + text + "\" in the file " + path.getFileName() + " successful!!!");
		return result;
	}

	/**
	 * Lee el contenido de un archivo.
	 */
	String read(Path path) throws IOException {
		String result = Files.readString(path);
		System.out.println("read: \"" + result + "\"");
		return Files.readString(path);
	}

	public static void main(String[] args) throws IOException {
		App2 app2 = new App2();
		Path path = Path.of("./file/test.txt");
		String text = "available from JDK 11!!!";
//		app2.write(path, text);
//		app2.writeNewIfNotExist(path, text);
		app2.read(path);
	}

}