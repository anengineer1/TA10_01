package main;

import classes.Number500generator;
import java.util.Scanner;

import utils.Interface;

public class TA10_01_App {

	public static void main(String[] args) {

		Number500generator number_handler = new Number500generator();
		Scanner sc = new Scanner(System.in);

		while (!number_handler.isGuessedCorrectly()) {
			number_handler.getUserNumber(Interface.askForNumber(sc));
			number_handler.printIfHigherOrLower();
		}

		sc.close();
		number_handler.printNumberOfTries();

	}

}
