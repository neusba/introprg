/* Fitxer que conté el main per executar el programa que tracta amb la classe Hora
 * Aquesta vegada farem ús de l'algoritme TRY CATCH, que ens ajudarà a capturar les exceptions
 * als setters
 */

public class UsaHora {
    private static void canviaHora(Hora hora, int hores, int minuts, int segons) {
        // tractem d'assignar les hores
        try {
            hora.setHores(hores);
        } catch (Exception e) {
            System.out.println(e);
        }
        // tractem d'assignar els minuts
        try {
            hora.setMinuts(minuts);
        } catch (Exception e) {
            System.out.println(e);
        }
        // tractem d'assignar els segons
        try {
            hora.setSegons(segons);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        Hora hora = new Hora();
        System.out.println("Inicialment " + hora);
        System.out.println("Si intentem assignar a hores un -1");
        canviaHora(hora, -1, hora.getMinuts(), hora.getSegons());
        System.out.println("El valor resultant és " + hora);
        System.out.println();

        System.out.println("Si intentem assignar a minuts un -1");
        canviaHora(hora, hora.getHores(), -1, hora.getSegons());
        System.out.println("El valor resultant és " + hora);
        System.out.println();

        System.out.println("Si intentem assignar a segons un -1");
        canviaHora(hora, hora.getHores(), hora.getMinuts(), -1);
        System.out.println("El valor resultant és " + hora);
        System.out.println();
    }
}
