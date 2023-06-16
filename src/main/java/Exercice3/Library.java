package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean isBookAvailable(Book book) {
        return this.books.contains(book);
    }


    public void borrowBook(Book book, User user) {
        if(isBookAvailable(book)) {
            books.remove(book);
            user.getBorrowedBooks().add(book);
        }
        else {
            System.out.println("Il n'existe pas");
        }
    }
}

