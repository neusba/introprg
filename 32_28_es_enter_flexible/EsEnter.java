/* Versió flexible del exercici anterior 'És enter'
 * Aquesta vegada crearem la possiblitat d'acceptar números amb espais en blanc
 */

public class EsEnter {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String text = Entrada.readLine();
		// bucle while
		while (!text.isEmpty()) {
			System.out.println("Estricte?");
			String respostaEstricte = Entrada.readLine();
		       	boolean estricte = UtilString.respostaABoolean(respostaEstricte);
			boolean esEnter = UtilString.esEnter(text, estricte);
			if (esEnter) {
				System.out.println("És enter");
			} else {
				System.out.println("No és enter");
			}
			int aEnter = UtilString.aEnter(text, estricte);
			text = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}

