/* Programa que mostra les ocurrències de totes les vocals catalanes en el text donat per l'usuari */

public class ComptaVocals {
	// obtenim les dades necessàries
	public static void main(String[] args) {
		System.out.println("Introdueix un text");
		String text = Entrada.readLine();
		String vocals = "aàeèéiíïoòóuúü";
		for (int i=0; i < vocals.length(); i++) {
			char lletra = vocals.charAt(i);
			int quantes = quantesOcurrencies(text, lletra);
			mostraOcurrencies(lletra, quantes);
		}	
	}
	// Mostrem les ocurrències
	public static void mostraOcurrencies(char lletra, int quantes) {
		System.out.println("Nombre de \'" + lletra + "\'s: " + quantes);
	}
	// Comptem el nombre de la lletra corresponent al text
	public static int quantesOcurrencies(String text, char lletra) {
		int comptador = 0;
		for (int i=0; i < text.length(); i++) {
			if (text.charAt(i) == lletra) {
				comptador += 1;
			}
		}
		return comptador;
	}
}

