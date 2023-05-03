/* Fitxer que conté els test per provar que la classe Punt compleix el requisits necessaris per desenvolupar el codi de manera adequada
 * Descripción blablabla
 */

// IMPORTS
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPunt {
    @Test
    public void constructor() {
        // comprova que el constructor pugui ser cridat
        new Punt();
    }

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
}
