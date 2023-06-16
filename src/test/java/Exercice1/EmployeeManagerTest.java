package Exercice1;

import Exercice1.Employee;
import Exercice1.EmployeeManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {


    @Test
    public void testCalculSalaireJunior1AnAnciennete() {

        String prenom = "Antoine";
        String nom = "Cibick";
        int anneeExperience = 1;
        String niveau = "Junior";
        int salaire = 20000;


        EmployeeManager employerManager = new EmployeeManager();
        Employee employee = new Employee(prenom, nom, anneeExperience, niveau);

        double salaireRequis = salaire * (1 +0.05 * anneeExperience);
        double salaireActuel = employerManager.calculateSalary(employee);

        assertEquals(salaireRequis, salaireActuel, "Valide pour un " + niveau);
    }



    @Test
    public void testCalculSalaireIntermediaire5AnsAnciennete() {
        String nom = "Eric";
        String prenom = "Cabret";
        int anneeExperience = 5;
        String niveau = "Intermediaire";
        int salaire = 40000;


        EmployeeManager employerManager = new EmployeeManager();
        Employee employee = new Employee(prenom, nom, anneeExperience, niveau);

        double salaireRequis = salaire * (1 +0.05 * anneeExperience);
        double salaireActuel = employerManager.calculateSalary(employee);

        assertEquals(salaireRequis, salaireActuel, "Valide pour un " + niveau);
    }

    @Test
    public void testCalculSalaireSenior10AnsAnciennete() {
        String nom = "Melanchon";
        String prenom = "Jean-Luc";
        int anneeExperience = 10;
        String niveau = "Senior";
        int salaire = 60000;


        EmployeeManager employerManager = new EmployeeManager();
        Employee employee = new Employee(prenom, nom, anneeExperience, niveau);

        double salaireRequis = salaire * (1 +0.05 * anneeExperience);
        double salaireActuel = employerManager.calculateSalary(employee);

        assertEquals(salaireRequis, salaireActuel, "Valide pour un " + niveau);
    }


    @Test
    public void testCalculSalaireSenior20AnsAnciennete() {
        String nom = "Lenovo";
        String prenom = "Legion";
        int anneeExperience = 20;
        String niveau = "Senior";
        int salaire = 60000;


        EmployeeManager employerManager = new EmployeeManager();
        Employee employee = new Employee(prenom, nom, anneeExperience, niveau);

        double salaireRequis = salaire * (1 +0.05 * anneeExperience);
        double salaireActuel = employerManager.calculateSalary(employee);

        assertEquals(salaireRequis, salaireActuel, "Valide pour un " + niveau);
    }

    @Test
    public void testCalculSalaireJunior30AnsAnciennete() {
        String nom = "Quoicou";
        String prenom = "bebou";
        int anneeExperience = 30;
        String niveau = "Junior";
        int salaire = 20000;


        EmployeeManager employerManager = new EmployeeManager();
        Employee employee = new Employee(prenom, nom, anneeExperience, niveau);

        double salaireRequis = salaire * (1 +0.05 * anneeExperience);
        double salaireActuel = employerManager.calculateSalary(employee);

        assertEquals(salaireRequis, salaireActuel, "Valide pour un " + niveau);
    }


}
