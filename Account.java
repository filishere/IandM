package oopp1;

import java.util.Date;

public class Account {
	private int id;
	protected double balance;
	private static double yearInterestRate = 4.5;
	private Date dateCreated = new Date();
	
	Account(){

	}
	Account (int id, double balance){
		this.setId( id) ;
		this.setBalance(balance);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getYearInterestRate() {
		return yearInterestRate;
	}

	public static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}
	public void withdraw(double sumToWithdraw){
		balance -= sumToWithdraw;
	}
	public void deposit(double sumToDeposit){
		balance += sumToDeposit;
	}
	
	public String toString() {
		return "Balance: " + balance;
	}
}
