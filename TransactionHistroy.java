package com.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
public class TransactionHistroy<Transaction> 
{
	
	
	
	private String transactionType;
	private double amount;
	private String time;
	
	public TransactionHistroy(String transactionType, double amount) {
		
		this.transactionType = transactionType;
		this.amount = amount;
		this.time=generatetime();
	}
public String generatetime()
{
	SimpleDateFormat time=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date date=new Date();
	
	return time.format(date) ;
	
}
	

	

	public String getTransactionType() {
		return transactionType;
	}

	

	public double getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return " [" + transactionType + ", $" + amount + ", " + time + "]";
	}

	
	

	
	
	

}
