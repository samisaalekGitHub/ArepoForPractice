package secondClass;

import java.util.Scanner;

public class Finally16november {

	public static void main(String[] args) {

		String mc = "jack";
		String firstchar = "" + mc.charAt(0);
		firstchar = firstchar.toUpperCase();

		System.out.println(firstchar);

		String remainchar = mc.substring(1);
		remainchar = remainchar.toLowerCase();

		System.out.println(remainchar);

		System.out.println(firstchar + remainchar);

		System.out.println("--------------------------");

		int a = 10;
		int b = 5;
		int c = 15;
		boolean doubleIt = true;
		boolean x = false;

		if (doubleIt == true) {
			if (a * 2 > c) {
				System.out.println("a is bigger");
			}
			if (b * 2 > a) {
				System.out.println("b is bigger");
			}
			if (c * 2 > b) {
				System.out.println("c is bigger");
			}

		}

		else {

		}
		if (a > b) {

			System.out.println(" a is bigger");

		}
		if (b > c) {
			System.out.println(" b is bigger");

		}
		if (c > a) {
			System.out.println("c is bigger");
		}

	}

}
