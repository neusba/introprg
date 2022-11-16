/* Programa que demana un text i retorna una nova versió transformada amb les vocals catalanes en minúscules, les no vocals en majúscules, nombres entre parèntesis i sense la resta de caràcters (excepte el espais en blanc) */

public class TransformaText {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String vocals = "AEIOUÁÉÈÍÏÓÒÚÜ";
		String nouText = "";
		char letra = text.charAt(0); // Inicialitzem en 0 per poder fer-ho simplement

		if (text.isEmpty()) {
			System.out.println("Cadena buida");
		} else {
