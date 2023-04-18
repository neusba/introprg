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
    public static File arxiu = new File("botiga.csv");    // crea la referencia del archivo a tratar como variable global

    // Relacionem les classes Botiga i Entorn per mitjà de la composició
    private Botiga botiga;
    
    // ###############################  METODES DE CLASSE ENTORN #############################################################
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
    /*public void cerca() {
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
    }*/

    // COMANDA CERCA NOVA
    public void cerca() {
        // referencies
        String ref="", nom="", preu="", estoc="", lloc="", origen="", tipus="", collita="";
        int preuInt;
        int estocInt;
        // Creem un array per guardar les propietats seguents a ref i un altre identic per guardar paraules clau
        String[] propietats = { nom, preu, estoc, lloc, origen, tipus, collita };
        String[] nomVariables = { "nom", "preu max.", "estoc min.", "lloc", "origen", "tipus", "collita" };
        // Demanem la primera
        System.out.print("ref> ");
        ref = Entrada.readLine();
        if (!ref.isEmpty()) { 
            Vi instanciaRef = botiga.cerca(ref);
            return;
        }
        // recorrem l'array de propietats
        for (int i=0; i<propietats.length; i++) {
            System.out.printf("%s> ", nomVariables[i]);
            propietats[i] = Entrada.readLine();
            if (propietats[i].equals("!")) break;
            if (propietats[i].equals("")) continue;
        } 
        // Convertimos los String a int
        if (preu.equals("") || preu.equals("!")) {
            preu = "-1";
        } else if (Character.isLetter(preu.charAt(0))) {
            System.out.println("Ha de ser un nombre enter");
            return;
        }
        preuInt = Integer.parseInt(preu);
        if (estoc.equals("") || estoc.equals("!") || Character.isLetter(estoc.charAt(0))) {
            estoc = "-1";
        } else if (Character.isLetter(estoc.charAt(0))) {
            System.out.println("Ha de ser un nombre enter");
            return;
        }
        estocInt = Integer.parseInt(estoc);
        // creamos la instancia de vino 
        Vi instancia = botiga.cerca(new Vi(ref, nom, preuInt, estocInt, lloc, origen, tipus, collita));
        if (instancia == null) {
            System.out.println("No trobat");
        }else{
            System.out.println("Trobat:");
            System.out.println(instancia);
        }
    }
            
    // comanda AFEGEIX
    /*public void afegeix() {
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
    } */

    // comanda DEFAULT
    public static void def() {
        System.out.println("ERROR: comanda no reconeguda, escriviu help per ajuda");
    }
    // #############################################################################################
    // METODES PER TRACTAR VARIABLES 
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
        //entorn.escriuArxiu();
        System.out.println("adéu");
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
                return;
            }
            switch (comanda) {
                case "ajuda": ajuda(); break;
                case "cerca": cerca(); break;
                case "afegeix": System.out.println("Comanda temporalment no disponible"); break;
                case "modifica": System.out.println("Comanda temporalment no disponible"); break;
                case "elimina": System.out.println("Comanda temporalment no disponible"); break;
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
            // comprobamos si la linia contiene datos validos
            if (!validaLinia(linia)) continue;                                          // Datos no validos, saltamos a la siguiente 
            // convertimos el String a un dato valido
            referenciesLlegides += 1;                                                   // sumamos una referencia leidas VALIDAS
            String[] valors = linia.split(";");
            Vi instancia = Vi.deArrayString(valors);                                    // creacion de vino a partir de datos
            if (instancia != null) { botiga.afegeix(instancia); 
            }else{
                System.out.println("no se puede añadir a la botiga porque es null");
            }
                    // añadimos vino
        }
        input.close();                                                                  // cierra archivo
        return(String.format("Referències llegides: %d", referenciesLlegides));
    }
    // ultimo contacto con archivo Botiga.csv
    // abrimos el archivo en modo escritura
/*    public void escriuArxiu() throws IOException {
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
    } */
    // ################### METODOS EXTRAS: ARCHIVOS #####################################
    public boolean validaLinia(String linia) {
        if (!linia.contains(";")) return false;
        String[] valores = linia.split(";");
        if (valores.length != 8) return false;
        // control de tipos
        if (Character.isLetter(valores[2].charAt(0))) return false;     // preu
        if (Character.isLetter(valores[3].charAt(0))) return false;     // estoc
        return true;
    }
}
