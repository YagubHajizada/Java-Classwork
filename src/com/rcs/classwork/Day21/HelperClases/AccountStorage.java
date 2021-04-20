package com.rcs.classwork.Day21.HelperClases;

import com.rcs.classwork.Day21.customerAccounts.Account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountStorage {

    public static void saveToFile(List<Account> accounts, String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(accounts);
            objectStream.close();
            fileStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static List<Account> readFromFile(String fileName) {
        List<Account> accountList = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            accountList = (ArrayList)objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (Exception ex) { }
        return accountList;
    }
}

