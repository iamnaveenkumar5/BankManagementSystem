package Com.Bank;

public class BankAccount {
	private int accountnumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountnumber, String accountHolderName, double balance) {
		
		this.accountnumber = accountnumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	
	public int getAccountnumber() {
		return accountnumber;
	}



	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: $" + amount);
		displayBalance();
	}
	
	void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient funds!");
		}
		displayBalance();
	}
	public void displayBalance() {
		System.out.println("Current Balance: $" + balance);
	}
}
