/* Classe Gestor Lite que permet fer proves bàsiques del codi
 * Conté mètodes estàtics i un main en el que podem fer la prova que volguem
 */

import java.util.ArrayList;

public class GestorLite {
    public static void main(String[] args) {
        Client demo = creaClientDemo();
        mostraClient(demo);
    }
    
    // crea un client de prova i el retorna
    public static Client creaClientDemo() {
        return new Client("41008208J", "Neus Bravo Arias", "601125828");
    }

    // recibe un client i muestra todos sus datos(Client: nom, nif, tlf. Lloguers: num lloguers, vehicle, dies llogats, dades de la resta de lloguers)
    public static void mostraClient(Client client) {
        System.out.printf("Client: %s%n        %s%n        %s%n", client.getNom(), client.getNif(), client.getTelefon());
        System.out.printf("Lloguers: %d", client.getLloguers().size());
        ArrayList<Lloguer> lloguers = client.getLloguers();
        int tmp = 0;
        for (Lloguer lloguer : lloguers) {
            tmp = tmp + 1;
            System.out.printf("%d. vehicle: %s %s%ndies llogat: %d%n", tmp, lloguer.getVehicle().getMarca(), lloguer.getVehicle().getModel(), lloguer.getDies());
        }
    }
} 

