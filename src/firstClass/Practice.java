package firstClass;

public class Practice {

	public static void main(String[] args) {
		
		double grad = 60;
		
		String rec = grad > 55 ? "true" : "false";
		System.out.println(rec);
		
		boolean x = false;
		System.out.println(!x || grad > 55 ? "yes" : "no");
		
		System.out.println("-----------------------");
		
		double grade = 54;
		String res = "";
		
		if(grade >= 90) {
			res = grade >= 95 ? "A+" : "A-";
			
		}else if(grade > 80) {
			res = grade >= 85 ? "B+" : "B-";
		}else if(grade > 70) {
			res = grade >= 75 ? "C+" : "C-";
		}else if(grade > 60) {
			res = grade >= 65 ? "D+" : "D-";
		}else if(grade > 50) {
			res = grade >= 55 ? "E+" : "E-";
		}else {
			res = "F";
		}System.out.println(res);
		
		
		
		
		
		
		
		
		
	
}
}
               