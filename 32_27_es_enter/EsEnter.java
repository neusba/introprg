/* Versió modular del exercici "És Enter"
 * Aquesta vegada els càlculs els duura a terme la funció esEnter()
 * L'entrada necessita ser pulida d'espais en blanc abans d'entrar a la funció
 */

public class EsEnter {
	public static void main(String[] args) {
		String text = "hola"; // String per entrar al bucle i no repetir codi
		while (!text.isEmpty()) {
			System.out.println("Introdueix texts (enter sol per finalitzar)");
			text = Entrada.readLine();
			text = text.strip();
			boolean enter = UtilString.esEnter(text);
			if (enter) {
				System.out.println("És enter");
			} else {
				System.out.println("No és enter");
			} 
		}
		System.out.println("Adéu");
	}
}


		
