package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class User {
    /**
     * Le nom de l'utilisateur
     */
    private String name;
    /**
     * La liste des livres emprunter par l'utilisateur
     */

    private List<Book> borrowedBooks;

    /**
     * Création d'un utilisateur avec son nom et la liste des livres emprunté
     * @param name              Le nom de l'utilisateur
     */
    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Retourne le nom de l'utilisateur
     * @return le nom de l'utilisateur
     */
    public String getName() {
        return name;
    }
    /**
     * Retournes les livres emprunter par l'utilisateur
     * @return les livres emprunter par l'utilisateur
     */

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}
