package secondClass;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int result = 0;
		String operator = "";
		
		System.out.println("please enter two value");
	
		 a = sc.nextInt();
		 b = sc.nextInt();
		 
		 System.out.println("please choose the operator: ( + - / * %)");
		
		 
		 operator = sc.next();
		 
		 if(operator.equals("+")) {
			 result = a + b;
		 }else if(operator.equals("-")) {
			 result = a - b;
		 }else if(operator.equals("*")) {
			 result = a * b;
		 }else if(operator.equals("/")) {
			 result = a / b;
		 }else if(operator.equals("%")) {
			 result = a % b;
		 }System.out.println(a + operator + b + "=" + result);
	}

}
