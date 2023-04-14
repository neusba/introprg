/* Fitxer que conté la classe EnvoltaString de manera publica per haver d'estalviar-me getters i setters
 */

public class EnvoltaString {
    private String valor;

    public EnvoltaString(String valor) { this.valor = valor; }

    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }

    public boolean equals(EnvoltaString altre) {
        return valor.equalsIgnoreCase(altre.valor);
    }
}
