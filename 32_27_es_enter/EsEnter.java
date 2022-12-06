/* Versió modular del exercici "És Enter"
 * Aquesta vegada els càlculs els duura a terme la funció esEnter()
 * L'entrada necessita ser pulida d'espais en blanc abans d'entrar a la funció
 */

public class EsEnter {
	public static void main(String[] args) {
		boolean enter = true;
		while (enter) {
			System.out.println("Introdueix texts (enter sol per finalitzar)");
			String text = Entrada.readLine();
			text = text.strip();
			if (UtilString.esEnter(text)) {
				System.out.println("És enter");
			} else {
				System.out.println("No és enter");
			} 
		}
		System.out.println("Adéu");
	}
}


		
