package com.atm;

import java.util.List;
import java.util.*;

public class Account {
	private double balance;
	private double userId;
	
	
	
	public double getUserId() {
		return userId;
	}



	public Account(double balance, double userId) {
		
		this.balance = balance;
		this.userId = userId;
	}



	
	private static List<TransactionHistroy> Transaction;

	public Account() {
		
		Account.Transaction = new ArrayList<>();
	}
	
	
public void viewBalance()
{
	System.out.println("Available Balanace:" +getBalance() + "$");
}
	public void deposite(double amount) {
		if (amount >= 0) {
			balance += amount;
			Transaction.add(new TransactionHistroy("Deposite", amount));
			System.out.println("Deposite Successfully" + " " + amount + "$");
			viewBalance();
		} else {
			System.out.println("Invalid Deposite amount");
		}
	}

	public void withdraw(double amount) {
		if (amount >= 0 && amount <= balance) {
			balance -= amount;
			Transaction.add(new TransactionHistroy("withdraw", amount));
			System.out.println("Withdraw Successfully" + " " + amount + "$");

			viewBalance();
		} else {
			System.out.println("Invalid Withdraw amount");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static List<TransactionHistroy> getTransaction() {
		return Transaction;
	}

	public static void display() {
		List<TransactionHistroy> transactions = Account.getTransaction();
		
		for (TransactionHistroy transaction : transactions) {
			System.out.println(transaction);
		}

	}



	
}
