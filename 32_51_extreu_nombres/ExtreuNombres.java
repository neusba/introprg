/* Programa que demani un text i mostri només el caràcters numèrics que conté
 * No es pot utilitzar ni while ni for
 */

public class ExtreuNombres {
	public static void main(String[] args) {
		System.out.println("Text?");
        	String text = Entrada.readLine();
        	String nombres = extreuNombres(text);
        	System.out.println(nombres);
    	}

	// extreu els nombres i els retorna concatenats
	public static String extreuNombres(String text) {
		if (text.isEmpty()) return "";			// cas base

		char primer = text.charAt(0);
		String digit = "";
		if (Character.isDigit(primer)) {		// tracta pas actual
			digit = digit + primer;
		}

		String textSubString = text.substring(1);
		String restaDigits = extreuNombres(textSubString);	// recursivitat

		String nombres = digit + restaDigits;	
		return nombres;
	}
}

