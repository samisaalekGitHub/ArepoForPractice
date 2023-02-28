package classObject2;

public class Running {

	public static void main(String[] args) {
		
		Personality p1 = new Personality();
		// System.out.println(p1.firstname);
		// System.out.println(p1.lastname);
		// System.out.println(p1.fathername);
		
		Personality p2 = new Personality("sami", "saalek", "malang", "pangsad family", " 12th A", 13, 43);
		
		//System.out.println(p2.firstname +"  "+ p2.lastname +" "+ p2.fathername + " "+ p2.address );
		
		int x = p1.sum(12, 23, 22);
		//System.out.print(x);
		
		double y = p1.total(12, 11, 10);
		System.out.println("total: " + y);
		
		String me = p2.me( null, null, null);
		//System.out.println(me + " ");
		//System.out.println();

		p1.printFirstname();
		p2.printFirstname();
		
		p1.printlastname();
		p2.printlastname();
		
		p2.info();
		
		String r = p2.gnerate(5);
		System.out.println(r);
		
		int longi = p2.longest(r, r, me);
		System.out.println(longi);
		
	}

}
