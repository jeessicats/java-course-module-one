package vectors2.application;

import vectors2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number of elements for the vector: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            sc.nextLine();
            System.out.println("Type the name of the product: ");
            String name = sc.nextLine();
            System.out.println("Type the price of the product: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
         }

        double sum = 0;

        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }

        double average = sum / products.length;

        System.out.printf("The average price is: %.2f%n", average);

        sc.close();
    }
}
