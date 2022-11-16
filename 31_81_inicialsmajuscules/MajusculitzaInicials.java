/* Programa que demana un text i retorna el text amb la primera lletra de cada PARAULA en majúscula i les altres en minúscules */

public class MajusculitzaInicials {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String nouText = "";
		boolean whiteSpace = false;

		if (text.isEmpty()) {
			System.out.println("Cadena buida");
		} else {
			
			
		

