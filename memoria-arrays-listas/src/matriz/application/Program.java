package matriz.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] + " ");
        }

        System.out.println();

        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    counter++;
                }
            }
        }
        System.out.println("Negative numbers: " + counter);
        sc.close();
    }
}
