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
		String llistaNotes = "";
		while (nota > 0) {
			if (nota >= notaMesAlta) { 
				notaMesAlta = nota;
		       	}
			// transformació de int a string i afegim a la llista en un mòdul
			llistaNotes = UtilString.toString(nota, llistaNotes);
			nota = Integer.parseInt(Entrada.readLine());
			contador += 1;
		}
		if (contador < 3) {
			System.out.println("Com a mínim calen dues notes");
		} else {
			System.out.printf("La nota més alta és %d de les introduïdes: ", notaMesAlta);
			// Funció String final
			String mostraNotes = UtilString.mostraNotes(llistaNotes);
			System.out.println(mostraNotes);
		}
	}
}
				
