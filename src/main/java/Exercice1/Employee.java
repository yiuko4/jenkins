package Exercice1;

/*
 * Antoine Cibick
 *
 * La classe Employye représente un employé.
 */
public class Employee {
    /**
     * Le prénom de l'employé.
     */
    private String prenom;
    /**
     * Le nom de l'employé.
     */
    private String nom;
    /**
     * L'année d'expérience de l'employé.
     */
    private int anneeExperience;
    /**
     * Le niveau de l'employé.
     */
    private String niveau;

    /**
     * Créer un nouvel employé avec un prénom, un nom, une année d'expérience et un niveau spécifiés.
     *
     * @param prenom          le prénom de l'employé
     * @param nom             le nom de l'employé
     * @param anneeExperience l'année d'expérience de l'employé
     * @param niveau          le niveau de l'employé
     */
    public Employee(String prenom, String nom, int anneeExperience, String niveau) {
        this.prenom = prenom;
        this.nom = nom;
        this.anneeExperience = anneeExperience;
        this.niveau = niveau;
    }

    /**
     * Retourne le prénom de l'employé.
     *
     * @return le prénom de l'employé
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourne le nom de l'employé.
     *
     * @return le nom de l'employé
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne l'année d'expérience de l'employé.
     *
     * @return l'année d'expérience de l'employé
     */
    public int getAnneExperience() {
        return anneeExperience;
    }

    /**
     * Retourne le niveau de l'employé.
     *
     * @return le niveau de l'employé
     */
    public String getNiveau() {
        return niveau;
    }


}

