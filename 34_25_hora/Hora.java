 /* Compara dues hores i retorna l'operador corresponent
 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
 * altres dos valors possibles són ">" i "=="
 * @param hora1: primera hora a comparar
 * @param hora2: segona hora a comparar
 * @return operador resultant
 */
public class Hora {
    // variables globales
    public static int segonsRestant;
    public static int segonsAModificar;
    public static int minutsAModificar;
    public static int horesAModificar;
    // propietats privades
    private int hores;
    private int minuts;
    private int segons;

    // ########################### ACCESSORS #############################
    // Getters
    public int getHores() {
        return this.hores;
    }
    public int getMinuts() {
        return this.minuts;
    }
    public int getSegons() {
        return this.segons;
    }
    // Setters
    public void setHores(int hores) {
        this.hores = hores;
    }
    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }
    public void setSegons(int segons) {
        this.segons = segons;
    }

    // ########################### CONSTRUCTORS ###########################
    // Per defecte
    public Hora() {
        hores = 0;
        minuts = 0;
        segons = 0;
    }
    // Específic
    public Hora(int hores, int minuts, int segons) {
        if (hores < 0 || hores > 23 || minuts < 0 || minuts > 59 || segons < 0 || segons > 59) {
            setHores(0);
            setMinuts(0);
            setSegons(0);
        } else { 
            setHores(hores);
            setMinuts(minuts);
            setSegons(segons);
        }
    }

    // ########################### METHODS ################################
    // Incrementa un segon
    public void incrementa() {
        if (this.segons == 59) {
            setSegons(0);
            if (this.minuts == 59) {
                setMinuts(0);
                if (this.hores == 23) {
                    setHores(0);
                } else {
                    setHores(this.hores + 1);
                }
            } else {
                setMinuts(this.minuts + 1);
            }
        } else { 
            setSegons(this.segons + 1);
        }
    }
    // Decrementa 1 segon
    public void decrementa() {
        if (this.segons == 0) {
            setSegons(59);
            if (this.minuts == 0) {
                setMinuts(59);
                if (this.hores == 0) {
                    setHores(23);
                } else {
                    setHores(this.hores - 1);
                }
            } else {
                setMinuts(this.minuts - 1);
            }
        } else { 
            setSegons(this.segons - 1);
        }
    }






    // #################################################################################### CORREGIR ###########################################################################################################
    // Incrementa N segons
    public void incrementa(int segons) {                                        
        segonsRestant = segons % 3600;                                           // segons sobrants al redoniment d'hores
        segonsAModificar = segons % 60;                                          // segons a afegir 
        minutsAModificar = (segonsRestant - segonsAModificar) / 60;              // minuts a afegir
        horesAModificar = (segons - segonsRestant)/3600;                         // Aconseguim els segons "nets" i calculem a quantes hores equival
        // gestiona los segundos, minutos y horas para que tengan un valor adecuado
        gestionaSegons(segonsAModificar);
        gestionaMinuts(minutsAModificar);
        gestionaHores(horesAModificar);
    }
    // ------------------------------------------------------------------------------- MODULOS DE GESTION ------------------------------------------------------------------------------------------------------
    public void gestionaSegons(int segonsAModificar) {
        while (segonsAModificar > 59) {
            segonsAModificar -= 60;
            minutsAModificar += 1;
        }
        setSegons(segonsAModificar);
    }
    public void gestionaMinuts(int minutsAModificar) {
        while (minutsAModificar > 59) {
            minutsAModificar -= 60;
            horesAModificar += 1;
        }
        setMinuts(minutsAModificar);
    }
    public void gestionaHores(int horesAModificar) {
        while (horesAModificar > 23) {
            horesAModificar -= 24;
        }
        setHores(horesAModificar);
    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Decrementa N segons
    public void decrementa(int segons) {
        segonsRestant = segons % 3600;                         // segons sobrants al redoniment d'hores
        segonsAModificar = segons % 60;                               // segons a treure 
        minutsAModificar = (segonsRestant - segonsAModificar) / 60;          // minuts a treure
        horesAModificar = (segons - segonsRestant) / 3600;            // Aconseguim els segons "nets" i calculem a quantes hores equival
        // gestiona los segundos, minutos y horas para que tengan un valor adecuado
        gestionaSegons(segonsAModificar);
        gestionaMinuts(minutsAModificar);
        gestionaHores(horesAModificar);
    }











    // converteix instància a string
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
    // compara hora1 amb hora2
    public int compareTo(Hora hora2) {
        if (this.hores > hora2.hores) {
            return 2;
        }
        if (this.hores < hora2.hores) {
            return -2;
        }
        if (this.hores == hora2.hores) {
            if (this.minuts > hora2.minuts) {
                return 2;
            }
            if (this.minuts < hora2.minuts) {
                return -2;
            }
            if (this.minuts == hora2.minuts) {
                if (this.segons > hora2.segons) {
                    return 2;
                }
                if (this.segons < hora2.segons) {
                    return -2;
                }
                if (this.segons == hora2.segons) {
                    return 0;
                }
            }
        }
        return 0;
    }
    // Composador de operador de comparació
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }

    // ############################## MAIN ####################################
    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);

    }
}
