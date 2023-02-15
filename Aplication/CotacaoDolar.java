package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvert;

public class CotacaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cotação atual do dolar americano");
		double dollarPrice = sc.nextDouble();
		System.out.println("Digite a quantia que deseja compra:");
		double amount = sc.nextDouble();

		System.out.printf("Valor a ser pago em reais: %.2f%n", CurrencyConvert.ConvertDollar(amount, dollarPrice));

		sc.close();

	}

}
