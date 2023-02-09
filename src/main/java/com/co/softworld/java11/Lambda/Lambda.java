package com.co.softworld.java11.Lambda;

import java.util.stream.IntStream;

public class Lambda {

	void numberSelection(String texto) {
		switch (texto.toLowerCase()) {
		case "par":
			IntStream.of(1, 2, 3, 4, 5, 6).filter((var i) -> i % 2 == 0).forEach(System.out::println);
			break;
		case "impar":
			IntStream.of(1, 2, 3, 4, 5, 6).filter((var a) -> a % 2 != 0).forEach(System.out::println);
			break;
		default:
			System.out.println("No valid");
		}
	}

	double sum(double n1, double n2) {
		IOperation sum = (var x, var y) -> (x + y);
		return sum.calculate(n1, n2);
	}

	public static void main(String[] args) {
		Lambda lambda = new Lambda();
		lambda.numberSelection("Impar");
		System.out.println("sum: " + lambda.sum(2, 4));
	}

}
