package Com.Bank;

import java.util.Scanner;

public class BankManagementSystem {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== Bank Management System ===");
			System.out.println("1. Open Account");
			System.out.println("2. Close Account");
			System.out.println("3. Deposit");
			System.out.println("4. WithDraw");
			System.out.println("5. Exit");
			System.out.println("Enetr your choice: ");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter Account Holder Name: ");
				String accountHolderName = scanner.next();
				System.out.println("Enter Initial Balance: $");
				double initialBalance = scanner.nextDouble();
				bank.addAccount(accountHolderName, initialBalance);
				break;
			case 2:
				System.out.println("Enter Account Number to Close: ");
				int accountNumberToClose = scanner.nextInt();
				bank.closeAccount(accountNumberToClose);
				break;
			case 3:
				System.out.println("Enter Account Number to Close: ");
				int accountNumberToDeposit = scanner.nextInt();
				System.out.println("Enter Deposit Amount: $");
				double depositAmount = scanner.nextDouble();
				BankAccount depositAccount = bank.findAccount(accountNumberToDeposit);
				if (depositAccount != null) {
					depositAccount.deposit(depositAmount);
				} else {
					System.out.println("Account not found!");
				}
				break;
			case 4:
				System.out.println("Enter Account Number to Withdraw: ");
				int accountNumberToWithDraw = scanner.nextInt();
				System.out.println("Enter Withdrawl Amount: $");
				double withdrawalAmount = scanner.nextDouble();
				BankAccount withDrawAccount = bank.findAccount(accountNumberToWithDraw);
				if (withDrawAccount != null) {
					withDrawAccount.withdraw(withdrawalAmount);
				} else {
					System.out.println("Account not found!");
				}
				break;
			case 5:
				System.out.println("Exiticing Bank Management System. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
