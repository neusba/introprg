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
    static class Alumne {
            String nom;
            String email;
            int edat;
            boolean esOient;
            int[] notes;
    }

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
        String notesCsv = "";
        for (int i=0; i<notes.length; i++) {
            if (i == notes.length - 1) {
                notesCsv = notesCsv + notes[i];
            } else {
                notesCsv = notesCsv + notes[i] + ",";
            }
        }
        notesCsv = notesCsv.replace("-1","NP");
        return notesCsv;
    }

    public static String alumneACsv(Alumne alumne) {
        String alumneCsv = String.format("%s,%s,%d,%b,%s", alumne.nom, alumne.email, alumne.edat, alumne.esOient, notesACsv(alumne.notes));
        return alumneCsv;
    }

    public static Alumne csvAAlumne(String csv) {
        String[] dades = csv.split(",", 5);
        String[] notesCsv = dades[4].split(",");
        String nom = dades[0];
        String email = dades[1];
        int edat = Integer.parseInt(dades[2]);
        boolean esOient = dades[3].equals("true")?true:false;
        int[] notes = new int[6];
        for (int i=0; i<notesCsv.length; i++) {
            boolean enter = UtilString.esEnter(notesCsv[i]);
            if (enter) { notes[i] = Integer.parseInt(notesCsv[i]);
            } else { notes[i] = -1; }
        }
        Alumne alumne = construeixAlumne(nom, email, edat, esOient, notes);
        return alumne;
    }
    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        if (args.length == 0) {
            System.out.println("No hi ha cap argument");
            return;
        }
        int contador = 0;
        String path = "alumnes.csv";
        BufferedReader input = new BufferedReader(new FileReader(path));
        while (true) {
            String linia = input.readLine();
            contador += 1;
            if (contador == 1) continue;
            if (linia == null) break;
            Alumne alumne = csvAAlumne(linia);
            if (alumne.nom.contains(args[0]) || alumne.email.contains(args[0])) {
                mostraAlumne(alumne);
            }
        }
        input.close();
    }
    
}
