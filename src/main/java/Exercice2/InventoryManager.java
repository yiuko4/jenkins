package Exercice2;

import java.util.HashMap;
import java.util.Map;

/*
 * Antoine Cibick
 *
 * La classe InventoryManager représente un gestionnaire d'inventaire.
 */

public class InventoryManager {
    private Map<Produit, Double> inventory = new HashMap<>();

    public void ajouterProduit(Produit produit, double quantite) {
        double quantiteActuel = inventory.getOrDefault(produit, 0.0);
        inventory.put(produit, quantiteActuel + quantite);
    }

    public void retirerProduit(Produit produit, double quantite) {
        Double quantiteActuel = inventory.get(produit);
        if (quantiteActuel == null || quantiteActuel < quantite) {
            throw new IllegalArgumentException("Produit non disponible en quantité suffisante dans l'inventaire.");
        }
        inventory.put(produit, quantiteActuel - quantite);
    }

    public double getStock(Produit produit) {
        return inventory.getOrDefault(produit, 0.0);
    }
}


