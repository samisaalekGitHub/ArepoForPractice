package secondClass;
import java.util.Random;
public class Practice002 {

	public static void main(String[] args) {

		String day = "Sat";
		
		switch (day.toUpperCase()) {
		case "Sat":
			System.out.println("this is satarday");
		case "sun":
			System.out.println("this is sunday");
		case "mon":
			System.out.println("this is sandany");
		case "teu":
			System.out.println("this is monday");

		default:
			System.out.println("friday");
		}
		
		System.out.println("-----------------------");
		
		String gender1 = "female";
		
		switch (gender1) {
		case "male":
			System.out.println("this is male");
			break;
		case "female":
			System.out.println("this is female");
			break;
		default:
			System.out.println("incorrect data");
		}
		System.out.println("-----------------------");
		
		String gender = "male";

		switch (gender.toLowerCase()) {
		case "male":
			System.out.println("Gender is male");
			break;
		case "female":
			System.out.println("Gender is female");
			break;
		default:
			System.out.println("Wrong value");
			break;
		}
		
		System.out.println("-----------------------");
		
		Random raw = new Random();
		
		int start = 10;
		int end = 20;
		
		int res = raw.nextInt(end - start) + 5;
		System.out.println(res);
		
		
	}

}
