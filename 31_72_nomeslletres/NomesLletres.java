/* Programa que demana un text i mostra només les lletres que conté. Cada lletra apareixerà separada per una coma, els altrs signes no es mostraran per pantalla */

public class NomesLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String textLletres = "";

		for (int posicio=0; posicio < text.length(); posicio++) {
			if (Character.isLetter(text.charAt(posicio))) {
				textLletres = textLletres + text.charAt(posicio);
			}
		}
		for (int lletres=0; lletres < textLletres.length(); lletres++) {
			if (lletres == 0) {
				System.out.print(textLletres.charAt(lletres) + ",");
			} else if (lletres == textLletres.length() - 1) {
				System.out.print(" " + textLletres.charAt(lletres));
			} else {
				System.out.print(" " + textLletres.charAt(lletres) + ",");
			}
		}
	}
}
