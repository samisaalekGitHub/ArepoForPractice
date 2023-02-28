package loopsClasses;

public class Cheacking {

	public static void main(String[] args) {

		int size = 8;
		int count = 1;
		String[] triangle = new String[size * 2 - 1];
		String tempLine = "";

		for (int c = 0; c < count; c++) {
			int line = 0;
			for (int i = 1; i <= size; i++) {
				for (int j = i; j < size; j++) {
					tempLine += " ";
				}
				for (int j = i; j > 0; j--) {
					tempLine += "* ";
				}
				for (int j = i; j < size; j++) {
					tempLine += " ";
				}
//				tempLine += "\n";
				// end of the line
				triangle[line++] = tempLine;
				tempLine = "";
			}
			for (int i = size - 1; i > 0; i--) {
				for (int j = i; j < size; j++) {
					tempLine += " ";
				}
				for (int j = i; j > 0; j--) {
					tempLine += "* ";
				}
				for (int j = i; j < size; j++) {
					tempLine += " ";
				}
//				tempLine += "\n";

				// end of the line
				triangle[line++] = tempLine;
				tempLine = "";
			}
		}
		for (int i = 0; i < (size * 2 * count); i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int j = 0; j < triangle.length; j++) {
			for (int k = 0; k < count; k++) {
				System.out.print(triangle[j]);
			}
			System.out.println();
		}
		for (int i = 0; i < (size * 2 * count); i++) {
			System.out.print("-");
		}
	}
}
