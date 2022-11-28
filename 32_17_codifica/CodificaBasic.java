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
		for (int i=0; i < text.length(); i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if (quants >= 1) {
					if (text.charAt(i) == 'z') {
						System.out.print((char)('a' + quants));
					} else {
						System.out.print((char)(text.charAt(i) + quants));
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
