package firstClass;

import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		
		Scanner mc = new Scanner(System.in);
		
		String email = "sami@gmail.com";
		String password = "sami123";
		
		System.out.println("please enter your email:");
		
		String input = mc.next();
		
		if(email.equals(input)) {
			System.out.println("correct email");
			
			System.out.println("enter your password");
			String input2 = mc.next();
			
			if(password.equals(input2)) {
				System.out.println("correct password");
			}else {
				System.out.println("wrong password");
			}
		}else {
			System.out.println("incorrect email");
		}
		
	
				

	}

}
