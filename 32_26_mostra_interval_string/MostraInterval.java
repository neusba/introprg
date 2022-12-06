/* Versió millorada del exercici "Mostra interval"
 * Aquesta vegada utilitzarem mòduls
 * Ha de existir un mòdul anomenat intervalString que realitzi la funció de trobar els caràcters
 */

public class MostraInterval {
	public static void main(String[] args) {
		// obtenció de dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int fi = Integer.parseInt(Entrada.readLine());
		String interval;

		// Valorem les possibilitats
		if (inici < 0) {
			inici = 0;
			if (fi < 0) {
				fi = 0;
			} else if (fi > text.length() - 1) {
				fi = text.length() - 1;
			}
			interval = UtilString.intervalString(text, inici, fi);
		} else if (inici > text.length() - 1) {
			inici = text.length() - 1;
			if (fi < 0) {
				fi = 0;
			} else if (fi > text.length() - 1) {
				fi = text.length() - 1;
			}
			interval = UtilString.intervalString(text, inici, fi);
		} else {
			if (fi < 0) {
				fi = 0;
			} else if (fi > text.length() - 1) {
				fi = text.length() - 1;
			}
			interval = UtilString.intervalString(text, inici, fi);
		}
		System.out.println(interval);
	}
}
