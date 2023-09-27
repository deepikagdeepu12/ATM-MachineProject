package com.atm;

import java.util.*;
import java.util.Scanner;

public class AtmMainClass {

	public static void main(String[] args) {
		Account atm = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************");

		System.out.println("Welocome to ATM Machine!!");
		System.out.println("**********************");
		System.out.print("Enter the UserId:");
		double user = sc.nextDouble();
		System.out.print("Enter the Pin:");
		int pin1 = sc.nextInt();

		User u = new User(user, pin1);
		if (u.validate(12345, 1234)) {

			while (true) {

				System.out.println("1.Transcation History");
				System.out.println("2.Withdraw");
				System.out.println("3.Deposite");
				System.out.println("4.Transfer");
				System.out.println("5.Viwe Balance");
				System.out.println("6.Quit");
				System.out.println("Enter the Choice: ");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:

					List<TransactionHistroy> ts = new ArrayList<>();
					Account.display();
					break;

				case 2:
					System.out.println("Enter withdraw Amount:");
					double withdraw = sc.nextDouble();
					atm.withdraw(withdraw);

					break;

				case 3:
					System.out.println("Enter Deposite Amount: ");
					double deposite = sc.nextDouble();
					atm.deposite(deposite);
					break;

				case 4:
					 Account sender = new Account(12345, 1000.0);
				        Account receiver = new Account(7890, 500.0);
				        Transfer transfer = new Transfer(sender, receiver);
				        System.out.print("Enter the amount to transfer: $");
				        Scanner sc1 = new Scanner(System.in);
				        double transferAmount = sc1.nextDouble();
				        transfer.performTransfer(transferAmount);

				        System.out.println("Sender's Balance: $" + sender.getBalance());
				        System.out.println("Receiver's Balance: $" + receiver.getBalance());

					break;

				case 5:

					System.out.println("Available Balanace:" +atm.getBalance() + "$");

					break;
				case 6:

					System.out.println("Thank you for Using ATM! ");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please try again");

				}
			}
		}

	}

}
