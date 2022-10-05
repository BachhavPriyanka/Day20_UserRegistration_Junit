package day20_userRegistrationJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSample {
		public static void main(String[] args) {
			EmailSample userEntry = new EmailSample();
			userEntry.testMails();
		}

		public void validateEntries() {
			System.out.println("Enter Email Id : ");
			validateEmail(getUserInput());

		}

		public String getUserInput() {
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}
		
		public void testMails() {
			validateEmail("abc@yahoo.com");
			validateEmail("abc");
			validateEmail("abc-100@yahoo.com");
			validateEmail("abc@.com.my");
			validateEmail("abc.100@yahoo.com");
			validateEmail("abc123@gmail.a");
			validateEmail("abc111@abc.com");
			validateEmail("abc123@.com");
			validateEmail("abc-100@abc.net");
			validateEmail("abc123@.com.com");
			validateEmail("abc.100@abc.com.au");
			validateEmail(".abc@abc.com");
			validateEmail("abc@1.com");
			validateEmail("abc()*@gmail.com");
			validateEmail("abc@gmail.com.com");
			validateEmail("abc@%*.com");
			validateEmail("abc+100@gmail.com");
			validateEmail("abc..2002@gmail.com");
			validateEmail("abc.@gmail.com");
			validateEmail("abc@abc@gmail.com");
			validateEmail("abc@gmail.com.1a");
			validateEmail("abc@gmail.com.aa.au");
		}
		
		public void validateEmail(String input) {

			String email = "^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";

			System.out.println("Validating");
			match(email, input);
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
