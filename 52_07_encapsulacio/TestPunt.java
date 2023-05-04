/* Fitxer que conté els test per provar que la classe Punt compleix el requisits necessaris per desenvolupar el codi de manera adequada
 * Descripción blablabla
 */

// IMPORTS
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPunt {
    // ####################### CONSTRUCTORS ########################### 
    @Test
    public void constructor() {
        // comprova que el constructor pugui ser cridat
        new Punt();
    }

    @Test
    public void constructorEspecific() {
        Punt p = new Punt(1, 2);
        Assertions.assertAll(
            () -> Assertions.assertEquals(1, p.getX()),
            () -> Assertions.assertEquals(2, p.getY())
        );
    }

    // ###################### GETTERS I SETTERS #######################
    @Test
    public void constructorDefecteXZero() {
        // comprova que el constructor inicialitza a 0 la propietat x de Punt
        Punt p = new Punt();
        Assertions.assertEquals(0, p.getX());
    }

    @Test
    public void constructorDefecteYZero() {
        // comprova que el constructor inicialitza a 0 la propietat y de punt
        Punt p = new Punt();
        Assertions.assertEquals(0, p.getY());
    }

    @Test
    public void setX42() {
        Punt p = new Punt();
        p.setX(42);
        Assertions.assertEquals(42, p.getX());
    }

    @Test
    public void setY42() {
        Punt p = new Punt();
        p.setY(42);
        Assertions.assertEquals(42, p.getY());
    }

    // ####################### METODES ##################################
    @Test
    public void sumaCorrecte() {
        Punt p1 = new Punt(2, 3);
        Punt p2 = new Punt(4, 5);
        p1.suma(p2);

        Assertions.assertAll(
                () -> Assertions.assertEquals(6, p1.getX()),
                () -> Assertions.assertEquals(8, p1.getY())
        );
    }
}
