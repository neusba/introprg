/* Segona part de l'exercici 34_28, trobarem el main que utlilitzarem per l'execució i la comprobació de l'exercici
 * es pot veure com, a pesar de no tenir interacció entre si el main amb el mètode canviaPosicio(), l'instància treballada
 * és la mateixa
 */

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = GatRenat.getInstancia();
        System.out.println("Inicialment Renat està " + renat.getPosicio());
        for (String posicio: args) {
            canviaPosicio(posicio);
            System.out.println("Ara està " + renat.getPosicio());
        }
    }
    private static void canviaPosicio(String novaPosicio) {
        switch (novaPosicio) {
            case "1": novaPosicio = "estirat"; break;
            case "2": novaPosicio = "assegut"; break;
            case "3": novaPosicio = "dret"; break;
            case "estirat": novaPosicio = "estirat"; break;
            case "assegut": novaPosicio = "assegut"; break;
            case "dret": novaPosicio = "dret"; break;
            default: novaPosicio = novaPosicio; break;
        }
        GatRenat.getInstancia(novaPosicio);
        
    }
}
