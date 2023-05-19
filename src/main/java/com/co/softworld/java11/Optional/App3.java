package com.co.softworld.java11.Optional;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static java.util.Optional.ofNullable;

@Slf4j
public class App3 {

	void isEmpty(Person person) {
		log.info("isEmpty...");
		Optional<Person> optional = ofNullable(person);
		if (optional.isEmpty())
			log.info("Optional<Persona> is isEmpty");
		else
			log.info("Optional<Persona> is not isEmpty " + optional.get());
	}

	public static void main(String[] args) {
		App3 app3 = new App3();
		Person person = new Person();
		app3.isEmpty(null);
		app3.isEmpty(person);
	}
}