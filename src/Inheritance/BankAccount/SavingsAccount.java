package Inheritance.BankAccount;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public void withdraw(double draw) {
		if( getBalance() - draw <= 100) {
			System.out.println("Minimum balance of 100 required!");
		} else {
			super.withdraw(draw);
		}
	}

}
