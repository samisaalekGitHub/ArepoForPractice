package phubiNums;

import java.util.ArrayList;
public class Instructor extends Person {
	
	private ArrayList<String> subjects;
	
	public Instructor() {
		super();
		 subjects = new ArrayList<String>();
	}
	public Instructor(String firstName, String lastName, String email, String gender, int age) {
		super(firstName, lastName, email, gender, age);
		subjects = new ArrayList<String>();
	}
	public ArrayList<String> getsubject() {
		return subjects;
	}
	public void setsubject(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	public void addsubject(String subject) {
		subjects.add(subject);
	}
	@Override
	public String toString() {
		return "instructor: " + super.toString() + "  subjects: " + subjects;
	}

}
