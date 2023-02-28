package secondClass;

import java.util.Random;
public class Randomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		int a = 10;
		int b = 20;
		int c = r.nextInt(b - a +1) + a;
		
		System.out.println(r.nextInt(b - a + 1) + a);
		System.out.println(c);
		System.out.println(r.nextInt(a) + b);

	}

}
