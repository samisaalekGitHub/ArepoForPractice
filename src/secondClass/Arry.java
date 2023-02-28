package secondClass;

public class Arry {

	public static void main(String[] args) {
		
		int [][] number = new int [5][4];
		int[][] numbers = { { 84, 48, 89, 63 }, { 77, 86, 49, 49 }, { 72, 78, 22, 56 }, { 70, 98, 25, 60 },
				{ 74, 76, 85, 84 } };

//		84	48	89	63
//		77	86	49	49
//		72	78	22	56
//		70	98	25	60
//		74	76	85	84

		System.out.println("row " + numbers.length);
		System.out.println("col " + numbers[0].length);

		for (int row = 0; row < numbers.length; row++) {
			for (int colm = 0; colm < numbers[row].length; colm++) {
				System.out.print(numbers[row][colm] + " ");
//				System.out.println(row + " " + colm + " = " + numbers[row][colm]);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		int [][] num = new int[5][4];
		int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		
		System.out.println("row: " + nums.length);
		System.out.println("col: " + nums[0].length);
		
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums[0].length; col++) {
				if(col < 10) {
					System.out.println("0");
				}else {
					System.out.print(nums[row][col] + " ");
				}
				System.out.print(nums[row][col] + " ");
				
			}
			System.out.println();
		}
		
		

	}
}