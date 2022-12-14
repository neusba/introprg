/* Versió millorada del exercici "Cadena continua"
 * El qual consta d'imprimir un text amb el nombre de caràcters donat per entrada
 */
public class CadenaContinua {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		if (text.isEmpty()) {
			System.out.println("error");
			return;
		}
		System.out.println("Nombre?");
		String longitud = Entrada.readLine();
		boolean esEnter = UtilString.esEnter(longitud);
		if (esEnter) {
			int longitudInt = Integer.parseInt(longitud);
			if (longitudInt < 1) {
				return;
			}
			String cadenaContinua = UtilString.cadenaContinua(text, longitudInt);
			System.out.println(cadenaContinua);
		} else {
			System.out.println("error");
		}
	}
}
