package oopp1;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double sumToWithdraw) {
		if(balance >= sumToWithdraw) {
			balance -= sumToWithdraw;
		} 
	}
	public String toString() {
		return super.toString() + " Savings account";
	}
}