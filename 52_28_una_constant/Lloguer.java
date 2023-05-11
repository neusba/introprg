/* Classe Lloguer per el programa de Gestió de Lloguers.
 * Un lloguer esta composat per tots els vehicles llogats i els seus imports i bonificacions.
 * Cada client té un lloguer amb tota la informació.
 * Per afegir un lloguer a un client, primer cal obtenir la llista de lloguers del client i posteriorment afegir el nou.
 * La relació entre Lloguer i Vehicle requereix una propietat.
 */
// IMPORTS 
public class Lloguer {
    private static final double UNITAT_DE_COST_BASIC = 3;
    private static final double DIES_INICIALS_BASIC = 3;
    private static final double MITJA_DIES_BASIC = 1.5;
    private static final double UNITAT_DE_COST_GENERAL = 4;
    private static final double DIES_INICIALS_GENERAL = 2;
    private static final double MITJA_DIES_GENERAL = 2.5;
    private static final double UNITAT_DE_COST_LUXE = 6;
    // Propietats
    private int dies;
    private Vehicle vehicle;

    // CONSTRUCTOR
    public Lloguer(Vehicle vehicle, int dies) {
        this.vehicle = vehicle;
        this.dies = dies;
    }

    // GETTERS
    public int getDies() {
        return this.dies;
    }
    public Vehicle getVehicle() {
        return this.vehicle;
    }

    // SETTERS
    public void setDies(int dies) {
        this.dies = dies;
    }

    // METODES
    // ############# MOVIMENT DE MÈTODES #############
    // Client - Lloguer
    public double quantitat() {
        double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += UNITAT_DE_COST_BASIC;
                if (this.getDies() > DIES_INICIALS_BASIC) {
                    quantitat += (this.getDies() - DIES_INICIALS_BASIC) * MITJA_DIES_BASIC;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += UNITAT_DE_COST_GENERAL;
                if (this.getDies() > DIES_INICIALS_GENERAL) {
                    quantitat += (this.getDies() - DIES_INICIALS_GENERAL) * MITJA_DIES_GENERAL;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * UNITAT_DE_COST_LUXE;
                break;
        }
        return quantitat;
    }
    // Moviment de mètode de càlcul de bonificacions
    // Client - Lloguer
    public int bonificacions() {
        int bonificacions = 1;
        // afegeix bonificació per dos dies de lloguer de Luxe
        if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
                this.getDies()> 1) {
            bonificacions ++;
        }
        return bonificacions;
    }
}
