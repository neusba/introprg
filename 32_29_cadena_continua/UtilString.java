/* Mòdul que crea una cadena continua d'un text i un nombre donat per entrada
 *
 */

public class UtilString {
	public static boolean esEnter(String nombre) {
		// Funció per calcular si un string és un nombre enter o no
		if (nombre.isEmpty()) {
			return false;
		} else {
			if (nombre.endsWith("-") || nombre.endsWith("+")) {
				return false;
			}
			for (int i=0; i < nombre.length(); i++) {
				if (Character.isLetter(nombre.charAt(i)) || Character.isWhitespace(nombre.charAt(i))) {
					return false;
				}	
			}
		}
		return true;
	}
	// Funció que crea la cadena continua segons el text i el nombre donat
	public static String cadenaContinua(String text, int longitud) {
		String cadenaContinua = "";
		int modul = longitud % (text.length()); // Serán les lletres extres després de la paraula estàndar. 
		int repeticio = longitud / text.length(); // La repetició és les vegades que es repetirà la paraula sencera per omplir el recorregut dels caràcter demanats
		if (modul == 0) {
			cadenaContinua = text.repeat(repeticio); // Si el mòdul eś 0 no podem saber les lletres restants, 
								  // però amb la repetició sabem quantes vegades es repeteix la paraula en el recorregut	
		} else if (modul != 0) {
			cadenaContinua = text.repeat(repeticio); // En aquest cas la repeticio la utilitzem per saber quantes vegades està la paraula estàndar abans de les lletres extres
			for (int inici=0; inici < modul; inici++) {
				cadenaContinua = cadenaContinua + text.charAt(inici);
			}
		}
		return cadenaContinua;
	}
}
