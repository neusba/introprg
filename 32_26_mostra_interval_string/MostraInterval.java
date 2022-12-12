/* Versió millorada del exercici "Mostra interval"
 * Aquesta vegada utilitzarem mòduls
 * Ha de existir un mòdul anomenat intervalString que realitzi la funció de trobar els caràcters
 */

public class MostraInterval {
	public static void main(String[] args) {
		// obtenció de dades
		System.out.println("text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int fi = Integer.parseInt(Entrada.readLine());

		System.out.println(UtilString.intervalString(text, inici , fi));
	}
}
