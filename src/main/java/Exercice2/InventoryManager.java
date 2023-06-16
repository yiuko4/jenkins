package Exercice2;

import java.util.HashMap;
import java.util.Map;

/**
 * Antoine Cibick
 *
 * La classe InventoryManager représente un gestionnaire d'inventaire.
 */

public class InventoryManager {
    private Map<Produit, Double> inventory = new HashMap<>();

    /**
     * Ajout d'un produit dans l'inventaire
     * @param produit   Le produit à ajouter
     * @param quantite  La quantité du produit à ajouter
     */

    public void ajouterProduit(Produit produit, double quantite) {
        double quantiteActuel = inventory.getOrDefault(produit, 0.0);
        inventory.put(produit, quantiteActuel + quantite);
    }
    /**
     * Retire un produit dans l'inventaire.
     * @param produit                           Le produit à retirer
     * @param quantite                          La quantité du produit à retirer
     * @throws IllegalArgumentException         Si le produit est en quantité est insuffisante
     */
    public void retirerProduit(Produit produit, double quantite) {
        Double quantiteActuel = inventory.get(produit);
        if (quantiteActuel == null || quantiteActuel < quantite) {
            throw new IllegalArgumentException("pas asser de produit");
        }
        inventory.put(produit, quantiteActuel - quantite);
    }

    /**
     * Retourne la quantite d'un produit dans l'inventaire
     * @return la quantite d'un produit dans l'inventaire
     */
    public double getStock(Produit produit) {
        return inventory.getOrDefault(produit, 0.0);
    }
}


