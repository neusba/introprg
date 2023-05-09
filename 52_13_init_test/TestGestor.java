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
}
