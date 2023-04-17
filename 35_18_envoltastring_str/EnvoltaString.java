/* Fitxer que conté la classe EnvoltaString de manera publica per haver d'estalviar-me getters i setters
 */

public class EnvoltaString {
    private String valor;

    public EnvoltaString(String valor) { this.valor = valor; }

    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EnvoltaString) {
            EnvoltaString altre = (EnvoltaString) obj;  // transformamos al objecto tipo Object
            return this.valor.equalsIgnoreCase(altre.valor);
        }
        return false;
    }
    
    // sobrecárrega
    /*public boolean equals(String valor) {
        return this.valor.equalsIgnoreCase(valor);
    }*/
}
