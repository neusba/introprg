/* Fitxer qeu conté el main que fara ús de les classes Punt i segment les qual han sigut creades amb el mètode TDD
 * per tant han anat sent provades mentre es creava el codi.
 */

public class UsaSegment {
     public static void main(String[] args){
         int x1 = 0;
         int y1 = 0;
         int x2 = 0;
         int y2 = 0;
        try {
            x1 = Integer.parseInt(args[0]);
        } catch (Exception e) {
        } finally {
            try {
                y1 = Integer.parseInt(args[1]);
            } catch (Exception e1) {
            } finally {
                try {
                    x2 = Integer.parseInt(args[2]);
                } catch(Exception e2) {
                } finally {
                    try {
                        y2 = Integer.parseInt(args[3]);
                    } catch (Exception e3) {
                    }
                }
            }
        }
         Punt punt1 = new Punt(x1, y1);
         Punt punt2 = new Punt(x2, y2);
         Segment segment1 = new Segment(punt1, punt2);
         Segment segment2 = new Segment();
         segment2.setP1(segment1.getP2());
         segment2.setP2(segment1.getP1());
         System.out.printf("p1: %s%n", punt1);
         System.out.printf("p2: %s%n", punt2);
         System.out.printf("s1: %s s1.longitud: %.02f%n", segment1, segment1.longitud());
         System.out.printf("s2: %s s2.longitud: %.02f%n", segment2, segment2.longitud());
     }
 }
