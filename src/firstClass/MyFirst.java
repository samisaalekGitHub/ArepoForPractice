package firstClass;
import java.time.LocalDate;
import java.util.Scanner;
public class MyFirst {

	public static void main(String[] args) {
		
		
		LocalDate todaydate = LocalDate.now();
		System.out.println(todaydate.getYear());
		System.out.println(todaydate.getDayOfMonth());
		System.out.println(todaydate.getDayOfWeek());
		System.out.println(todaydate);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("select number of day");
		
		int day = sc.nextInt();
		 day = todaydate.getDayOfWeek().getValue() + 3;
		sc.close();
		
		switch(day) {
		case 1: System.out.println("its sunday");
		break;
		case 2: System.out.println("its monday");
		break;
		case 3: System.out.println("its tuseday");
		break;
		case 4: System.out.println("its wednsday");
		break;
		case 5: System.out.println("its thursday");
		break;
		case 6: System.out.println("its friday");
		break;
		case 7: System.out.println("its satarday");
		break;
		default:
			System.out.println("invalid input");
		
		}
		
		
		
		
		

		
		
	
	

		
		
				
		
	}

}
