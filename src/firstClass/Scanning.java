package firstClass;


import java.util.Scanner;

public class Scanning {

	public static void main(String[] args) {
		
		
		String username = "user123";
		String password = "pass123";
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your username:");
		String input = sc.next();
		
		if(username.equals(input)) {
			System.out.println("correct username");
			System.out.println("please enter your password");
			String input2 = sc.next();
			if(password.equals(input2)) {
				System.out.println("correct password");
			}else {
				System.out.println("incorrect password");
			}
			
		}else {
			System.out.println("incorrect username");
			
		}
			
	}
		
		
		

	

	
	

}
