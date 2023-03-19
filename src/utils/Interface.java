package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {
	public static int askForNumber(Scanner sc) {
		int number = 0; // number that will never be right
		System.out.println("Introduce a number between 1 and 500");
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("The thing introduced was not an int");
			sc.next();
		}
		return number;
	}
}
