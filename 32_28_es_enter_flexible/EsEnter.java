/* Versió flexible de l'exercici "Es Enter"
 * Utilitzarem dues funciones més en cas de que ho volem estricte o no
 */
public class EsEnter {
	public static void main(String[] args) {
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String text = Entrada.readLine();
		text = text.strip();
		while (!text.isEmpty()) {
			boolean enter = UtilString.esEnter(text);
			if (enter) {
				System.out.println("És enter");
			} else {
				System.out.println("No és enter");
			} 
		text = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
