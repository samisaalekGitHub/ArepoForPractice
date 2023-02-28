package bankAccount;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount user1 = new BankAccount();
		System.out.println(user1.address);
		
		BankAccount user2 = new BankAccount("kabul", "hanzala");
		//System.out.println(user2.address);
		
		user2.printInfo();
		user1.printInfo();

	}

}
