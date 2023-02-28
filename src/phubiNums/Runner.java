package phubiNums;

public class Runner {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Admin", 132, "Jack", "Ma", "jack@gmail.com", "Male", 35);
		Student obj2 = new Student("David", "Jackson", "david@gmail.com", "Male", 28, 3.8, "CS");
		Instructor obj3 = new Instructor("Anna", "Davidson", "anna@gmail.com", "Female", 30);
		
		obj3.addsubject("history");
		obj2.setLastName("saalek");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	
	}

}
