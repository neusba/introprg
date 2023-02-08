/* Programa del ascensor, en aquest cas es crearà un array d'ascensor a partir d'un nombre donat per l'usuari
 * Mostrarem cada ascensor en el seu pis, el qual ha de ser corresponent a la seva posició a l'array
 */

public class Ascensor {
    public int pis = 0;

    // CREA ASCENSORS
    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensors = new Ascensor[quants];
        for (int i=0; i<ascensors.length; i++) {
            ascensors[i] = new Ascensor();
        }
        return ascensors;
    }

    // MAIN
    public static void main(String[] args){
        String arg = args[0];
        for (int i=0; i<arg.length(); i++) {
            if (Character.isLetter(arg.charAt(i))) {                                            // Descarta si són només una lletra
                System.out.println("Cap ascensor");
                return;
            }
        }
        int quants = Integer.parseInt(arg);                                                     // Transforma a int la quantitat d'ascensors
        if (quants == 0) { System.out.println("Cap ascensor"); return; }

        Ascensor[] ascensors = creaAscensors(quants);                                           // Crea l'array d'ascensors
        for (int i=0; i < ascensors.length; i++) {
            ascensors[i].pis = ascensors[i].pis + i;
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i]);
             
        }
    }
}
