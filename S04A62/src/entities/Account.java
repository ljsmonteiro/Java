package entities;

public class Account {
	
	private String accountNumber;
	private String accountName;
	private double accountValue;
	
	public static final double tax = 5.00;
	
	public Account() {
	}
	
	
	public Account(String accountNumber, String accountName, double accountValue) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		addValue(accountValue);
	}
	
	public Account(String accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}


	public String getAccountNumber() {
		return accountNumber;
	}

/*
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

*/
	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public double getAccountValue() {
		return accountValue;
	}

	public void addValue(double accountValue) {
		this.accountValue += accountValue;
	}
	
	public void saqueValue(double value) {
		this.accountValue = this.accountValue - value - tax;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountName
				+ ", Balance: $"
				+ String.format("%.2f", accountValue);
	}


}
