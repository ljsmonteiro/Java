package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be brought? ");
		double dollarBrought = sc.nextDouble();
		
		double valor = CurrencyConverter.cconverter(dollarBrought, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", valor);
				
		sc.close();

	}

}
