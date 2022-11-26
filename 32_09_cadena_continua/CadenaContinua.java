/* Versió millorada del exercici cadena continua, aquesta vegada void main s'encarregarà obtenir les dades i el següent mòdul serà el que mostri la cadena */

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
		int longitud = Integer.parseInt(Entrada.readLine());
		if (longitud < 1) {
			return;
		}
		// cridem al mòdul
		mostraCadenaContinua(text, longitud);
	}
	// Mòdul encarregat de mostrar la cadena
	public static void mostraCadenaContinua(String text, int longitud) {
		// fem el mòdul de la longitud demanada entre la longitud del text
		int modul = longitud % text.length();
		if (modul == 0) { // Si és 0, només necessitarem repetir la paraula x vegades perquè la seva longitud encaixa amb la demanada.
			int repeticio = longitud / text.length(); // La utilitzarem per saber quantes vegades hem de repetir la paraula sencera.
			System.out.println(text.repeat(repeticio));
		} else if (modul == 1) {
			System.out.println(text.charAt(0));
		} else {
			System.out.print(text);
			for (int i=0; i < modul; i++) {
				System.out.print(text.charAt(i));
			}
		}
	}
}



