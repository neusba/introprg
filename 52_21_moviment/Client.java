/* Classe Client d'exemple per la creació de classes del programa de Gestor de Lloguers
 * Al client se li generà un informe amb el registre de tots els seus lloguers i els seus respectius imports i bonificiacions afegides.
 */

import java.util.ArrayList;

public class Client {
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
        double total = 0;
        int bonificacions = 0;
        String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            bonificacions += lloguer.bonificacionsDeLloguer();
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (quantitat(lloguer) * 30) + "€" + "\n";
            total += quantitat(lloguer) * 30;
        }

        // afegeix informació final
        resultat += "Import a pagar: " + total + "€\n" +
            "Punts guanyats: " + bonificacions + "\n";
        return resultat;
    }
    // ############### REMPLAÇAMENT DE VARIABLES PER CRIDA ###################
    public double quantitat(Lloguer lloguer) {
        double quantitat = lloguer.quantitat();
        return quantitat;
    }
}
