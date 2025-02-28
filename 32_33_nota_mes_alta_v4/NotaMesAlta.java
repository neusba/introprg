/* Versió encara més millorada del exercici anterior
 * Aquesta vegada la sortida final només mostrarà les notes que no són més alta però en ordre descendent.
 * Utilitzarem només les eines conegudes fins ara
 */
public class NotaMesAlta {
	public static void main(String[] args) {
		System.out.println("Introdueix les notes (-1 per finalitzar)");
		int nota = Integer.parseInt(Entrada.readLine());
		int notaMesAlta = nota;
		int contador = 1;
		String llistaNotes = "";
		while (nota > 0) {
			if (nota >= notaMesAlta) {
				notaMesAlta = nota;
			}
			llistaNotes = UtilString.toString(nota, llistaNotes);
			nota = Integer.parseInt(Entrada.readLine());
			contador += 1;
		}
		mostraSortides(contador, llistaNotes, notaMesAlta);
	}
	// Mòdul per mostrar les sortides del programa
	public static void mostraSortides(int contador, String llistaNotes, int notaMesAlta) {
		if (contador < 3) {
			System.out.println("Com a mínim calen dues notes");
		} else {
			String llistaFiltrada = UtilString.filtraNotes(llistaNotes, notaMesAlta);
			String llistaNoRepetits = UtilString.noRepetits(llistaFiltrada);
			String llistaFiltradaDescendent = UtilString.llistaDescendent(llistaNoRepetits);
			System.out.printf("La nota més alta és %d. ", notaMesAlta);
			if (llistaFiltrada.isEmpty()) {
				System.out.print("No queda cap altra nota.");
			} else {
				String llistaFiltradaOrdenada = UtilString.ordenaNotes(llistaFiltradaDescendent);
				System.out.printf("La resta de notes és: %s", llistaFiltradaOrdenada);
			}
		}
	}
}

