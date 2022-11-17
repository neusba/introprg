/* Programa que demana un text i el retorna amb les lletres de cada paraula del revés, l'ordre del text romandrà igual */

public class TextReves {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String lletres = "";

		for (int i=0; i < text.length(); i++) {
			lletres = lletres + text.charAt(i); 


