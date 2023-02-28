package secondClass;
import java.util.Scanner;
public class WhileScaner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password = "123pass";
		System.out.println("please enter your password");
		
		String input = sc.next();
		
		while(input.equals(password) == false) {
			System.out.println("incorect password try again");
			input = sc.next();
		}
		System.out.println("correct password");

	}

}
