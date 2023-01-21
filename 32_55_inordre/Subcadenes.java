/* Programa que obté un text per entrada i mostra per sortida estàndard totes les subcadenes possibles
 * El cas base serà quan la cadena actual sigui menor o igual a 1
 * No està permés utilitzar while o for
 */

public class Subcadenes {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		String lletres = UtilString.nomesLletres(text);						// mòdul que retorna el text original amb només les lletres
		int meitat = lletres.length() / 2;							// mida per indicar els paràmetres per a cada meitat del text
		String primeraMeitat = lletres.substring(0, meitat);					// primera meitat del text
		mostraSubcadena(primeraMeitat);
		System.out.printf("%4d: %s%n", lletres.length(), lletres);				// Primera sortida amb la frase sencera
		String segonaMeitat = lletres.substring(meitat);					// segona meitat del text
		mostraSubcadena(segonaMeitat);
	}

	// Procediment que mostra per entrada estàndard les subcadenes possibles del text donat
	public static void mostraSubcadena(String text) {
		if (text.length() <= 1) {
			System.out.printf("%4d: %s%n", text.length(), text);				// cas base
			return;
		}
		
		int meitat = text.length() / 2;								
		String primeraMeitat = text.substring(0, meitat);
		String segonaMeitat = text.substring(meitat);

		mostraSubcadena(primeraMeitat);
		System.out.printf("%4d: %s%n", text.length(), text);						
		mostraSubcadena(segonaMeitat);
	}

}
