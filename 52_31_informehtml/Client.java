/* Classe Client d'exemple per la creació de classes del programa de Gestor de Lloguers
 * Al client se li generà un informe amb el registre de tots els seus lloguers i els seus respectius imports i bonificiacions afegides.
 */

import java.util.ArrayList;
import java.util.Locale;

public class Client {
    private static final double EUROS_PER_UNITAT_DE_COST = 30;
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
    }

    public String getNif()     { return nif; }
    public String getNom()     { return nom; }
    public String getTelefon() { return telefon; }
    public ArrayList<Lloguer> getLloguers() { return lloguers; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    public String informe() {
        return composaCapsalera() +
           composaDetall() +
           composaPeu();
    }

    // ############### REMPLAÇAMENT DE VARIABLES PER CRIDA ###################
    public double quantitat(Lloguer lloguer) {
        double quantitat = lloguer.calculQuantitatsPerLloguer();
        return quantitat;
    }
    // ############## ELIMINACIÓ DE VARIABLES ################################
    // Variable total
    private double importTotal() {
        double total = 0;
        for (Lloguer lloguer: lloguers) {
            total += quantitat(lloguer) * EUROS_PER_UNITAT_DE_COST;
        }
        return total;
    }
    // Variable bonificacions
    private int bonificacionsTotal() {
        int bonificacions = 0;
        for (Lloguer lloguer: lloguers) {
            bonificacions += lloguer.bonificacions();
        }
        return bonificacions;
    }
    // ############## METODES LLEUGERS ######################################
    // construcció de capçalera
    private String composaCapsalera() {
        String cap = "Informe de lloguers del client " +
         getNom() +
         " (" + getNif() + ")\n";
        return cap;
    }
    // composa detall
    private String composaDetall() {
        String resultat = "";
        for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.calculQuantitatsPerLloguer() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
        }
        return resultat;
    }
    // composa peu
    private String composaPeu() {
        String resultat = "";
        resultat += "Import a pagar: " + importTotal() + "€\n" +
            "Punts guanyats: " + bonificacionsTotal() + "\n";
        return resultat;
    }
    // ####################### informeHTML() ############################
    public String informeHTML() {
        return composaCapsaleraHTML() + composaDetallHTML() + composaPeuHTML();
    }
    public String composaCapsaleraHTML() {
        return String.format("<p>Informe de lloguers del client <em>%s</em> (<strong>%s</strong>)</p>%n", this.getNom(), this.getNif());
    }
    public String composaDetallHTML() {
        Locale.setDefault(Locale.US);
        String doubleFormat;
        String resultat = "<table>\n  <tr>\n    <td><strong>Marca</strong></td>\n    <td><strong>Model</strong></td>\n    <td><strong>Import</strong></td>\n  </tr>\n";
        for (Lloguer lloguer : lloguers) {
            resultat += String.format("  <tr><td>%s</td><td>%s</td><td>%s€</td></tr>\n", lloguer.getVehicle().getMarca(), lloguer.getVehicle().getModel(), String.format("%.1f", lloguer.calculQuantitatsPerLloguer() * EUROS_PER_UNITAT_DE_COST)); }
        resultat += "</table>\n";
        return resultat;
    }
    public String composaPeuHTML() {
        Locale.setDefault(Locale.US);
        String doubleFormat = String.format("%.1f", this.importTotal());
        return String.format("<p>Import a pagar: <em>%s€</em></p>%n<p>Punts guanyats: <em>%d</em></p>", doubleFormat, this.bonificacionsTotal());
    } 
}
