package secondClass;

public class WhileSecc {

	public static void main(String[] args) {
	
		int[] nums = new int[10];
		
		String str = "this is a test string";
		
		String[] words = str.split(" ");
		
		System.out.println(words[4]);
		
		int index = 0;
		
		while(index < words.length) {
			System.out.println(index + "      " + words[index]);
			index++;
		}
		
		
	}

}
