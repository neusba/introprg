/* Fitxer que conté el main per executar el programa que tracta la classe Hora
 * En aquesta ocasió utilitzarem el try catch de manera que es capturi
 * una excepcpió més concreta: IllegalArgumentException
 */

public class UsaHora {
    public static void main(String[] args) {
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}
