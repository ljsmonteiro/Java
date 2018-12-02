package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double t;
		if (numberOfEmployees > 10) {
			t = (super.getAnualIncome() * 0.14);
		}
		else {
			t = (super.getAnualIncome() * 0.16);
		}
		return t;
	}

}
