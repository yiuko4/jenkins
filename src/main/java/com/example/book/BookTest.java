package com.example.book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private static List<Book> bookList() {
        return Arrays.asList(
                new Book("Book1", "Oinou", new Date(2020, 1, 1)),
                new Book("Booklette", "Ferem", new Date(2019, 2, 2)),
                new Book("Boolet", "Tamoti", new Date(2018, 3, 3))
        );
    }

    @ParameterizedTest
    @MethodSource("bookList")
    void getTitle(Book book) {
        assertEquals(book.getTitle(), book.getTitle());
    }

    @ParameterizedTest
    @MethodSource("bookList")
    void getAuthor(Book book) {
        assertEquals(book.getAuthor(), book.getAuthor());
    }

    @ParameterizedTest
    @MethodSource("bookList")
    void getPublicationDate(Book book) {
        assertEquals(book.getPublicationDate(), book.getPublicationDate());
    }
}
