package Inheritance.BankAccount;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
		System.out.println("Balance is:" + balance);
	}
	
	public void withdraw(double draw) {
		if (balance >= draw) {
			balance -= draw;
			System.out.println("Balance is:" + balance);
		} else {
		System.out.println("Insufficient balance");
		}
	}
	
	public double getBalance() {
		return balance;
	}

}
