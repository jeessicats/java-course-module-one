package exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many names will you type? ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data of the " + (i + 1) + " person: ");
            System.out.println("Name: ");
            names[i] = sc.next();
            System.out.println("Age: ");
            ages[i] = sc.nextInt();
            System.out.println("Height: ");
            height[i] = sc.nextDouble();
        }

        // calcular altura média
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += height[i];
        }

        double avg = sum / n;

        System.out.printf("The average height of " + n + " is %.2f%n", avg);

        //Calcular idade média pessoas com menos de 16 anos

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                count++;
            }
            }

        double percentage = (count*100.0)/n;

        System.out.printf("The percentage of person with less than 16 year old is: %.2f%%%n", percentage);

        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }
        sc.close();
    }
}
