/* Programa que demana un text i una posició i retorna una resposta segons el caràcter ubicat en la posició */

public class AnalitzaCaracter {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		System.out.println("Posició?");
		int posicio = Integer.parseInt(Entrada.readLine());
		
		if (Math.abs(posicio) > text.length()) {
			System.out.println("Fora de rang");
		} else {
			if (posicio < 0) {
				posicio = text.length() + posicio;
			}
			if (Math.abs(posicio) > text.length()) {
				System.out.println("Fora de rang");
			} else {

				char posicioText = text.charAt(posicio);

				if (Character.isLetter(posicioText)) {
					String isLetter = String.format("\'%c\' és una lletra", posicioText);
					System.out.println(isLetter);
				} else if (Character.isDigit(posicioText)) {
					String isDigit = String.format("\'%c\' és un nombre", posicioText);
					System.out.println(isDigit);
				} else if (!Character.isLetter(posicioText) && !Character.isDigit(posicioText)) {
					String altraCosa = String.format("\'%c\' és una altra cosa", posicioText);
					System.out.println(altraCosa);
				}
			}
		}
	}
}

