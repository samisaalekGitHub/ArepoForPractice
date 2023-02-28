package classObject;

public class Runner {

	public static void main(String[] args ) {
		
		Student obj1 = new Student ("jack");
		System.out.println(obj1.firstname);
		
		Book b1 = new Book();
		Book b2 = new Book("Harrypoter", 19.23, "History", 1.2 , "12-34-22-34", 290);
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println(b2.genre);
		System.out.println(b2.version);
		System.out.println(b2.iSBN);
		System.out.println(b2.pageQty);
		
		Book b3 = new Book("Rich Dad Poor Dad", "Business", 
				"Robert T. Kiyosaki", "1997/01/01", 1.0, "0-446-67745-0",
				29.99, "something", 336);

		
		System.out.println(b3.iSBN);
		
		int x = b3.sum(10, 5, 15);
		System.out.println(x);
		
		System.out.println("-------------------------");
		
		b1.printTitle();
		b2.printTitle();
		b3.printTitle();
		
		b3.printBookInfo();
		b1.printBookInfo();
		b2.printBookInfo();
		
		
		
		
		
	}

	

}
