/* Fitxer que conté la classe Punt i que ha de complir els requisits dels tests del fitxer consegüent per poder passar les proves
 * 
 */

public class Punt {
    private int x = 0;  // coordenades
    private int y = 0;
    // constructor específic
    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // constructor per defecte
    public Punt() {}

    // getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Mètodes
    public void suma(Punt p) {
        x+=p.x;
        y+=p.y; 
    }

    // ToString
    public String toString() {
        return String.format("Punt(%d, %d)", this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Punt)) return false;
        Punt nouPunt = (Punt) obj;
        if (this.x == nouPunt.x && this.y == nouPunt.y) return true;
        return false;
    }
}
