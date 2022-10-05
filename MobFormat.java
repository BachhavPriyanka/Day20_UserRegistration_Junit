package day20_userRegistrationJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobFormat {

		public static void main(String[] args) {
			MobFormat userEntry = new MobFormat();
			userEntry.validateEntries();
		}

		public void validateEntries() {
			System.out.println("Enter Mobile Number : ");
			validateMobileNumber(getUserInput());

		}

		public String getUserInput() {
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}

		public void validateMobileNumber(String input) {

			String mobile = "^[0-9]{2}\\s[0-9]{10}$";

			System.out.println("\nValidating");
			match(mobile, input);
		}

		public void match(String regex, String input) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(input);

			printResult(match.matches(), input);
		}

		public void printResult(boolean val, String input) {
			if (val)
				System.out.println(" " + input + " is Valid");
			else
				System.out.println(" " + input + " is Invalid");
		}

	}

