package day20_userRegistrationJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {

		public static void main(String[] args) {
			System.out.println("Regular Expression program to validate User Registration!!!");
			LastName userEntry = new LastName();

			userEntry.validateEntries();
		}

		public void validateEntries() {
			System.out.println("Enter First Name :");
			validateName(getUserInput());

			System.out.println("Enter Last Name :");
			validateName(getUserInput());

		}

		public String getUserInput() {
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}

		public void validateName(String input) {

			String name = "^[A-Z][a-zA-Z]{3,}$";

			Pattern pattern = Pattern.compile(name);
			Matcher match = pattern.matcher(input);

			System.out.println("Validating");
			printResult(match.matches(), input);

		}

		public void printResult(boolean value, String input) {
			if (value)
				System.out.println(" " + input + " is Valid");
			else
				System.out.println(" " + input + " is Invalid");
		}

	}
