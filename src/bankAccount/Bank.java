package bankAccount;

public class Bank {
	
	String firstName;
	String lastName;
	String phone;
	String email;
	
	String accountNum;
	double balance;
	
	public Bank() {
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
		
		accountNum = "";
		balance = 0;
	}
	public Bank(String firstName, String lastName, String phone, String email, String accountNumber,
			double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		
		this.accountNum = accountNumber;
		this.balance = balance;
	}
	public double cheakbalance (double amount) {
		System.out.println("Account#: " + accountNum + " Full Name: " + firstName + " " + lastName
				+ " - Current balance: $" + balance);
		
		return balance;
	}

}
