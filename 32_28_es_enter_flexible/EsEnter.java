/* Versió flexible de l'exercici "Es Enter"
 * Utilitzarem dues funciones més en cas de que ho volem estricte o no
 */
public class EsEnter {
	public static void main(String[] args) {
		String text = "222"; // Variable inventada per inicialitzar i no repetir
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
