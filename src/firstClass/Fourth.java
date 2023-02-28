package firstClass;

public class Fourth {

	public static void main(String[] args) {
		
		String str = "my first time";
		String str2 = "my first time";
		String str3 = new String("test");
		System.out.println("using equal method " + str.equals(str2) );
				
		System.out.println("equals " + str ==str2);
		System.out.println(str.length());
		
		System.out.println("----------------------------");
		
		String firstName = "jack";
		String lastName = "ma";
		String email = firstName.toUpperCase() + "." + lastName.toLowerCase() + "." + "@gmail.com";
		
		System.out.println(email.toLowerCase());
		
		
		System.out.println("----------------------------");
		
		int age = 30;
				if(age > 21)
				System.out.println("eligble for discount");
				else
				System.out.println("not eligble for discont");
				
				
				
				
				
  
	}

}
