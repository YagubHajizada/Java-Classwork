package com.rcs.classwork.Day21.customerAccounts;

import com.rcs.classwork.Day21.HelperClases.AccountStorage;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Program {
    private final static String fileName = "accounts";

    public static void displayAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void main(String[] args) {
        List<Account> accountList = AccountStorage.readFromFile(fileName);
        displayAccounts(accountList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veiciet kontu ievadi.");
        int id = 1;
        if (accountList.size() > 0) {
            id = accountList.get(accountList.size() - 1).getId() + 1;
        }
        while(true) {
            System.out.print("IBAN: ");
            String IBAN = scanner.nextLine();
            System.out.print("Klienta vārds: ");
            String name = scanner.nextLine();
            System.out.print("Klienta uzvārds: ");
            String surname = scanner.nextLine();
            System.out.print("Klienta dzimšanas datums (YYYY-MM-DD): ");
            String dateInput = scanner.nextLine();
            System.out.print("Konta bilance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            accountList.add(new Account(id, IBAN,
                    new Customer(id, name, surname, LocalDate.parse(dateInput)),
                    balance));
            id++;

            System.out.print("Turpināt? (N):");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("N")) {
                break;
            }
        }

        displayAccounts(accountList);
        for(Account account : accountList) {
            account.deposit(10);
            account.withdraw(19.99);
            if (account.getId() == 1) {
                account.deposit(50);
            }
            System.out.println(account);
        }
        AccountStorage.saveToFile(accountList, fileName);
    }
}