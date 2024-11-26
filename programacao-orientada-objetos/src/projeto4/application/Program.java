package projeto4.application;

import projeto4.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product name: ");
        product.name = sc.nextLine();
        System.out.println("Enter product price: ");
        product.price = sc.nextDouble();
        System.out.println("Enter quantity of product in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProductToStock(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.subtractProductFromStock(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
