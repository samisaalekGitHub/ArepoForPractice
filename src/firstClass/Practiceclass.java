package firstClass;
import java.util.Scanner;
public class Practiceclass {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the month");
		int month = sc.nextInt();
		sc.close();
		
		if(month < 1 || month > 12) {
			System.out.println("invaled input");
	
		}else {
			if(month == 12 || month == 1 || month == 2) {
				System.out.println("its winter " + month);
			}else if(month == 3 || month == 4 || month == 5) {
				System.out.println("its spring " + month);
			}else if(month == 6 || month == 7 || month == 8) {
				System.out.println("its summer " + month);
			}if(month == 9 || month == 10 || month == 11) {
				System.out.println("its fall " + month);
			}
		}
		
		
		
		

	}
}
