package com.co.softworld.java11.Optional;

import java.util.Optional;

public class App3 {

	void isEmpty(Person person) {
		Optional<Person> optional = Optional.ofNullable(person);
		if (optional.isEmpty()) {
			System.out.println("JDK 11 isEmpty");
		} else {
			System.out.println("JDK 11 not isEmpty " + optional.get());
		}
	}

	public static void main(String[] args) {
		App3 app3 = new App3();
		Person person = null;
		app3.isEmpty(person);
	}
}