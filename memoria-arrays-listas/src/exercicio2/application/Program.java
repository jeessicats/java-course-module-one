package exercicio2.application;

import exercicio2.entities.Guest;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    private static int[] Guest;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Guest[] rooms = new Guest[10];
        System.out.println("There are 10 rooms available (numbered 0 to 9).");
        System.out.println("How many rooms would you like to use? ");

        int number = sc.nextInt();
        sc.nextLine();

        // Registro dos aluguéis
        for (int i = 0; i < number; i++) {
            System.out.println("Rent #" + i + ": ");
            System.out.println("Enter guest name: ");
            String guestName = sc.nextLine();
            System.out.println("Enter guest e-mail: ");
            String guestEmail = sc.nextLine();
            System.out.println("Enter room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            if (rooms[roomNumber] == null) {
                rooms[roomNumber] = new Guest(guestName, guestEmail);
            } else {
                System.out.println("Room number " + roomNumber + " is busy.");
            }
        }

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println("Rooms " + i + ": " + rooms[i]);
            }
        }
        sc.close();
    }
}
