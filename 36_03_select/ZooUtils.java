/* Fitxer que conté els mètodes que faciliten la interacció entre Zoo i UsaZoo.
 * El primer ftixer que afegirem será el métode mostraCategories();
 */

// IMPORTS
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ZooUtils {
    // Mètode que mostra les categories existents a la base de dades actuals 
    public static void mostraCategories(List<Categoria> categories) {
        for (Categoria categoria : categories) {
            System.out.println(categoria);
        }
    }
}
