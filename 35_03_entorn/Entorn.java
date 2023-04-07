/* Fitxer que conté el main que duura a terme el funcionament del programa de la german de la Gualda
 * Serà un programa utilitzable des de la consola per simplicitat.
 * El programa es basarà en un prompt que apareix per pantalla on podem escrivir les comandes
 */

public class Entorn {
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
        int preuInt;
        int estocInt;
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        // gestionem l'entrada de nom
        if (nom.isEmpty()) { return; }

        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        // gestio del preu 
        if (preu.isEmpty()) {
            preu = "0";
            preuInt = Integer.parseInt(preu);
        } else {
            preuInt = Integer.parseInt(preu);
        }
        if (preuInt < 0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }

        System.out.print("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        if (estoc.isEmpty()) {
            estoc = "0";
            estocInt = Integer.parseInt(estoc);
        } else {
            estocInt = Integer.parseInt(estoc);
        }
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
            int preu = Integer.parseInt(Entrada.readLine());
            // gestiona preu
            if (preu < 1) {
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return;
            }
            // gestiona estoc
            System.out.printf("estoc (enter %d)> ", instancia.getEstoc());
            int estoc = Integer.parseInt(Entrada.readLine());
            if (estoc < 0) {
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
        // gestiona instancia a eliminar
        Vi instancia = botiga.elimina(nom);
        if (instancia == null) {
            System.out.println("ERROR: no s'ha pogut eliminar");
            return;
        } else {
            System.out.println("A eliminar:");
            instancia.toString();
            System.out.print("Segur?> ");
            // demana confirmació per eliminar
            boolean confirmacio = Utilitats.respostaABoolean(Entrada.readLine());
            if (confirmacio) {
                System.out.println("Eliminat");
                return;
            }
            System.out.println("No eliminat");
        }
    }
    // comanda DEFAULT
    public static void def() {
        System.out.println("ERROR: comanda no reconeguda, escriviu help per ajuda");
    }

// ###################################### MAIN ########################################
    public static void main(String[] args) {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        Entorn entorn = new Entorn();

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
                case "ajuda": entorn.ajuda(); break;
                case "cerca": entorn.cerca(); break;
                case "afegeix": entorn.afegeix(); break;
                case "modifica": entorn.modifica(); break;
                case "elimina": entorn.elimina(); break;
                default: entorn.def(); break;
            }
        }
    }
}


        
