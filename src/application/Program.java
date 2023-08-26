package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is the value of the dollar? ");
		double dollarValue = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double purchaseValue = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollarValue, purchaseValue);
		
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		
		
		sc.close();

	}

}
