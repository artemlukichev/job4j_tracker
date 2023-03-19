package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("First", 100);
        Book second = new Book("Second", 200);
        Book third = new Book("Third", 300);
        Book fourth = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        Book swap = books[0];
        books[0] = books[3];
        books[3] = swap;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }

    }
}
