package Encapsulation;

public class BankAccount {
	
	private int accountNumber;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int setAccountNumber(int accountNumber)	{
		return this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double setBalance(double balance) {
		return this.balance = balance;
	}

}
