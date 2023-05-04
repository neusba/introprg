/* Tests JUnit per a la classe Segment, la qual anirem creant mitjançant el mètode TDD.
 * Abans de començar el codi de la classe, escriurem el test respectiu i el probarem
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestSegment {
    @Test
    public void constructor() {
        Segment s = new Segment();
        Assertions.assertAll(
                () -> Assertions.assertEquals(0, s.getP1().getX()),
                () -> Assertions.assertEquals(0, s.getP1().getY()),
                () -> Assertions.assertEquals(0, s.getP2().getX()),
                () -> Assertions.assertEquals(0, s.getP2().getY())
        );
    }

    @Test
    public void constructorEspecific() {
        Punt p1 = new Punt(2, 3);
        Punt p2 = new Punt(4, 5);
        Segment s = new Segment(p1, p2);

        Assertions.assertAll(
                () -> Assertions.assertEquals(p1, s.getP1()),
                () -> Assertions.assertEquals(p2, s.getP2())
        );
    }

    @Test
    public void metodeLongitud() {
        Punt p1 = new Punt(2, 3);
        Punt p2 = new Punt(4, 5);
        Segment s = new Segment(p1, p2);
        Assertions.assertEquals(2.82, s.longitud(), 0.01d);
    }
}
