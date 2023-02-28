package loopsClasses;

public class Loop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int nums = 10 ; nums <= 100 ; nums += 2) {
			System.out.println(nums);
			 sum += nums;
			 Thread.sleep(500);
			 System.out.println(sum);
		}
		
	}

}
