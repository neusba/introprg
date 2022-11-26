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
		int modul = longitud % (text.length()); // Serán les lletres extres després de la paraula estàndar. 
		int repeticio = longitud / text.length(); // La repetició és les vegades que es repetirà la paraula sencera per omplir el recorregut dels caràcter demanats
		if (modul == 0) {
			System.out.print(text.repeat(repeticio)); // Si el mòdul eś 0 no podem saber les lletres restants, però amb la repetició sabem quantes vegades es repeteix la paraula en el recorregut	
		} else if (modul != 0) {
			System.out.print(text.repeat(repeticio)); // En aquest cas la repeticio la utilitzem per saber quantes vegades està la paraula estàndar abans de les lletres extres
			for (int inici=0; inici < modul; inici++) {
				System.out.print(text.charAt(inici));
			}
		}
	}
}


