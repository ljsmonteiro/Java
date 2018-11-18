package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.println("Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Nota Primeiro Semestre - 30 pontos: ");
		aluno.s1 = sc.nextDouble();
		System.out.println("Nota Segundo Semestre - 35 pontos: ");
		aluno.s2 = sc.nextDouble();
		System.out.println("Nota Terceiro Semestre - 35 pontos: ");
		aluno.s3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",aluno.media());
		
		if (aluno.media() >= 60)
			System.out.println("PASS");
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n",aluno.difMedia());
			
		}

		sc.close();
	}

}
