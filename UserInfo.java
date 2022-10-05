package day20_userRegistrationJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfo {
	public static void main(String[] args) {
			UserInfo userEntry = new UserInfo();

			System.out.println("Enter First Name : ");
			userEntry.checkFirstName(userEntry.getUserInput());
		}

		private String getUserInput() {
			Scanner sc = new Scanner(System.in);
			return sc.next();
		}

		private void checkFirstName(String input) {

			String fName = "^[A-Z][a-zA-Z]{3,}$";

			Pattern pattern = Pattern.compile(fName);
			Matcher match = pattern.matcher(input);

			System.out.println("Validating");
			printResult(match.matches(), input);

		}

		public void printResult(boolean isOk, String input) {
			if (isOk)
				System.out.println(" " + input + " is Valid");
			else
				System.out.println(" " + input + " is Invalid");
		}

	}
