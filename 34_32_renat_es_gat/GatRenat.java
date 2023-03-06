class GatRenat extends Gat {
    // esta viu
    public boolean estaViu() {
        if (getVides() > 0) {
            return true;
        }
        return false;
    }
    // esta dret
    public boolean estaDret() {
        if (getPosicio().equals("dret")) {
            return true;
        }
        return false;
    }
    // esta assegut
    public boolean estaAssegut() {
        if (getPosicio().equals("assegut")) {
            return true;
        }
        return false;
    }
    // esta estirat
    public boolean estaEstirat() {
        if (getPosicio().equals("estirat")) {
            return true;
        }
        return false;
    }
    // aixecat
    public String aixecat() {
        if (getPosicio().equals("dret")) {
            return("no faig res");
        }
        setPosicio("dret");
        return("m'aixeco");
    }
    // seu
    public String seu() {
        if (getPosicio().equals("assegut")) {
            return("no faig res");
        }
        setPosicio("assegut");
        return("m'assec");
    }
    // estirat
    public String estirat() {
        if (getPosicio().equals("estirat")) {
            return("no faig res");
        }
        setPosicio("estirat");
        return("m'estiro");
    }
}
