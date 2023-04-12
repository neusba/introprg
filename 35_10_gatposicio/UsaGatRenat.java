/* Fitxer que conté el main per executar l'exercici 35_10 
 * Desarrollar más capçalera para que no de problemas
 */

public class UsaGatRenat {
      public static void main(String[] args){
          try {
              GatPosicio posicio = GatPosicio.fromString(args[0]);
              GatRenat renat = new GatRenat(posicio);
              System.out.println("El gat Renat està: " + renat.getPosicio());
         } catch (IllegalArgumentException e) {
             System.out.println(e);
         }
      }
 }
