/* Fitxer que conté la classe Punt i que ha de complir els requisits dels tests del fitxer consegüent per poder passar les proves
 * 
 */

public class Punt {
    private int[] coord = {0, 0};
    // constructor específic
    public Punt(int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }
    // constructor per defecte
    public Punt() {}

    // getters
    public int getX() {
        return coord[0];
    }
    public int getY() {
        return coord[1];
    }
    //setters
    public void setX(int x) {
        this.coord[0] = x;
    }
    public void setY(int y) {
        this.coord[1] = y;
    }

    // Mètodes
    public void suma(Punt p) {
        coord[0]+=p.coord[0];
        coord[1]+=p.coord[1];
    }

    // ToString
    public String toString() {
        return String.format("Punt(%d, %d)", this.coord[0], this.coord[1]);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Punt)) return false;
        Punt nouPunt = (Punt) obj;
        if (this.coord[0] == nouPunt.coord[0] && this.coord[1] == nouPunt.coord[1]) return true;
        return false;
    }
}
