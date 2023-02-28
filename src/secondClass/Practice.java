package secondClass;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.println("text is:");
		String car = "";
		String text = mc.next();
		System.out.println("age is: ");
		int age = mc.nextInt();
		
		if (age < 30 && age > 18 && text == car) {
			System.out.println("you are eligible for discount");
			
			System.out.println("price is: ");

			double price = mc.nextDouble();

			System.out.println("details: ");

			System.out.println("text is: " + text);
			System.out.println("age is: " + age);
			System.out.println("price is: " + price);
			System.out.println(" payable price is: " + (price - (price * 0.3)));


		} else {
			System.out.println("you are not eligible for discount");
			
			System.out.println("price is: ");

			double price = mc.nextDouble();

			System.out.println("details: ");

			System.out.println("text is: " + text);
			System.out.println("age is: " + age);
			System.out.println("price is: " + price);
			System.out.println(" payable price is: " + price);

			
		}
		mc.close();

	}

}
