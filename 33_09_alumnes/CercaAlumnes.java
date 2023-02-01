/* Programa que mitjançant un fitxer csv transforma les dades un registre que queda emmagatzemat
 * A través d'un cercador, es motraran els registres dels alumnes que el seu nom/email contingui les lletres introduïdes
 * al cercador
 * No hauria de distinguir entre majúscules i minúscules
 * String.contain();
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CercaAlumnes {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
        // assegura que hi ha el criteri de cerca
        // XXX a completar

        String path = " alumnes.csv2";                                          // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        BufferedReader input = new BufferedReader(new FileReader(path));
        while (true) {
            String linia = input.readLine();                                    // llegeix entrada i finalitza bucle si no en queden més
            if (linia == null) { break; }
            if (linia.contains("nom,email")) { continue; }
            Alumne linia = new Alumne();                                        // converteix l'entrada a Alumne
            

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
            // XXX a completar
        }
        input.close();                                                          // consideracions finals com ara el tancament del fitxer
    }
        // Clase Alumne
        static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;

    public static Alumne construeixAlumne(String nom, String email, int edat, boolean esOient, int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oïent: " + (alumne.esOient?"Sí":"No"));
        System.out.println("- notes: " + notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }
    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        
    }

    public static String alumneACsv(Alumne alumne) {
        // XXX a completar encara que no es fa servir en aquest programa
    }

    public static Alumne csvAAlumne(String csv) {
        // XXX a completar
    }

}
