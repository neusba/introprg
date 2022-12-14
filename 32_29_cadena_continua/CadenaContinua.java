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
		String nombre = Entrada.readLine();
		boolean esEnter = UtilString.esEnter(nombre);
		if (esEnter) {
			int longitud = Integer.parseInt(nombre);
			if (longitud < 1) {
				return;
			} else {
				String cadenaContinua = UtilString.cadenaContinua(text, longitud);
				System.out.println(cadenaContinua);
			}
		} else {
			System.out.println("error");
		}
	}
}


