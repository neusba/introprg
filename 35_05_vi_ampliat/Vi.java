/* Fitxer que conté la classe Vi ampliada amb noves propietats i nous mètodes acord
 * al que ha demanat la germana de la Gualda
 * Aquests nous mètodes faran que haguem de replantejar una mica el que teniem ja 
 * a la nostra classe i el seu funcionament
 */

class Vi {
    // Propietats
    private String ref;         // ROURABLA20200232
    private String nom;         // Roura blanc
    private int preu;           // 1012
    private int estoc;          // 42
    private String lloc;        // P21E45N55E
    private String origen;      // Alella
    private String tipus;       // blanc
    private String collita;     // 2020

    // ############## CONSTRUCTOR #################
    public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
        this.ref = normalitzaString(ref);
        this.nom = normalitzaString(nom);
        this.lloc = normalitzaString(lloc);
        this.origen = normalitzaString(origen);
        this.tipus = normalitzaString(tipus);
        this.collita = normalitzaString(collita);
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
    }

    // ############# ACCESSORS ##################
    // getters
    public String getRef() {
        return this.ref;
    }
    public String getNom() {
        return this.nom;
    }
    public int getPreu() {
        return this.preu;
    }
    public int getEstoc() {
        return this.estoc;
    }
    public String getLloc() {
        return this.lloc;
    }
    public String getOrigen() {
        return this.origen;
    }
    public String getTipus() {
        return this.tipus;
    }
    public String getCollita() {
        return this.collita;
    }
    // setters
    public void setPreu(int preu) {
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
    }
    public void setEstoc(int estoc) {
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
    }
    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    // ############## METODES #################
    public static String normalitzaString(String nom) {
        // checkea si el nombre és un nombre válido, si no lo es, devuelve "NOM NO VÀLID"
        if (nom.isEmpty() || nom.isBlank() || nom == null) {
            return null;
        }
        // Si és un nombre vàlido:
        // limpia nombre de espacios delante, atrás y entremedio si hay más de uno
        nom = nom.strip();
        nom = nom.replaceAll("\\s+", " ");      // une 2 o más ws consecutivos en 1 solo
        return nom;
    }

    public boolean esValid() {
        if (getNom().isEmpty() || getNom().isBlank() || (getNom() == null)) {
            return true;
        }   
        if (this.preu == -1 || this.estoc == -1) { return false; }
        return true;
    } 

    // ############## METODES CONVERSIÓ #############
    // devuelve un array con los valores de la instància de vino actual
    public String[] aArrayString() {
        String preuArray = Integer.toString(this.preu);
        String estocArray = Integer.toString(this.estoc);
        String[] valors = { this.ref, this.nom, this.tipus, preuArray, this.collita, estocArray, this.origen, this.lloc };
        return valors;
    }
    // Recibe un array con los valores del vino y devuelve el Vino inicializado
    public static Vi deArrayString(String[] valorsVi) {
        if (valorsVi.length != 8) return null;  // tamany array

        String ref = normalitzaString(valorsVi[0]);
        String nom = normalitzaString(valorsVi[0]);
        if (Character.isLetter(valorsVi[1].charAt(0))) return null;
        if (Character.isLetter(valorsVi[2].charAt(0))) return null;
        int preu = Integer.parseInt(valorsVi[1]);
        if (preu < 0) return null;
        int estoc = Integer.parseInt(valorsVi[2]);
        if (estoc < 0) return null;
        String lloc = normalitzaString(lloc);
        String origen = normalitzaString(origen);
        String tipus = normalitzaString(tipus);
        String collita = normalitzaString(collita);
        return(new Vi(ref, nom, preu, estoc, lloc, origen, tipus, collita));
    }

    // ############## TOSTRING ######################
    @Override public String toString() {
          return(String.format("%n    Ref: %s%n         Vi: %s%n        Tipus: %s%n     Preu: %d%n      Collita: %s%n   Estoc: %d%n     Origen: %s%n    Lloc: %s%n", this.ref, this.nom, this.tipus, this.preu, this.collita, this.estoc, this.origen, this.lloc));
      }
}
