package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		int q = 10;
		
		Rooms[] quarto = new Rooms[q];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomnumber = sc.nextInt();
			quarto[roomnumber] = new Rooms(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i=0; i<quarto.length; i++) {
			if (quarto[i] != null) {
			   System.out.println(i + ": " + quarto[i].getName() + "," + quarto[i].getEmail());
			}
		}
		
		
		
		
		sc.close();

	}

}
