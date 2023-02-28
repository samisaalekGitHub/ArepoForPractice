package firstClass;
import java.util.Scanner;
public class Lab {
 public static void main(String [] arg ) {
	 
	 String firstname = "samiullah";
		String lastname = "saalek";
			
		System.out.println(firstname.length());
		System.out.println(lastname.length());
			if(firstname.length() > lastname.length()) {
				System.out.println("first name is lpnger");
				System.out.println("firstname \"" + firstname +  "\"  with " + firstname.length()
				+ " lastname \"" + lastname + "\" with " + lastname.length());
			}else {
				System.out.println("last name is longer");
				
				System.out.println("----------------------");
				
			}System.out.println("----------------------");
	
			Scanner mc = new Scanner(System.in);
			System.out.println("enter first name");
			
			String iput1 = mc.next();
			
			if(firstname.length() > lastname.length()) {
				System.out.println("firstname\"" +  firstname.length() + "\"  greater than  " + "lastname\"" +
			 lastname.length());
			}System.out.println("enter last name");
			String input2 = mc.next();
			
			if(lastname.length() > firstname.length()) {
				System.out.println("lastname \"" + lastname +  "\"  with " + lastname.length()
				+ " firstname \"" + firstname + "\" with " + firstname.length());
			}
			
	 
	 
	 
	 
	 
	 
 }
}
