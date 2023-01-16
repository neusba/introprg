/* Programa que demana un text i mostra només les lletres d'aquest
 * No es pot utilitzar ni for ni while
 */

public class MostraLletres {
	public static void main(String[] args) {
        	System.out.println("Text?");
        	String text = Entrada.readLine();
        	mostraLletres(text);
        	System.out.println();   // un salt de línia final
    	}

	// mostra les lletres del text
	public static void mostraLletres(String text) {
		if (text.isEmpty()) {
			return;
		}
		// hi ha al menys un caràcter. Comptem quantes lletres hi queden

        	// considerem el primer caràcter
        	char primer = text.charAt(0);
        	if (Character.isLetter(primer)) {
			System.out.println(primer);
        	}
	
        	// considerem les lletres que conté la resta del text
        	String restaText = text.substring(1);   // resta del text
        	mostraLletres(restaText);      // crida recursiva
	}
}


