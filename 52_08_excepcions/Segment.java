/* Ftixer que conté la classe Segment la qual esta sent contruida mitjançant el mètode TDD.
 * Anirem escrivint cada metode, constructor i accesor després d'haver creat el seu respectiu 
 * test
 */

public class Segment {
    private Punt p1;
    private Punt p2;
    // ################## CONSTRUCTORS ###################
    public Segment() {
        p1 = new Punt(0, 0);
        p2 = new Punt(0, 0);
    }
    public Segment(Punt p1, Punt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // ################# ACCESORS #######################
    public Punt getP1() {
        return this.p1;
    }
    public Punt getP2() {
        return this.p2;
    }
    public void setP1(Punt p) {
        this.p1 = p;
    }
    public void setP2(Punt p) {
        this.p2 = p;
    }

    // ################# METODES #########################
    public Double longitud() {
        return (Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2)));
    }
    @Override
    public String toString() {
        return String.format("Segment(Punt(%d, %d), Punt(%d, %d))", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
