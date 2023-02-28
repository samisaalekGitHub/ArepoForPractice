package secondClass;
import java.util.Scanner;
public interface Practical {
public static void main(String[] args) {
	
	Scanner re = new Scanner(System.in);
	System.out.println("month num:");
	int month = re.nextInt();
	
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
