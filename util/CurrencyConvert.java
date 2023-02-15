package util;

public class CurrencyConvert {

	public static final double IOF = 0.06;

	public static double ConvertDollar(double amount, double dollarPrice) {

		return amount * dollarPrice * (1.0 + IOF);
	}

}
