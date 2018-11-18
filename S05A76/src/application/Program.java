package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++ ) {
			
			System.out.println("Employee #"+ i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employees(id, name, salary));
						
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp ==null) {
			System.out.println("The id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage =sc.nextDouble();
			emp.increaseSalary(percentage);	
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employees x : list) {
			System.out.println(x);
		}

		
		sc.close();
	}

}
