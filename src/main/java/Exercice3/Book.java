package Exercice3;

public class Book {

    /**
     * Le titre du livre
     */
    private String title;
    /**
     * L'auteur du livre
     */
    private String author;
    /**
     * Création d'un livre avec son titre et son autheur
     * @param title     Le titre du livre
     * @param author    L'auteur du livre
     */

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Retourne le titre du livre
     * @return le titre du livre
     */
    public String getTitle() {
        return title;
    }


    /**
     * Retourne l'auteur du livre
     * @return l'auteur du livre
     */
    public String getAuthor() {
        return author;
    }


}
