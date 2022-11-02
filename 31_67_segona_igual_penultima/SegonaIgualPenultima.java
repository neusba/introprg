/* Programa que demana texts fins que rep una cadena buida, cada cop que rebi un text no buit, indica si la segona lletra és igual a la penúltima */

public class SegonaIgualPenultima {
	public static void main(String[] args) {
		System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
		String text = Entrada.readLine();
		
		while (!text.isEmpty() || !text.isBlank()) {
			if (text.length() <= 1) {
				System.out.println("Segona diferent de penúltima");
			}

			char segona = text.charAt(1);
			char penultima = text.charAt(text.length() - 2);
			String stringSegona = Character.toString(segona);
			String stringPenultima = Character.toString(penultima);

			if (stringSegona.equals(stringPenultima)) {
				System.out.println("Segona igual a penúltima");
			} else {
				System.out.println("Segona diferent de penúltima");
			}
			text = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
			

	
