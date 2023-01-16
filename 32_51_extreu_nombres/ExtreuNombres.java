/* Programa que demani un text i mostri només el caràcters numèrics que conté
 * No es pot utilitzar ni whilen ni for
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
		String nombres = "";
		if (text.isEmpty()) {
			return nombres;
		}
		char primer = text.charAt(0);
		if (Character.isDigit(primer)) {
			nombres = nombres + primer;
		}
		String restaText = text.substring(1);
		extreuNombres(restaText);
		return nombres;
	}
}

