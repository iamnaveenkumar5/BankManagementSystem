package Com.Bank;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> accounts;
	private int accountCounter;

	public Bank() {
		accounts = new ArrayList<>();
		accountCounter = 1;
	}

	public void addAccount(String accountHolderName, double initialBalance) {
		BankAccount account = new BankAccount(accountCounter, accountHolderName, initialBalance);
		accounts.add(account);
		System.out.println("Account Created Successfully!");
		displayAccountInfo(account);
	}

	public void closeAccount(int accountNumber) {
		for (BankAccount account : accounts) {
			if (account.getAccountnumber() == accountNumber) {
				accounts.remove(account);
				System.out.println("Account closed successfully!");
				return;
			}
		}
		System.out.println("Account not found!");
	}
	public BankAccount findAccount(int accountNumber) {
		for (BankAccount account : accounts) {
			if (account.getAccountnumber() == accountNumber) {
				return account;
			}
		}
		return null;

	}
	public void displayAccountInfo(BankAccount account) {
		System.out.println("Account number: " + account.getAccountnumber());
		System.out.println("Account Holder: " + account.getAccountHolderName());
		System.out.println("Initial Balance: $" + account.getBalance());
	}
}
