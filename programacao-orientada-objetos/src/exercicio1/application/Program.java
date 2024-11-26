package exercicio1.application;

import exercicio1.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        double amount = CurrencyConverter.converter(price, quantity);

        System.out.printf("Amount to be paid in reais = %.2f%n", amount);

        sc.close();
    }
}
