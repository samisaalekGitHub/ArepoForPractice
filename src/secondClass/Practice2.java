package secondClass;
import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String username = "";
		String firstname = "";
		String lastname = "";
		String email = "";
		String password = "";
		
		String usernameintered = "";
		String passwordintered = "";
		
		System.out.println("1. login");
		System.out.println("2. creat account");
		
		int op1 = sc.nextInt();
		if(op1 == 1) {
			System.out.println("login:");
			System.out.println("please provid username:");
			usernameintered = sc.next();
			System.out.println("please provid password:");
			passwordintered = sc.next();
			
			if(usernameintered.equals(username)) {
				if(passwordintered.equals(passwordintered)) {
					System.out.println(" pass and user are valied");
				}else
				System.out.println("pasword is invalid");
				
			}else {
				System.out.println("invaled username");
			}
			
		}else if(op1 == 2) {
			System.out.println("creat account");
			
			System.out.println("please provide user name");
			username = sc.next();
			System.out.println("please provide first name");
			firstname = sc.next();
			System.out.println("please provide last name");
			lastname = sc.next();
			System.out.println("please provide email");
			email = sc.next();
			System.out.println("please provide password");
			password = sc.next();
			
			System.out.println("please confirm your password");
			passwordintered = sc.next();
			
			if(passwordintered.equals(password)) {
				System.out.println("account sucssesfully created");
			}else {
				System.out.println("password mismatch");
			}
			//
			System.out.println("login:");
			System.out.println("please provid username:");
			usernameintered = sc.next();
			System.out.println("please provid password:");
			passwordintered = sc.next();
			
			if(usernameintered.equals(username)) {
				if(passwordintered.equals(passwordintered)) {
					System.out.println(" pass and user are valied");
				}else
				System.out.println("pasword is invalid");
				
			}else {
				System.out.println("invaled username");
			}
			//
			
		}else {
			System.out.println("your selection is not valid");
		}
			
		
		
		
	}
}
