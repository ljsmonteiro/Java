package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		String accountNumber = sc.nextLine();
		System.out.print("Enter accoung Holder: ");
		String accountName = sc.nextLine();
		
		Account conta;
		
		System.out.println("Is there an initial deposit (Y/N)? ");
		char answer = sc.next().charAt(0);
		double valor;
		
		if (answer == 'y') {
		   System.out.println();
		   System.out.print("Enter initial deposit value: ");
		   valor = sc.nextDouble();
		   conta = new Account(accountNumber, accountName, valor);
		}
		else
			conta = new Account(accountNumber, accountName);
		
		
		System.out.println();
		System.out.println("Account data: \n" + conta);

		System.out.println();
	
		System.out.print("Enter a deposit value: ");
		valor = sc.nextDouble();
        conta.addValue(valor);

		System.out.println();
		System.out.println("Updated Account data: \n" + conta);

		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
        conta.saqueValue(valor);
		
		System.out.println();
		System.out.println("Updated Account data: \n" + conta);
		
		sc.close();

	}

}
