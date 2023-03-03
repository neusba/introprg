/* Compara dues hores i retorna l'operador corresponent
 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
 * altres dos valors possibles són ">" i "=="
 * @param hora1: primera hora a comparar
 * @param hora2: segona hora a comparar
 * @return operador resultant
 */
public class Hora {
    // variables globales
    public static int resto;
    public static int nousSegons;
    public static int nousMinuts;
    public static int novesHores;
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
    // Incrementa N segons
    public void incrementa(int segons) {                                        
        resto = segonsRestant(segons);
        nousSegons = calculaSegons(segons);
        nousMinuts = calculaMinuts(resto, nousSegons);
        novesHores = calculaHores(segons, resto);
        // incrementa els valors a la hora actual
        this.segons = this.segons + nousSegons;                                           // Suma els segons actuals amb els nous
        this.minuts = this.minuts + nousMinuts;                                          // Suma els minuts actuals amb els nous
        this.hores = this.hores + novesHores;                                           // Suma les hores actuals amb les noves
        // modifica els valors per a que siguin vàlids per la hora si és necessari
        if (this.segons < 0) {
            gestionaSegonsNegatius(this.segons);
        } else if (this.segons > 59) {
            gestionaSegonsPassats(this.segons);
        }
        if (this.minuts < 0) {
            gestionaMinutsNegatius(this.minuts);
        } else if (this.minuts > 59) {
            gestionaMinutsPassats(this.minuts);
        }
        if (this.hores < 0) {
            gestionaHoresNegatives(this.hores);
        } else if (this.hores > 23) {
            gestionaHoresPassades(this.hores);
        }
    }
    // Decrementa N segons
    public void decrementa(int segons) {
        resto = segonsRestant(segons);
        nousSegons = calculaSegons(segons);
        nousMinuts = calculaMinuts(resto, nousSegons);
        novesHores = calculaHores(segons, resto);
        // decrementa els valors a la hora actual
        this.segons = this.segons - nousSegons;                                           // Resta els segons actuals amb els nous
        this.minuts = this.minuts - nousMinuts;                                          // Resta els minuts actuals amb els nous
        this.hores = this.hores - novesHores;                                           // Resta les hores actuals amb les noves
        // modifica els valors per a que siguin vàlids per la hora si és necessari
        if (this.segons < 0) {
            gestionaSegonsNegatius(this.segons);
        } else if (this.segons > 59) {
            gestionaSegonsPassats(this.segons);
        }
        if (this.minuts < 0) {
            gestionaMinutsNegatius(this.minuts);
        } else if (this.minuts > 59) {
            gestionaMinutsPassats(this.minuts);
        }
        if (this.hores < 0) {
            gestionaHoresNegatives(this.hores);
        } else if (this.hores > 23) {
            gestionaHoresPassades(this.hores);
        }
	if (esValida(this.segons, this.minuts, this.hores)) {
		System.out.println("Hora valida");
	} else {
		System.out.println("Hora no valida");
	}
    }

    // Modulos para convertir los segundos dados en minutos, horas y segundos
    public int segonsRestant(int segons) {
        resto = segons % 3600;
        return resto;
    }
    public int calculaSegons(int segons) {
        nousSegons = segons % 60;
        return nousSegons;
    }
    public int calculaMinuts(int resto, int nousSegons) {
        nousMinuts = (resto - nousSegons) / 60; 
        return nousMinuts;
    }
    public int calculaHores(int segons, int resto) {
        novesHores = (segons - resto)/3600;
        return novesHores;
    }
    // Modulos para modificar los valores hasta que sean adecuados
    public void gestionaSegonsNegatius(int segons) {
        while (segons < 0) {
            segons += 60;
            this.minuts = this.minuts - 1;
        }
        setSegons(segons);
    }                                                                                   
    public void gestionaMinutsNegatius(int minuts) {
        while (minuts < 0) {
            minuts += 60;
            this.hores = this.hores - 1;
        }
        setMinuts(minuts);
    }
    public void gestionaSegonsPassats(int segons) {
        while (segons > 59) {
            segons -= 60;
            this.minuts = this.minuts + 1;
        }
        setSegons(segons);
    }                                                                         
    public void gestionaMinutsPassats(int minuts) {
        while (minuts > 59) {
            minuts -= 60;
            this.hores = this.hores + 1;
        }
        setMinuts(minuts);
    }
    public void gestionaHoresNegatives(int hores) {
        while (hores < 0) {
            hores += 24;
        }
        setHores(hores);
    }
    public void gestionaHoresPassades(int hores) {
        while (hores > 23) {
            hores -= 24;
        }
        setHores(hores);
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
    // Nous mètodes per afegir, exercici 34_27
    // comprova si la combinació d'hores, minuts i segons formes un conjunt vàlid per una hora
    public static boolean esValida(int hores, int minuts, int segons) {
        if (hores < 0 || hores > 23 || minuts < 0 || minuts > 59 || segons < 0 || segons > 59) {
		return false;
	}
   	return true;
    }
    // compara hora 1 amb hora 2
    public static int compareTo(Hora hora1, Hora hora2) {
        if (hora1.hores > hora2.hores) {
            return 2;
        }
        if (hora1.hores > hora2.hores) {
            return 2;
        }
        if (hora1.hores < hora2.hores) {
            return -2;
        }
        if (hora1.hores == hora2.hores) {
            if (hora1.minuts > hora2.minuts) {
                return 2;
            }
            if (hora1.minuts < hora2.minuts) {
                return -2;
            }
            if (hora1.minuts == hora2.minuts) {
                if (hora1.segons > hora2.segons) {
                    return 2;
                }
                if (hora1.segons < hora2.segons) {
                    return -2;
                }
                if (hora1.segons == hora2.segons) {
                    return 0;
                }
            }
        }
        return 0;
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
