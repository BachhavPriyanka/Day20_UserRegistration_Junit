package day20_userRegistrationJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	
		public static void main(String[] args) {
			 Password userEntry = new Password();

			userEntry.validateEntries();
		}

		public void validateEntries() {
			System.out.println("Enter Password : ");
			validatePassword(getUserInput());

		}

		public String getUserInput() {
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}
		
		private void validatePassword(String input) {
			String password = "[0-9a-zA-Z]{8,}";
			
			System.out.println("Validating");
			match(password, input);
		}

		public void match(String regex, String input) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(input);

			printResult(match.matches(), input);
		}

		public void printResult(boolean isOk, String input) {
			if (isOk)
				System.out.println(" " + input + " is Valid");
			else
				System.out.println(" " + input + " is Invalid");
		}

	}
