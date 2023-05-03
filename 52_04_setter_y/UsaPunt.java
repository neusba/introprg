/* Fitxer que conté el main que s'utilizarà per fer ús de la classe Punt la qual estarà sent testejada
 * pels tests creats a la classe TestPunt
 */

public class UsaPunt {
    public static void main(String[] args){
        Punt punt = new Punt();
        int x;
        int y;
        try {
            x = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            x = 0;
        }
        try {
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            y = 0;
        }

        punt.setX(x);
        punt.setY(y);
        System.out.printf("punt.getX() -> %d%n", punt.getX());
        System.out.printf("punt.getY() -> %d%n", punt.getY());
    }
}
