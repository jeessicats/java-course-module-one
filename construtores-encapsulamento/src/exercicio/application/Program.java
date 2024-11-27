package exercicio.application;

import exercicio.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder name: ");
        sc.nextLine();
        String accountHolderName = sc.nextLine();
        System.out.println("There is an initial deposit? (y/n)");
        char option = sc.next().charAt(0);

        if (option == 'y') {
            System.out.println("Enter the initial deposit amount: ");
            double depositAmount = sc.nextDouble();
            account = new Account(accountNumber, accountHolderName, depositAmount);
        } else {
            account = new Account(accountNumber, accountHolderName);
        }

        System.out.println();
        System.out.println("Account details: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Update account details: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Update account details: ");
        System.out.println(account);


        sc.close();
    }
}
