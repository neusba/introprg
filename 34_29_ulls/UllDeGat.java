/* Fitxer que conté la classe UllDeGat amb els seves propietats corresponents i mètodes necessaris per 
 * l'exercici 34_29
 * Utilitzarem la classe afegint-la com a atribut al fitxer principal
 */
public class UllDeGat {
    private String estatUll = "tancat";
    
    public void obret() {
        this.estatUll = "obert";
    }
    public void tancat() {
        this.estatUll = "tancat";
    }
    public boolean estaObert() {
        if (estatUll.equals("obert")) {
            return true;
        }
        return false;
    }
}

