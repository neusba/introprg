/* Programa que a partir de l'especificació d'una forma la dibuixa a través d'un string
 * Les especificacions es rebran com arguments de la línea de comandes
 * 
 */

public class Formes {
	public static void main(String[] args) {
		String arg = "";
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
			arg = args[i];						// fiquem a un string l'argument a tractar
		}

		boolean dimensioCorrecte = especificacioDimensions(arg); 	// comprovem que les dimension son vàlides
		if (dimensioCorrecte) {
			System.out.println("correcte");
		} else {
			System.out.println("incorrecte");
		}
		boolean formaCorrecte = especificacioForma(arg);		// comprovem que el caràcter donat és vàlida per crear la forma
		if (formaCorrecte) {
			System.out.println("correcte");
		} else {
			System.out.println("incorrecte");
		}
		return;
	}
	
	public static boolean especificacioDimensions(String arg) {	 	//  funcio que comprova que les dimensions donades son vàlides
		String[] coordenades = arg.split("x");				// ! Tener en cuenta que una forma possible es 'x'
		if (coordenades.length > 2) return false;
		for (int i=1; i<=coordenades.length - 2; i++) {
            		if (! UtilString.esEnter(coordenades[i])) return false;
            		int valor = Integer.parseInt(coordenades[i]);
            		if (valor < 1 || valor > 99) return false;
        	}
        	return true;
	}

	public static boolean especificacioForma(String arg) {			// funcio que comprova si l'especificació de la forma donada és correcte
		//String forma = arg.substring(arg.length() - 1);
		String formes = "\\,|,-,+,/,x,=,||,++";
		String[] formesArray = formes.split(",");
		String forma = "";
		String dosCaracters = arg.substring(arg.length() - 2);
		System.out.println(dosCaracters);
		String unCaracter = arg.substring(arg.length() - 1);
		System.out.println(unCaracter);
		for (int i=0; i<arg.length(); i++) {
			for (int j=0; j<formesArray.length; j++) {
				if (dosCaracters.equals(formesArray[i])) {
					return true;
				}
				if (unCaracter.equals(formesArray[i])) {
					return true;
				}
			}
		}
		return false;
	}
}

			
			


