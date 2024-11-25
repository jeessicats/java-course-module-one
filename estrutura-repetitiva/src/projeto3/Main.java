package projeto3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = (9.0*C)/(5.0) + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir (s/n)?");
            op = sc.next().charAt(0);
        } while (op != 'n');

        sc.close();
    }
}
