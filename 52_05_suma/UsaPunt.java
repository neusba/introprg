/* Fitxer que conté el main que s'utilizarà per fer ús de la classe Punt la qual estarà sent testejada
 * pels tests creats a la classe TestPunt
 */

public class UsaPunt {
    public static void main(String[] args){
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        try {
            x1 = Integer.parseInt(args[0]);
        } catch (Exception e) {
            try {
                y1 = Integer.parseInt(args[1]);
            } catch (Exception e1) {
                try {
                    x2 = Integer.parseInt(args[2]);
                } catch(Exception e2) {
                    try {
                        y2 = Integer.parseInt(args[3]);
                    } catch (Exception e3) {
                    }
                }
            }
        }
        Punt p1 = new Punt(x1, y1);
        Punt p2 = new Punt(x2, y2);
        System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());
        System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());
        p1.suma(p2);
        System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
    }
}
