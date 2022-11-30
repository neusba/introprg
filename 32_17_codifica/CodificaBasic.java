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
		String resposta = "";
		int diferencia;
		for (int i=0; i < text.length(); i++) {
			if (quants >= 1) {
				if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
					int seguentLletra = (int)text.charAt(i) + quants;
					for (int j=(int)text.charAt(i); j <= seguentLletra; j++) {
						diferencia = seguentLletra - j;
						j += quants;
						if (j >= 122) {
							resposta = resposta + ((char)('a' + diferencia));
							break;
						} else {
							resposta = resposta + ((char)j);
						}
					}
				}
			} else {
				System.out.print(text.charAt(i));
			}
		}
		System.out.println(resposta);
	}
}
