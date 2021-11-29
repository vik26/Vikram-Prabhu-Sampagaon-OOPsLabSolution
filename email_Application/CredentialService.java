package email_Application;

import java.util.Random;
import java.util.Scanner;

public class CredentialService {
	
	public static String generateEmailAddress(String firstName , String lastName , String department) {
			return firstName+lastName+"@"+department+"abc.com";
	}

	public String generatePassword() {
		String numbers = "1,2,3,4,5,6,7,8,9,0";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$%^&*()<>?:";
		String values = numbers + smallLetters + capitalLetters +specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		for (int i=0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password.toString();
	}
	
	}
	

