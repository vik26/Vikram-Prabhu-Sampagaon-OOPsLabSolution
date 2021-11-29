package email_Application;

import java.util.Scanner;

public class DriverClass {
	public static Scanner scanner = new Scanner(System.in);
	public static Employee employee = new Employee("Vikram", "Sampagaon"); 
	public static CredentialService credentialService = new CredentialService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 displayMenu();
		 int userChoice = scanner.nextInt();
			String emailAddress = "";
			String password = "";
			switch(userChoice) {
			case 1: emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "Tech");
			password = credentialService.generatePassword();
			break;
			
			case 2: emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "adm");
			password = credentialService.generatePassword();
			break;
			
			case 3: emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
			password = credentialService.generatePassword();
			break;
			
			case 4: emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "lg");
			password = credentialService.generatePassword();
			break;
			
			default: System.out.println("Invalid choice");
			
			}
			
			System.out.println(emailAddress);
			System.out.println(password);
 
	}
	private static void displayMenu() {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");		
		
	
	
	}
}

