package Inheritance.BankAccount;

public class Main {

	public static void main(String[] args) {
        BankAccount BA1234 = new BankAccount("BA1234", 500);
        
        BA1234.withdraw(100);
        BA1234.deposit(1000);
        BA1234.withdraw(1400);
        
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 500);
        SA1234.withdraw(100);
        SA1234.deposit(1000);
        SA1234.withdraw(1400);

	}

}
