package util;

public class CurrencyConverter {
	
	public static final double iof = 6;  
	
	public static double cconverter(double qdollar, double cotdollar) {
		return qdollar * cotdollar + qdollar * cotdollar * iof / 100;
	}

}
