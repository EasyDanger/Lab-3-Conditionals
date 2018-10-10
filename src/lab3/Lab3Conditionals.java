package lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab3Conditionals {
	static int x; // Originally x was declared as it was used. But it was moved here for safety,
					// as it is assigned in the if statements, but used outside it. This method of
					// looping was used to cheaply avoid using user input to force the loops.

	public static void main(String[] args) {
		System.out.println(
				"Hi. \n \nWe're going to tell you some stuff about a number you'll put in. Press enter to continue.");
		Scanner read = new Scanner(System.in);
		read.nextLine();
		System.out.println("First, what can we call you?");
		String userName = read.nextLine();

		System.out.println("Thanks, " + userName
				+ ", now we need you to give us a number between 1 and 100, inclusive. A whole number. No irrational fractions, or decimals, please.");
		do {
			try {

				int userInt = read.nextInt();

				// These if/else statements really just follow the lab prompt. All i can say is
				// that it was helpful to read them all before I started writing these. I'm
				// still convinced that it's possible to write them with fewer statements,
				// though.
				if ((userInt < 1) || (userInt > 100)) {
					System.out.println(
							"Please take this seriously, " + userName + ". Enter an interger between 1 and 100.");
					x = 333;// There is no significance to the number 333.
				} else if ((userInt % 2 != 0) && (userInt < 60)) {
					System.out.println(userInt + " is odd.");
					x = 9; // These values don't matter, so long as they are not equal to 333. This seems
							// so clean, I'm interested to see how others handle the loops from here out.
				} else if ((userInt >= 2) && (userInt <= 25)) {
					System.out.println("Even and less than 25.");
					x = 1984;// 2 + 2 = 5
				} else if ((userInt) > 25 && (userInt <= 60)) {
					System.out.println("Even.");
					x = 2003;// Jeez, I'm getting old.
				} else if ((userInt % 2 == 0) && (userInt > 60)) {
					System.out.println(userInt + " is even.");
					x = 313;// I love my city.
				} else {
					System.out.println("Odd and over 60.");
					x = 123456789;// There are ten duel commandments!
				}
			} catch (InputMismatchException num) {
				System.out.println("We need an integer between 1 and 100, " + userName + ".");
				x = 333;
//The auto-formatter left this space here. I don't know why. It seems awkward. And it's not the only one
			}

			read.nextLine(); // Scanners are still tricky.
			System.out.println("Would you like to try again? (y/n)");
			String tryAgain = read.nextLine();

			if (tryAgain.equals("y")) {
				System.out.println("Okay. Enter another number, then, " + userName + ".");
				x = 333;

			} else if (tryAgain.equals("n")) {
				System.out.println("Alright, then.");
				x = 8675309; // Jenny
			} else {
				System.out.println(
						"I don't know what that means, " + userName + ", so I think we're just gonna call it here.");
				x = 616; // Marvelous
			}
		} while (x == 333);
		read.close();
		System.out.println("Thanks for playing, " + userName + "! Goodbye!");
//I'm quite proud of the simple variable looping method, as it allows me to use one loop for everything in the program.
	}

}
