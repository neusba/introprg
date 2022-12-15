/* Versió encara més millorada del exercici anterior
 * Aquesta vegada la sortida final només mostrarà les notes que no són la més alta
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
		if (contador < 3) {
			System.out.println("Calen com a mínim dues notes");
		} else {
			String llistaFinal = UtilString.filtraNotes(llistaNotes, notaMesAlta);
			System.out.printf("La nota més alta és %d. ", notaMesAlta);
			if (llistaFinal.isEmpty()) {
				System.out.print("No queda cap altra nota.");
			} else {
				String llistaFinalOrdenada = UtilString.ordenaNotes(llistaFinal);
				System.out.printf("La resta de notes és: %s", llistaFinalOrdenada);
			}
		}
	}
}

