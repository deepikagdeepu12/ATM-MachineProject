package com.atm;
import java.util.*;
public class Transfer 
{
	private Account sender;
    private Account receiver;

   

	public Transfer(Account sender, Account receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public void performTransfer(double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the receiver's UserId: ");
        double receiverUserId = sc.nextDouble();

        if (receiverUserId == receiver.getUserId()) {
            if (sender.getBalance() >= amount) {
                sender.withdraw(amount);
                receiver.deposite(amount);
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Insufficient balance for the transfer.");
            }
        } else {
            System.out.println("Invalid receiver UserId.");
        }

}}
