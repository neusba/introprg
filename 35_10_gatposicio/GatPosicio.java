/* Fitxer que conté la classe enum GatPosicio i introdueix el nou concepte a tenir en compte a l'exercici
 * Desenvoluparem l'enum en base a les posicions que pot tenir el GatRenat
 */

enum GatPosicio {
    // declaració de valors válids
    DRET, ASSEGUT, ESTIRAT;
    
    // No es necesario constructor privado ya que no tenemos ninguna propiedad que tratar

    // METODOS
    // este metodo se encarga de devolver un valor de la lista enum a partir del String que le pasamos por paràmetro
    public static GatPosicio fromString(String posicio) { 
        for (GatPosicio valor: GatPosicio.values()) {
            if (valor.name().equalsIgnoreCase(posicio)) return valor;
        }
        // tira excepcion si no encuentra un valor coincidente
        throw new IllegalArgumentException(String.format("Valor \"%s\" no suportat per GatPosicio", posicio));
    }
}

