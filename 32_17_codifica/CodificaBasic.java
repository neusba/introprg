/* Versió millorada del exercici 32_85, el qual consistia en codificar un text donat per l'usuari, aquesta vegada es codificarà segons el nombre que l'usuari decideixi */

public class CodificaBasic {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		if (quants < 0) {
			System.out.println("No s'accepten números negatius");
			return;
		}
		codifica(text, quants);
	}
	// codifiquem el text
	public static void codifica(String text, int quants) {
		int diferencia;
		for (int i=0; i < text.length(); i++) {
			if (quants >= 1) {
				if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
					int seguentLletra = (int)text.charAt(i) + quants;
					if (seguentLletra > 122) {
						diferencia = seguentLletra - 122;
						System.out.print((char)('a' + (diferencia - 1))); // diferencia - 1 porque el salto de Z a A ya cuenta como uno.
					} else {
						System.out.print((char)seguentLletra);
					}
				} else {
					System.out.print(text.charAt(i));
				}
			} else {
				System.out.print(text.charAt(i));
			}
		}
	}
}
