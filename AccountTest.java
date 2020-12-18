package oopp1;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount account1 = new SavingsAccount(3407, 1000);
		CheckingAccount account2 = new CheckingAccount(21900, 9000, 5000);
		account1.withdraw(200);
		System.out.println(account1.getId() + ": \n" + account1.toString());
		account2.withdraw(500);
		System.out.println(account2.getId() + ": \n" + account2.toString());
		account2.deposit(200);
		System.out.println(account2.getId() + ": \n" + account2.toString());
	}

}