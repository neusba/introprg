/* Fitxer que conté la classe UllDeGat amb els seves propietats corresponents i mètodes necessaris per 
 * l'exercici 34_29
 * Utilitzarem la classe afegint-la com a atribut al fitxer principal
 */
public class UllDeGat {
    private boolean estatUll = false;

    // CONSTRUCTORS
    public UllDeGat() {
    }
    public UllDeGat(boolean estat) {
        estatUll = estat;
    }
    // Mètodes
    public void obret() {
        this.estatUll = true;
    }
    public void tancat() {
        this.estatUll = false;
    }
    public boolean estaObert() {
        if (estatUll) {
            return true;
        }
        return false;
    }
}

