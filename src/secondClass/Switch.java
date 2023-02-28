package secondClass;
import java.time.LocalDate;
public class Switch {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println("Month is " + date.getMonth().name());
		
		int month = date.getMonthValue();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("its winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("its spiring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("its summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("its fall");
			break;
			default:
				System.out.println("false number");
				
		}

	}

}
