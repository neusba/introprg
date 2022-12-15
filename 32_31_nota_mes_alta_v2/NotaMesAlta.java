/* Versió millorada del exercici anterior, questa vegada mostrarem totes les notes introduïdes
 * Incloent les que es repeteixen
 */
public class NotaMesAlta {
	public static void main(String[] args) {
		// obtenció de dades
		System.out.println("Introdueix les notes (-1 per finalitzar)");
		int nota = Integer.parseInt(Entrada.readLine());
		int notaMesAlta = nota;
		int contador = 1;
		String notaString; // int a String
		String llistaNotes = ""; // Llista de notes de tipus String
		// bucle
		while (nota > 0) {
			if (nota >= notaMesAlta) {
				notaMesAlta = nota;
			}
			// transformació de int a string
			notaString = Integer.toString(nota);
			llistaNotes = llistaNotes + notaString;
			// demanem la nota again
			nota = Integer.parseInt(Entrada.readLine());
			contador += 1;
		}
		if (contador < 3) {
			System.out.println("Calen dues dues notes com a mínim");
		} else {
			System.out.printf("La nota més alta és %d de les introduïdes: ", notaMesAlta);
			for (int i=0; i < llistaNotes.length(); i++) {
				if (i == llistaNotes.length() - 2) {
					System.out.print(llistaNotes.charAt(i) + " i ");
				} else if (i == llistaNotes.length() - 1) {
					System.out.print(llistaNotes.charAt(i));
				} else {
					System.out.print(llistaNotes.charAt(i) + ", ");
				}
			}
		}
	}
}
				
