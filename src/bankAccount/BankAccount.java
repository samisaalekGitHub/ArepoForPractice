package bankAccount;

import java.util.ArrayList;

public class BankAccount {
	
	String address;
	String manager;
	ArrayList <BankAccount> custumer;
	
	public BankAccount() {
		this.address = "Herat";
		this.manager = "Zaid";
		this.custumer = new ArrayList<BankAccount>();
	}
	public BankAccount(String address, String managerName) {
		this.address = address;
		this.manager = managerName;
		this.custumer = new ArrayList<BankAccount>();
		
	}
	
	public void printInfo() {
		System.out.println("manager name: " + manager);
		System.out.println("address: " + address);
		for (int i = 0 ; i < custumer.size(); i++)
		System.out.println(custumer.get(i));
		
	}
	public void addCustomer(BankAccount newCusomer) {
		custumer.add(newCusomer);
		
	}
	

}
