/* Test de proves unitàries pel Gestor Lite
 * En aquesta ocasió generarem una prova unitària pel mètode Client.informe()
 * ########
 * Crear nova instància de demo Client.
 * A partir de l'execució de Gestorlite, recollir en un String el valor esperat.
 * Comparar el resultat esperat i el obtingut per veure si són iguals.
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestGestor {
    @Test
    public void comprovaInforme() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        String esperat = demo.informe();

        Assertions.assertEquals(esperat, demo.informe());
    }
    // cap lloguer
    @Test
    public void capLloguer() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        String esperat = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%nImport a pagar: 0.0€%nPunts guanyats: 0%n");

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer BASIC per 1 dia
    @Test
    public void lloguerBasicUnDia() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 1));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 90.0€\nImport a pagar: 90.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer BASIC per 2 dies
    @Test
    public void lloguerBasicDosDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 2));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 90.0€\nImport a pagar: 90.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer BASIC per 3 dies
    @Test
    public void lloguerBasicTresDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 3));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 90.0€\nImport a pagar: 90.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer BASIC per 5 dies
    @Test
    public void lloguerBasicCincDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 5));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 180.0€\nImport a pagar: 180.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 2 lloguer BASIC per 1 dia
    @Test
    public void dosLloguersBasicUnDia() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 1));
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 1), 1));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 90.0€\n\tTata Vista: 90.0€\nImport a pagar: 180.0€\nPunts guanyats: 2\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 2 lloguer BASIC per 3 dies
    @Test
    public void dosLloguersBasicTresDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 3));
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 1), 3));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 90.0€\n\tTata Vista: 90.0€\nImport a pagar: 180.0€\nPunts guanyats: 2\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 2 lloguer BASIC per 5 dies
    @Test
    public void dosLloguersBasicCincDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 1), 5));
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 1), 5));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 180.0€\n\tTata Vista: 180.0€\nImport a pagar: 360.0€\nPunts guanyats: 2\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer GENERAL per 1 dia
    @Test
    public void unLloguerGeneralUnDia() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 2), 1));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 120.0€\nImport a pagar: 120.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer GENERAL per 2 dies
    @Test
    public void unLloguerGeneralDosDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 2), 2));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 120.0€\nImport a pagar: 120.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer GENERAL per 3 dies
    @Test
    public void unLloguerGeneralTresDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 2), 3));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 195.0€\nImport a pagar: 195.0€\nPunts guanyats: 1\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 2 lloguers GENERAL per 4 dies
    @Test
    public void dosLloguersGeneralQuatreDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 2), 4));
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 2), 4));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 270.0€\n\tTata Vista: 270.0€\nImport a pagar: 540.0€\nPunts guanyats: 2\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 1 lloguer LUXE per 3 dies
    @Test
    public void unLloguerLuxeTresDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 3), 3));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 540.0€\nImport a pagar: 540.0€\nPunts guanyats: 2\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 2 lloguers LUXE per 2 dies
    @Test
    public void dosLloguersLuxeDosDies() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 3), 2));
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 3), 2));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 360.0€\n\tTata Vista: 360.0€\nImport a pagar: 720.0€\nPunts guanyats: 4\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // 3 lloguers LUXE per 1 dies
    @Test
    public void tresLloguersLuxeUnDia() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Fiat", "Uno", 3), 1));
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 3), 1));
        demo.getLloguers().add(new Lloguer(new Vehicle("Seat", "600", 3), 1));
        String esperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n\tFiat Uno: 180.0€\n\tTata Vista: 180.0€\n\tSeat 600: 180.0€\nImport a pagar: 540.0€\nPunts guanyats: 3\n";

        Assertions.assertEquals(esperat, demo.informe());
    }
    // ############################################## INFORME HTML #################################################
    @Test
    public void comprovaCapseleraHTML() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Seat", "600", 1), 2));
        String esperat = "<p>Informe de lloguers del client <em>Eugènia Salinas Roig</em> (<strong>51590695Q</strong>)</p>\n";

        Assertions.assertEquals(esperat, demo.composaCapsaleraHTML());
    }
    @Test
    public void comprovaDetallHTML() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 1), 5));
        demo.getLloguers().add(new Lloguer(new Vehicle("Seat", "600", 1), 2));
        String esperat = "<table>\n" + 
                          "  <tr>\n" +
                          "    <td><strong>Marca</strong></td>\n" +
                          "    <td><strong>Model</strong></td>\n" +
                          "    <td><strong>Import</strong></td>\n" +
                          "  </tr>\n" +
                          "  <tr><td>Tata</td><td>Vista</td><td>180.0€</td></tr>\n" +
                          "  <tr><td>Seat</td><td>600</td><td>90.0€</td></tr>\n" +
                          "</table>\n"; 

        Assertions.assertEquals(esperat, demo.composaDetallHTML());
    }
    @Test
    public void comprovaPeuHTML() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        demo.getLloguers().add(new Lloguer(new Vehicle("Tata", "Vista", 1), 5));
        String esperat = "<p>Import a pagar: <em>180.0€</em></p>\n" +
                         "<p>Punts guanyats: <em>1</em></p>";

        Assertions.assertEquals(esperat, demo.composaPeuHTML());
    }
    @Test
    public void informeHTMLDemo() {
        Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
        String esperat = demo.informeHTML();

        Assertions.assertEquals(esperat, demo.informeHTML());
    }
}
