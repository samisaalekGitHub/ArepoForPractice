package phubiNums;

public class Empolyer {
	
	private String name;
	private String lastname;
	private int id;
	private String position;
	private double salary;
	
	public Empolyer() {
		this.name = "";
		this.lastname = "";
		this.id = 0;
		this.position = "";
		this.salary = 0;
	}
	public Empolyer(String name, String lastname, int id, String position, double salary) {
		
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.position = position;
		this.salary = salary;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String lastname() {
		return lastname;
	}
	public void lastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "namee: " + name + ", lastname: " + lastname + ", position: " + position + ", id: " + id + ", salary: " + salary;
	}

}
