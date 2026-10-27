package model.application; 

import java.util.Locale;
import java.util.Scanner;
import model.entities.Conta;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner red = new Scanner(System.in);
		Conta account;

		System.out.print("Enter account number: ");
		int number = red.nextInt();

		System.out.print("Enter account holder: ");
		red.nextLine();
		String name = red.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char option = red.next().toLowerCase().charAt(0);

		if (option == 'y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = red.nextDouble();
			account = new Conta(number, name, initialDeposit);
		} else {
			account = new Conta(number, name);
		}

		System.out.println("\nAccount data:");
		System.out.println(account);

		System.out.print("\nEnter a deposit value: ");
		double deposit = red.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.print("\nEnter a withdraw value: ");
		double withdraw = red.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account);

		red.close();
	}
}