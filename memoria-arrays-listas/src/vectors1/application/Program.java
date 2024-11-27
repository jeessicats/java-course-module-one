package vectors1.application;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(vector));

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }

        System.out.printf("Average: %.2f%n", sum/n);
        sc.close();
    }
}
