
// CLASSE GARFIELD
class Garfield extends Gat {
    // Constructores
    public Garfield() {
        super("Garfield", 9, "estirat");
    }
    // Methods
    @Override
    public String aixecat() {
        if (getPosicio().equals("assegut")) {
            setPosicio("dret");
            return("m'aixeco");
        }
        if (getPosicio().equals("estirat")) {
            return("Bai Maitea, bai");
        }
        return("no faig res");
    }
    @Override
    public String estirat() {
        if (getPosicio().equals("assegut")) {
            setPosicio("estirat");
            return("m'estiro");
        }
        if (getPosicio().equals("dret")) {
            return("Bai Maitea, bai");
        }
        return("no faig res");
    }
    @Override
    public String seu() {
        if (!getPosicio().equals("assegut")) {
            setPosicio("assegut");
            return("m'assec");
        }
        return("no faig res");
    }
    @Override
    public void setVides(int vides) {
        if (getVides() == 9) {
            setVides(vides);
        }
    }
}
