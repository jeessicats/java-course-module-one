package projeto4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original = "abcd EFGHI jklmn OPQRS tuvw XYZ   ";

        String minuscula = original.toLowerCase();
        String maiuscula = original.toUpperCase();
        String semEspaco = original.trim();
        String comecaE = original.substring(4);
        String comecaEterminaS = original.substring(4, 22);
        String trocar = original.replace("E", "F");

        System.out.println("Original: " + original + ".");
        System.out.println("Minuscula: " + minuscula + ".");
        System.out.println("Maiuscula: " + maiuscula + ".");
        System.out.println("Sem Espaco: " + semEspaco + ".");
        System.out.println("Comeca E: " + comecaE + ".");
        System.out.println("Comeca em E termina em S: " + comecaEterminaS + ".");
        System.out.println("Troca E por F: " + trocar + ".");

        String listaCompras = "potato apple lemon blueberry";
        String[] vect = listaCompras.split(" ");
        System.out.println(Arrays.toString(vect));
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
