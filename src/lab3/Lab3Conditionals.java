package lab3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab3Conditionals {
		static int x;
	public static void main(String[] args) {
		System.out.println("Hi. \n \nWe're going to tell you some stuff about a number you'll put in. Press enter to continue.");
					Scanner read = new Scanner(System.in);
			read.nextLine();
			System.out.println("First, can you tell us your name?");
			String userName = read.nextLine();

			System.out.println("Thanks, " + userName + ", now we need you to give us a number between 1 and 100, inclusive. A whole number. No irrational fractions, or decimals, please.");
			do {
			try {
				
		int userInt = read.nextInt();

			if ((userInt < 1) || (userInt > 100)) {
				System.out.println("Please take this seriously, " + userName + ". Enter an interger between 1 and 100.");
				x = 333;
			}
			else if ((userInt % 2 != 0) && (userInt < 60)) {
				System.out.println(userInt + " is odd.");
				x = 9;
			}
			else if((userInt >= 2) && (userInt <= 25)) {
				System.out.println("Even and less than 25.");
				x = 4;
			}
			else if((userInt) > 25 && (userInt <= 60)) {
				System.out.println("Even.");
				x = 85;
			}
			else if((userInt % 2 == 0) && (userInt > 60)) {
				System.out.println(userInt + " is even.");
				x = 331;
			}
			else {
				System.out.println("Odd and over 60.");
				x = 12345678;
			}
		}
		catch(InputMismatchException num) {
			System.out.println("We need an integer between 1 and 100, " + userName + ".");
			x = 333;


		}

			read.nextLine();
		}
		while(x == 333);
		read.close();
		System.out.println("Thanks for playing, " + userName + "! Goodbye!");

	}

}
