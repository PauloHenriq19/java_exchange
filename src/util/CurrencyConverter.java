package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollarValue, double purchaseValue) {
		return dollarValue * purchaseValue * (1.0 + IOF);
	}
}
