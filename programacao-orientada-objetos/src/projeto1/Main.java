package projeto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int number2 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int number3 = sc.nextInt();

        int higher = max(number1, number2, number3);

        showResult(higher);

        sc.close();
    }
    public static int max(int a, int b, int c) {
        int aux = 0;
        if (a > b && a > c) {
            aux = a;
        } else if (b > a && b > c) {
            aux = b;
        } else if (c > a && c > b) {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int higher) {
        System.out.println("Higher: " + higher);
    }

}
