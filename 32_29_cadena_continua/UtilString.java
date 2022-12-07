/* Mòdul que crea una cadena continua d'un text i un nombre donat per entrada
 *
 */

public class UtilString {
	public static String cadenaContinua(String text, int longitudInt) {
		String cadenaContinua = "";
		// fem el mòdul de la longitud demanada entre la longitud del text
		int modul = longitudInt % (text.length()); // Serán les lletres extres després de la paraula estàndar. 
		int repeticio = longitudInt / text.length(); // La repetició és les vegades que es repetirà la paraula sencera per omplir el recorregut dels caràcter demanats
		if (modul == 0) {
			cadenaContinua = text.repeat(repeticio);  // però amb la repetició sabem quantes vegades es repeteix la paraula en el recorregut	
		} else if (modul != 0) {
			cadenaContinua = text.repeat(repeticio); // En aquest cas la repeticio la utilitzem per saber quantes vegades està la paraula estàndar abans de les lletres extres
			for (int inici=0; inici < modul; inici++) {
				cadenaContinua = text.repeat(repeticio);
			}
		}
		return cadenaContinua;
	}
	// Funció per calcular si un string és un nombre enter o no
	public static boolean esEnter(String longitud) {
		if (longitud.isEmpty()) {
			return false;
		} else {
			if (longitud.endsWith("-") || longitud.endsWith("+")) {
				return false;
			}
			for (int i=0; i < longitud.length(); i++) {
				if (Character.isLetter(longitud.charAt(i))) {
					return false;
				}	
			}
		}
		return true;
	}
}
