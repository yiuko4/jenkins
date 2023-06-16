package Exercice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryIntegrationTest {
    private Library library;
    private User user;
    private Book book;

    @BeforeEach
    public void setup() {
        library = new Library();
        user = new User("Oinou");
        book = new Book("La vie et la mort", "Michelle");

        library.addBook(book);
    }

    @Test
    public void testBorrowBook() {
        assertTrue(library.isBookAvailable(book), "dispo");

        library.borrowBook(book, user);

        assertFalse(library.isBookAvailable(book), "livre pas dispo bro");

        assertTrue(user.getBorrowedBooks().contains(book), "dispo mon poto");
    }
}
