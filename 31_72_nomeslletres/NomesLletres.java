/* Programa que demana un text i mostra només les lletres que conté. Cada lletra apareixerà separada per una coma, els altrs signes no es mostraran per pantalla */

public class NomesLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		for (int posicio=0; posicio < text.length(); posicio++) {
			if (Character.isLetter(text.charAt(posicio))) { 
				if (posicio == 0) {
					System.out.print(text.charAt(posicio) + ",");
				} else if (posicio == text.length() - 1) {
					System.out.print(" " + text.charAt(posicio));
				} else if ((posicio > 0) && (posicio < text.length() - 1)) {
				       System.out.print(" " + text.charAt(posicio) + ",");
				}
		 			
			}
		}
	}
}
