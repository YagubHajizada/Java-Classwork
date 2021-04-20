package com.rcs.classwork.Day22;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;

    public Book(String name, Author[] authors) {
        this.name = name;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    private String authorsToString() {
        String result = "";
        for(int i = 0; i < authors.length; i++) {
            result += authors[i].toString() + (i < authors.length - 1 ? ", " : "");
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Book: %s\nAuthor: %s", name, authorsToString());
    }
}