package com.rcs.classwork.Day22;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*        String[] array = new String[1];
        array[0] = "Kristaps";*/

/*        int[] array = new int[2];
        array[0] = 1;
        array[0] = 2;*/

/*        Author[] autori = {
                new Author("Kristaps", "Krumins"),
                new Author("Kristine", "Krastina")
        };*/

/*        Scanner scanner = new Scanner(System.in);
        String gramatasNosaukums = scanner.nextLine();
        Author[] authors = new Author[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            Gender genderValue = Gender.valueOf(gender.toUpperCase());
            authors[i] = new Author(name, surname, genderValue, "");
        }
        scanner.close();*/

        //Book gramata1 = new Book(gramatasNosaukums, authors);

        Book gramata1 = new Book("Mana gramata", new Author[] {
                new Author("Kristaps", "Krumins"),
                new Author("Kristine", "Krastina", GenderEnum.FEMALE, "Latvija", LocalDate.of(1990, 4, 5)),
                new Author("Janis", "Berzins", GenderEnum.MALE, "Latvija")
        });

        StoreItem bookItem1 = new BookItem(2.49, 10, gramata1);
        //System.out.println(bookItem1);

        StoreItem bookItem2 = new BookItem(10.99, 23,
                new Book("Some Book", new Author[] {
                        new Author("Janis", "Berzins")
                }));
        //System.out.println(bookItem2);

        BookStore store = new BookStore(new Address("Latvija", "Riga", "Brivibas", 20),
                "29313515");
        store.addStoreItem(bookItem1);
        store.addStoreItem(bookItem2);
        store.addStoreItem(new NotebookItem(0.99, 80, 60, "20x10 cm", NotebookType.LINES));
        store.addStoreItem(new BookItem(50.99, 124, new Book("Darga gramata",
                new Author[] {
                        new Author("Autora", "Vardins")
                })));
        store.addStoreItem(new NotebookItem(1.20, 192, 100, "20x19 cm", NotebookType.RULED));
        System.out.println(store);

        // Izejam cauri visiem BookStore items un
        // pieskaitām kvantitāti katram item random robežā no 1 līdz 10 ieskaitot
        // Iegūstam sarakstu ar StoreItems: store.getStoreItems()
        // item.increaseQuantity(count), kur count random (1-10)

        Random rnd = new Random();
        for(StoreItem item : store.getStoreItems()) {
            item.increaseQuantity(rnd.nextInt(10) + 1);
        }
        System.out.println(store);
    }
}