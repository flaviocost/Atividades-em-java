package entites;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	
	public static double converterDollarInReal (double price, double value) {
		return value * price * (1 + IOF);
		
	}
}
