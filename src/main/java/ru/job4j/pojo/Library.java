package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("Java core", 500);
        Book book3 = new Book("C++", 1001);
        Book book4 = new Book("Build OOP", 300);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Name: " + books[index].getNameBook()
                    + " page:" + books[index].getCountPage());
        }
        books[0] = books[3];
        books[3] = book1;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Name: " + books[index].getNameBook()
                    + " page:" + books[index].getCountPage());
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index].getNameBook().equals("Clean code")) {
                System.out.println("Name: " + books[index].getNameBook()
                        + " page:" + books[index].getCountPage());
            }
        }
    }
}
