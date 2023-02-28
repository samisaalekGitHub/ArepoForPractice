package classObject2;

public class Personality {

	String firstname;
	String lastname;
	String fathername;
	String address;
	String classes;
	int chairNum;
	int classNum;

	public Personality() {
		firstname = "samiullah";
		lastname = "saalekJan";
		fathername = "malang";
		address = "khoja bughra";
		classes = "";
		chairNum = 0;
		classNum = 0;
	}

	public Personality(String fn, String ln, String fan, String add, String clases, int chair, int clas) {

		firstname = fn;
		lastname = ln;
		fathername = fan;
		address = add;
		classes = clases;
		chairNum = chair;
		classNum = clas;

	}

	public int sum(int a, int b, int c) {

		int temp = a + b + c;
		System.out.print("sum of all: ");
		return temp;
	}

	public double total(double a1, double b1, double c1) {
		double total = a1 + b1 + c1;
		System.out.println();
		return total;
	}

	public String me(String name, String fname, String lname) {
		String me = firstname + "   " + lastname + "  " + fathername;
		return me;

	}
	
	public void printFirstname () {
		System.out.println("title: " + firstname);
	}
	public void printlastname () {
		System.out.println( "lastname "+lastname);
	}
	
	public void info () {
		String line1 = "name  " + firstname +"  lastname  "+ lastname + "this is the best string";
		String line2 = "f/name  " + fathername + "  address  " + address;
		String line3 = "clas  " + classes + "  class#  " + classNum;
		System.out.println(line1 + " " + line2 + " " + line3);
		
		System.out.println(gnerate(longest(line1, line2, line3)));
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(gnerate(longest(line1, line2, line3)));
		
	}
	
	public String gnerate (int n) {
		String res = "";
		for(int i = 0; i < n ; i++) {
			res += "-";
		}
		return res;
	}
	
	public int longest (String s1, String s2, String s3) {
		int longe = s1.length();
		if(s2.length() > s1.length()) {
			longe = s2.length();
		}
		if(s3.length() > longe) {
			longe = s3.length();
		}
		return longe;
		
	}

}
