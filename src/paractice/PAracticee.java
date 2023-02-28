package paractice;
import java.util.Random;
public class PAracticee {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int start = 0;
		int end = 10;
		int count = 0;
		int exvalue = 10;
		int atcount = 0;
		
		while (count < exvalue ) {
			int expect = rand.nextInt(end - start + 1) + start;
			count++;
			System.out.println(count + "-   " + expect);
			atcount++;
		}
		System.out.println(atcount + "     " + exvalue);
		System.out.println("this is my edit from githup")
		 
		

	}

}
