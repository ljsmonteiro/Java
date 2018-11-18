package entities;

public class Student {

	public String nome;
	public double s1, s2, s3;
	
	public double media() {
		return s1 + s2 + s3;
	}
	
	public double difMedia( ) {
		return 60 - media();
	}
	
}
