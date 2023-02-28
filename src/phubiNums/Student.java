package phubiNums;

public class Student extends Person{
	
	private double gpa;
	private String major;
	
	public Student() {
		super();
		this.gpa = 0;
		this.major = "";
	}
	public Student(String firstName, String lastName, String email, String gender, int age, double gpa, String major) {
		super(firstName, lastName, email, gender, age);
		this.gpa = gpa;
		this.major = major;
	}
	public double gpa() {
		return gpa;
	}
	public void gpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public void addname(String major1) {
		major.(major1);
	}
	public String toString() {
		return "Student: " + super.toString() + "gpa: " + gpa + "major: " + major; 
	}

}
