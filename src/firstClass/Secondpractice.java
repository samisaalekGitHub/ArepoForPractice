package firstClass;

import java.util.Random;

public class Secondpractice {

	public static void main(String[] args) throws InterruptedException {
		int sumall = 0;

		int[][][] nums = { { { 1, 12, 2 }, { 3, 45, 4, } }, { { 5, 14, 6 }, { 7, 76, 8 } },
				{ { 9, 8, 10 }, { 11, 6, 12 } } };
		
		
		for (int table = 0; table < nums.length; table++) {
			for (int row = 0; row < nums[table].length; row++) {
				for (int col = 0; col < nums[table][row].length; col++) {
					
					
					if (nums[table][row][col] < 10) {
						System.out.print("0");
					}

					System.out.print(+ nums[table][row][col] + "  ");
					 Thread.sleep(50);
					 sumall += nums[table][row][col];

				}
				System.out.println();
				System.out.println("total:  " + sumall);

			}
		}
		System.out.println("total:  " + sumall);

	}

}
