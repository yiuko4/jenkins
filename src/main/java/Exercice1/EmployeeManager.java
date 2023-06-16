package Exercice1;

/**
 * La classe EmployeeManager représente un gestionnaire d'employés.
 */
public class EmployeeManager {

    /**
     * Calcule le salaire d'un employé.
     * @return le coefficient d'ancienneté en fonction des années d’expériences
     */

    public double calculateSalary(Employee employee) {
        double baseSalaire;
        switch (employee.getNiveau()) {
            case "Junior":
                baseSalaire = 20000;
                break;
            case "Intermediaire":
                baseSalaire = 40000;
                break;
            case "Senior":
                baseSalaire = 60000;
                break;
            default:
                throw new IllegalArgumentException("Niveau choisi est invalide: " + employee.getNiveau());
        }
        return baseSalaire * calculateExperienceMultiplier(employee.getAnneExperience());
    }

    /**
     * Calcule le multiplicateur d'expérience d'un employé.
     * @return le multiplicateur d'expérience d'un employé
     */
    public double calculateExperienceMultiplier(int anneeExperience) {
        return 1 + 0.05 * anneeExperience;
    }


}
