package com.co.softworld.java11.StringMethods;

import java.util.List;
import java.util.stream.Collectors;

public class App {

	boolean isBlank(String texto) {
		return texto.isBlank();
	}

	String repeat(String texto, int cantidad) {
		return texto.repeat(3);
	}

	List<String> toList(String texto) {
		return texto.lines().collect(Collectors.toList());
	}

	String stripLeading(String texto) {
		return texto.stripLeading();
	}

	String stripTrailing(String texto) {
		return texto.stripTrailing();
	}

	String strip(String texto) {
		return texto.strip();
	}

	String trim(String texto) {
		return texto.trim();
	}

	public static void main(String[] args) {
		App app = new App();
		System.out.println("isBlank: " + app.isBlank(" ") + ", " + app.isBlank("texto"));
		System.out.println("repeat: " + app.repeat("Hi! ", 3));
		System.out.println("toList: " + app.toList("texto"));
		System.out.println(app.stripLeading(" texto "));
		System.out.println(app.stripTrailing(" texto "));
		System.out.println(app.strip(" \n\t   strip   \u2005"));
		System.out.println(app.trim(" \n\t   trim   \u2005"));
	}
}
