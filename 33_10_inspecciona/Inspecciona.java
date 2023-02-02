/* Programa que considera els arguments de la línia de comandes com a paths del sistema de fitxers
 * Per cada fitxer, l'analitzarà i donarà informació al respecte, si és que existeix
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Inspecciona {
    public static String permisos = "rwx";
    public static String arg = "";
    public static String separador = "=";
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {                                                 
            System.out.println("Necessito un path mínim");
            return;
        }
        processaArgument(args);
    }
    // Procediment que processa els arguments de la línia de comandes
    public static void processaArgument(String[] args) throws IOException {
        boolean directori = false;
        boolean fitxer = false;
        for (int i=0; i<args.length; i++) {
            arg = args[i];
            int length = arg.length();
            System.out.printf("Processant argument: %s%n", arg);
            System.out.printf("%s%n", separador.repeat(21 + length));
            System.out.println();
            File path = new File(arg);
            if (!path.exists()) {                                                                      // EXISTE
                System.out.println("No trobat");
                continue;
            }
            // Gestiona permisos (MODUL)
            modificaPermisos(path);
            // Es directori
            if (path.isDirectory()) {
                directori = true;
                gestionaDirectori(path);
            } else {
                fitxer = true;
                gestionaFitxer(path);
            }
            resetGlobals();
        }
    }
    // Procediment que modifica i mostra els permisos segons el fitxer/directori llegit
    public static void modificaPermisos(File path) throws IOException {
        if (!path.canRead()) { permisos = permisos.replace('r','-'); }
        if (!path.canWrite()) { permisos = permisos.replace('w','-'); }
        if (!path.canExecute()) { permisos = permisos.replace('x','-'); }
    }
    // Procediment que dona informació del directori
    public static void gestionaDirectori(File path) throws IOException {
        File carpeta = new File(arg);
        System.out.printf("%s directori ", permisos);
        String[] continguts = carpeta.list();
        if (continguts.length == 0) {
            System.out.print("buit");
        } else {
            System.out.print("que conté: ");
            for (int i=0; i<continguts.length; i++) {
                System.out.print(continguts[i] + ", ");
            }
        }
    }
    // Procediment que dona informació del fitxer
    public static void gestionaFitxer(File path) throws IOException {
        long mida = path.length();
        if (mida == 0) {
            System.out.printf("%s fitxer buit%n", permisos);
        } else {
            BufferedReader input = new BufferedReader(new FileReader(path));
            System.out.printf("%s fitxer de mida en bytes: %d%n", permisos, mida);
            System.out.println("Amb els continguts:");
            while (true) {
                String linia = input.readLine();
                if (linia == null) { break; }
                if (linia.isEmpty()) { continue; }
                System.out.printf("|%s|", linia);
            }
            input.close();
        }
    }
    // Reset de les variables globals
    public static void resetGlobals() {
        permisos = "rwx";
    }
}

