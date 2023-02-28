package loopsClasses;

import java.util.Scanner;

public class Rreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = (int) (Math.random() * 50);
		int guess = 0;
		Scanner scaner = new Scanner(System.in);
		
		do { 
			if(guess > random) {
				System.err.println("go down");
			}else if(guess < random) {
				System.err.println("go up");
			}
			
			System.out.println("guess a number: ");
			 guess = scaner.nextInt();
			
		}while(guess != random);
		scaner.close();
		System.err.println("well done !");

	}

}
