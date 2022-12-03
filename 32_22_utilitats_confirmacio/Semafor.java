/* Versió millorada del programa del semàfor
 * Aquesta vegada s'assegura que els usuaris son majors d'edats abans de donar l'ordre
 */

public class Semafor {
	public static void main(String[] args) {
		// obtenim dades
		System.out.println("Ets major d'edat?");
		String resposta = Entrada.readLine();
		boolean majorEdat = UtilitatsConfirmacio.respostaABoolean(resposta); // Cridem al mòdul que hem creat per confirmar respostes
		if (!majorEdat) {
			System.out.println("No pots fer servir aquest programa sense supervisió");
		} else {
			System.out.println("Color?");
			String color = Entrada.readLine();
			if (color.equalsIgnoreCase("groc")) {
				System.out.println("corre!");
			} else if (color.equalsIgnoreCase("verd")) {
				System.out.println("passa");
			} else if (color.equalsIgnoreCase("vermell")) {
				System.out.println("espera");
			}
		}
	}
}







