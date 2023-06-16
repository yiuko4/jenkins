package Exercice2;

import Exercice2.InventoryManager;
import Exercice2.Produit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryManagerTest {
    private InventoryManager inventoryManager;
    private Produit fraise = new Produit("fraise");
    private Produit carotte = new Produit("carotte");
    private Produit panda = new Produit("panda");
    private Produit apasceproduit = new Produit("apasceproduit");

    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager();

        inventoryManager.ajouterProduit(fraise, 100.0);
        inventoryManager.ajouterProduit(carotte, 5);
        inventoryManager.ajouterProduit(panda, 10);

    }

    @Test
    public void test100suffisant() {
        double nbProduitRetire = 20.0;
        double stockActuel = inventoryManager.getStock(fraise) - nbProduitRetire;

        inventoryManager.retirerProduit(fraise, nbProduitRetire);
        double stockRestant = inventoryManager.getStock(fraise);
        assertEquals(stockActuel, stockRestant, "La quantité est de " + inventoryManager.getStock(fraise) + " au lieu de 10000");
    }

    @Test
    public void test5insuffisant() {
        assertThrows(IllegalArgumentException.class, () -> inventoryManager.retirerProduit(carotte, 10.0), "le stock est insuffisant, il y en a : " + inventoryManager.getStock(carotte));
    }
    @Test
    public void test0epuise() {
        inventoryManager.retirerProduit(panda, 10);
        double stockRestant = inventoryManager.getStock(panda);
        assertEquals(0, stockRestant, "La quantité de panda est de " + inventoryManager.getStock(panda) + " il est donc épuisé");
    }



    @Test
    public void testProductNotInInventory() {
        assertThrows(IllegalArgumentException.class, () -> inventoryManager.retirerProduit(apasceproduit, 1.0), "Ce produit n'existe pas dans l'inventaire");
    }
}
