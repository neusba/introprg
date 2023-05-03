/* Fitxer que conté el main que s'utilizarà per fer ús de la classe Punt la qual estarà sent testejada
 * pels tests creats a la classe TestPunt
 */

public class UsaPunt {
    public static void main(String[] args){
        Punt punt = new Punt();
        int x = 0;
        int y = 0;
        if (args.length > 0) {
            try {
                x = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                x = x;
            }
        } else if (args.length > 1) {
            try {
                y = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                y = y;
            }
        }
        punt.setX(x);
        punt.setY(y);
        System.out.printf("punt.getX() -> %d%n", punt.getX());
        System.out.printf("punt.getY() -> %d%n", punt.getY());
    }
}
