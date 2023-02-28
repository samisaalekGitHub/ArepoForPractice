package classObject;

public class Book {
	
	String title;
	String genre;
	String author;
	String issueDate;
	double version;
	String iSBN;
	double price;
	String publisher;
	int pageQty;
	
	public Book() {
		
		title = "";
		genre = "";
		author = "";
		issueDate = "";
		version = 0;
		iSBN = "";
		price = 0;
		publisher = "";
		pageQty = 0;
	}
	
	public Book (String newTitle, double newPrice, String newGenre, double newversion, String newiSBN, int newpageQty) {
		
		this.title = newTitle;
		this.genre = newGenre;
		author = "";
		issueDate = "";
		version = newversion;
		iSBN = newiSBN;
		price = newPrice;
		publisher = "";
		pageQty =newpageQty;
	}
	
	public Book(String newTitle, String newGenre, String newAuthor, String newIssueDate, double newVersion,
			String newISBN, double newPrice, String newPublisher, int newPageQTY) {
		title = newTitle;
		genre = newGenre;
		author = newAuthor;
		issueDate = newIssueDate;
		version = newVersion;
		iSBN = newISBN;
		price = newPrice;
		publisher = newPublisher;
		pageQty = newPageQTY;
	}

	// printing something in the console IS NOT same as return
	public int sum(int a, int b, int c) {
		int temp = a + b + c;
		System.out.println("Result of Sum() " + temp);
		return temp;
	}

	public void printTitle() {
		System.out.println("title: " + title);
	}

	public void printBookInfo() {
		String line1 = "Title: " + title + " By: " + author + ", ISBN: " + iSBN + ", Price: $" + price;
		String line2 = "Genre: " + genre + ", Issed: " + issueDate + ", Version: " + version;
		String line3 = "Publisher: " + publisher + ",  Number of Pages: " + pageQty;
		System.out.println(generateDashes(findLongestLength(line1, line2, line3)));
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(generateDashes(findLongestLength(line1, line2, line3)));
	}

	// return n number of -
	// given 5 result: -----
	public String generateDashes(int n) {
		String res = "";
		for (int i = 0; i < n; i++) {
			res += "-";
		}
		return res;
	}

	// find the longest length among 3 given Strings
	public int findLongestLength(String s1, String s2, String s3) {
		int res = s1.length();
		if (s2.length() > s1.length()) {
			res = s2.length();
		}
		if (s3.length() > res) {
			res = s3.length();
		}
		return res;
	}



}
