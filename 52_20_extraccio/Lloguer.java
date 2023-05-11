/* Classe Lloguer per el programa de Gestió de Lloguers.
 * Un lloguer esta composat per tots els vehicles llogats i els seus imports i bonificacions.
 * Cada client té un lloguer amb tota la informació.
 * Per afegir un lloguer a un client, primer cal obtenir la llista de lloguers del client i posteriorment afegir el nou.
 * La relació entre Lloguer i Vehicle requereix una propietat.
 */

// IMPORTS

public class Lloguer {
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
    // ############# MOVIMENT DE MÈTODE #############
    public double quantitat() {
        double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (this.getDies() > 3) {
                    quantitat += (this.getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (this.getDies() > 2) {
                    quantitat += (this.getDies() - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * 6;
                break;
        }
        return quantitat;
    }
}
