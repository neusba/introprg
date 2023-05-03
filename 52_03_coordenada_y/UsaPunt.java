/* Fitxé que conté el main que farà ús de la classe Punt la qual estarà sent provada pels nostres tests
 * Aquesta classe interactua amb les altres dues
 */

public class UsaPunt {
    public static void main(String[] args){
        Punt punt = new Punt();
        System.out.printf("punt.getX() -> %d%n", punt.getX());
        System.out.printf("punt.getY() -> %d%n", punt.getY());
    }
}
