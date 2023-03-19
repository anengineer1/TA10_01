package classes;

import java.util.Random;

public class Number500generator {

	final private int COUNTER_DEFAULT_VALUE = 0;

	private int number_to_be_guessed;
	private int user_number; // number from the user
	private int try_counter;
	private boolean guessed_correctly;

	public Number500generator() {
		this.number_to_be_guessed = generateNumber();
		this.try_counter = this.COUNTER_DEFAULT_VALUE;
		this.guessed_correctly = false;
	}

	private int generateNumber() {
		Random rnd = new Random();
		return (rnd.nextInt(500) + 1); // the +1 is necessary to go from 1 to 500
	}

	public void resetCounter() {
		setCounter(this.COUNTER_DEFAULT_VALUE);
	}

	public void printIfHigherOrLower() {
		System.out.println("The user introduced: " + this.user_number + "Result: " + this.number_to_be_guessed);
		if (this.user_number > this.number_to_be_guessed) {
			System.out.println("The number introduced is higher than you need");
		} else if (this.user_number < this.number_to_be_guessed) {
			System.out.println("The number introduced is lower than you need");
		} else {
			System.out.println("You guessed it right!");
		}
	}

	public void printNumberOfTries() {
		System.out.println("Number of tries: " + this.try_counter);
	}

	public void getUserNumber(int number) {
		this.try_counter++;
		this.user_number = number;
		this.guessed_correctly = (this.number_to_be_guessed == this.user_number);
	}

	public boolean isGuessedCorrectly() {
		return guessed_correctly;
	}

	public void setGuessed_correctly(boolean guessed_correctly) {
		this.guessed_correctly = guessed_correctly;
	}

	private void setCounter(int counter) {
		this.try_counter = counter;
	}

}
