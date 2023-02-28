package loopsClasses;

public class Foreach {
	public static void main(String[] args) {
		
		String[][] numse ={
				{"Usa", "Afghanistan","China"},
				{"San","mMan"},
				{"Jan","NAmd", "Hil"}
				};
		
		for(int row = 0; row < numse.length ; row++) {
			for(int col = 0; col< numse[row].length; col ++) {
				System.out.print(numse[row][col] + "   ");
			}
			System.out.println();
		}
		
		int random = (int) (Math.random() * 20);
		

	}
}
