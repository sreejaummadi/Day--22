package com.codegnan.oopexamples;

public class BankAccount {
	double initialbalance;
	public BankAccount(double initialbalance) {
		super();
		this.initialbalance = initialbalance;
	}
	public void deposit(double amount) {
		initialbalance+=amount;
		System.out.println("Amount Deposited by cash : "+amount);
	}
	public void deposit(double amount,String Cheque_number) {
		initialbalance+=amount;
		System.out.println("Amount Successfully Deposited"+amount+"via cheque Number :"+Cheque_number);
	}
	public void deposit(double amount ,String TransactionID,String BankName) {
		initialbalance+=amount;
		System.out.println("Amount Deposited"+amount);
		System.out.println("Bank Name "+BankName+"with transaction id is :"+TransactionID);
	}
	public void showBalance() {
		System.out.println("Current Account Balance: "+initialbalance);
	}
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(50000);
		b1.deposit(30000);
		b1.deposit(400000,"ID3456");
		b1.deposit(5000,"TID234556","HDFC");
		b1.showBalance();

	}

}
