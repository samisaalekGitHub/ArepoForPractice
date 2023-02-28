package firstClass;
import java.util.Scanner;
public class SecendClass {
      public static void main(String[] args) {
    	
    	  
    	  Scanner sc = new Scanner(System.in);
    	  String firstinput = sc.nextLine();
    	  String secondinput = sc.next();
    	  
    	  if(firstinput.length() > secondinput.length()) {
    		  System.out.println("first input is longer");
    		  System.out.println("add another input");
    	  }else {
    		  System.out.println("second input is longer");
    	  }
    	  
    	  
    	  


    	
    	  

      }
}
