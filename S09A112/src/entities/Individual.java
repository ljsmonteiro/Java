package entities;

public class Individual extends TaxPayer{
	
	public Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double t;
		if (super.getAnualIncome() < 20000.00) {
			t = (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
		}
		else {
			t = (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
		return t;
	}

}
