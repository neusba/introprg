/* Fitxer que conté el main que duura a terme el funcionament del programa de la german de la Gualda
 * Serà un programa utilitzable des de la consola per simplicitat.
 * El programa es basarà en un prompt que apareix per pantalla on podem escrivir les comandes
 * Desastre de código que verguenza
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Entorn {
    // Variables globales
    public static File arxiu = new File("Botiga.csv");    // crea la referencia del archivo a tratar como variable global

    // Relacionem les classes Botiga i Entorn per mitjà de la composició
    private Botiga botiga;

    // Donem el constructor d'Entorn per implícit
    public Entorn() {
        botiga = new Botiga();
    }

    // Mètodes que actuaran com a comandes al main
    // Comanda AJUDA
    public static void ajuda() {
        String[] comandes  = {"ajuda", "cerca", "afegeix", "modifica", "elimina", "surt"};
        System.out.println("Comandes disponibles:");
        for (String comanda : comandes) {
            System.out.println(comanda);
        }
    }
    // comanda CERCA
    public void cerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        // gestionem l'entrada del nom
        if (nom.isEmpty()) { return; }
        // cerquem el nom del vi a la botiga
        Vi instancia = botiga.cerca(nom);
        if (instancia == null) {
            System.out.println("No trobat");
        } else {
            System.out.print("Trobat:");
            System.out.println(instancia.toString());
        }
    }
    // comanda AFEGEIX
    public void afegeix() {
        // gestionem l'entrada de nom
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) { return; }
        // gestio del preu 
        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        int preuInt = gestionaPreu(preu);
        if (preuInt < 0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        // gestió de l'estoc
        System.out.print("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        int estocInt = gestionaEstoc(estoc);
        if (estocInt < 0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        // intentem afegir el vi amb les seves dades a la botiga
        Vi instancia = botiga.afegeix(new Vi(nom, preuInt, estocInt));
        if (instancia == null) {
            System.out.println("ERROR: no s'ha pogut afegir");
            return;
        } else { 
            System.out.print("Introduït:");
            System.out.println(instancia.toString());
        }
    }

    // comanda MODIFICA
    public void modifica() {
        int preuInt = 0;
        int estocInt = 0;

        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        // gestiona entrada nom
        if (nom.isEmpty()) { return; }
        // gestiona instancia a modificar
        Vi instancia = botiga.cerca(nom);
        if (instancia == null) {
            System.out.println("No trobat");
            return;
        } else {
            System.out.printf("preu (enter %d)> ", instancia.getPreu());
            String preu = Entrada.readLine();
            if (preu.isEmpty()) { 
                instancia.setPreu(instancia.getPreu());
            } else {
                preuInt = Integer.parseInt(preu);
                instancia.setPreu(preuInt);
            }
            if (preuInt < 0) {
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return;
            }

            System.out.printf("estoc (enter %d)> ", instancia.getEstoc());
            String estoc = Entrada.readLine();
            if (estoc.isEmpty()) {
                instancia.setEstoc(instancia.getEstoc());
            } else {
                estocInt = Integer.parseInt(estoc);
                instancia.setEstoc(estocInt);
            }
            if (estocInt < 0) {
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return;
            }
            // Mostra modificat
            System.out.println("Modificat:");
            System.out.println(instancia.toString());
        }
    }
    // comanda ELIMINA
    public void elimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        // gestiona entrada nom
        if (nom.isEmpty()) { return; }
        // busca la instancia a la botiga abans d'eliminar-la
        Vi instancia = botiga.cerca(nom);
        if (instancia == null) {
            System.out.println("No trobat");
            return;
        } else {
            System.out.print("A eliminar:");
            System.out.println(instancia.toString());
            System.out.print("Segur?> ");
            // demana confirmació per eliminar
            boolean confirmacio = Utilitats.respostaABoolean(Entrada.readLine());
            if (confirmacio) {
                instancia = botiga.elimina(nom);
                if (instancia == null) {
                    System.out.println("ERROR: no s'ha pogut eliminar");
                    return;
                } else {
                    System.out.println("Eliminat");
                    return;
                }
            }
            System.out.println("No eliminat");
        }
    }
    // comanda DEFAULT
    public static void def() {
        System.out.println("ERROR: comanda no reconeguda, escriviu help per ajuda");
    }
    // #############################################################################################
    // METODES EXTERNS PER TRACTAR VARIABLES 
    public static int gestionaPreu(String preu) {
        int preuInt;
        if (preu.isEmpty()) {
            preu = "0";
            preuInt = Integer.parseInt(preu);
        } else {
            preuInt = Integer.parseInt(preu);
        }
        return preuInt;
    }
    public static int gestionaEstoc(String estoc) {
        int estocInt;
        if (estoc.isEmpty()) {
            estoc = "0";
            estocInt = Integer.parseInt(estoc);
        } else {
            estocInt = Integer.parseInt(estoc);
        }
        return estocInt;
    }

// ###################################### MAIN ########################################
    public static void main(String[] args) throws IOException {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        Entorn entorn = new Entorn();
        
        // Tractament i lectura de l'arxiu Botiga.csv
        entorn.comprovaArxiu();
        // Ejecución y procesamiento de comandos del prompt
        entorn.procesaPrompt();
        // Tractament i escriptura arxiu Botiga.csv
        entorn.escriuArxiu();
    }
// ######################################################################################
    // METODOS EJECUCION
    // procesa prompt
    public void procesaPrompt() {
        while (true) {
            System.out.print("botiga> ");
            // demanem la comanda
            String comanda = Entrada.readLine().strip();
            // gestionem la comanda introduïda al prompt
            if (comanda.equals("surt")) {
                System.out.println("adéu");
                return;
            }
            switch (comanda) {
                case "ajuda": ajuda(); break;
                case "cerca": cerca(); break;
                case "afegeix": afegeix(); break;
                case "modifica": modifica(); break;
                case "elimina": elimina(); break;
                default: def(); break;
            }
        }
    }
    // primer contacto con archivo Botiga.csv
    public void comprovaArxiu() throws IOException {
        if (!arxiu.exists()) {                  // comprueva existencia
            arxiu.createNewFile();
        }
        // lee archivo, transforma datos en vinos y muestra referencias leidas
        System.out.println(llegeixArxiu());
    }
    public String llegeixArxiu() throws IOException {
        int referenciesLlegides = 0;
        BufferedReader input = new BufferedReader(new FileReader(arxiu));               // abrimos el archivo en modo lectura
        while (true) {
            String linia = input.readLine();
            if (linia == null) break;
            referenciesLlegides += 1;                                                   // sumamos una referencia leida
            // convertimos el String a un dato valido para crear un vino
            String[] valors = linia.split(";");
            Vi instancia = Vi.deArrayString(valors);                                    // creacion de vino a partir de datos
            if (instancia != null) { botiga.afegeix(instancia); }                       // añadimos vino
        }
        input.close();                                                                  // cierra archivo
        return(String.format("Referències llegides: %d", referenciesLlegides));
    }
    // ultimo contacto con archivo Botiga.csv
    // abrimos el archivo en modo escritura
    public void escriuArxiu() throws IOException {
        int referenciesGuardades = 0;
        BufferedWriter output = new BufferedWriter(new FileWriter(arxiu));              // abrimos en modo escritura
        // iniciamos el recorrido de la bodega para escribir los vinos en el archivo
        botiga.iniciaRecorregut();
        while (true) {
            Vi instancia = botiga.getSeguent();
            if (instancia == null) break;
            // transformamos las propiedades de la instancia a un string[]
            String valorsCSV = String.join(";", instancia.aArrayString());              // obtenemos un string bien formado ("...;...;") a partir del metodo
            // escribimos los datos bien formados en el archivo
            output.write(valorsCSV);
            output.newLine();
            referenciesGuardades +=1;                                                   // sumamos una referencia guardada
        }
        output.close();                                                                 // cierra archivo
        System.out.printf("Referències guardades: %d%n", referenciesGuardades);
    }
}
