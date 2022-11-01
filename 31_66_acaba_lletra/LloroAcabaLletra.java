/* Nova versió del lloro que repeteix les paraules donades per l'usuari només quan aquestes finalitzen amb una lletra no vocal, s'aturarà quan s'introdueixi uan cadena en blanc */

public class LloroAcabaLletra {
	public static void main(String[] args) {
		System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
		String paraula = Entrada.readLine();

		while (!paraula.isEmpty() && !paraula.isBlank()) {
			char lletra = paraula.charAt(paraula.length() - 1);
			String stringLletra = Character.toString(lletra);
			
			if (Character.isLetter(lletra)) {
				if (!stringLletra.equalsIgnoreCase("a") && !stringLletra.equalsIgnoreCase("e") && !stringLletra.equalsIgnoreCase("i") && !stringLletra.equalsIgnoreCase("o") && !stringLletra.equalsIgnoreCase("u")) { 
						System.out.println("El lloro diu: " + paraula);
				}
			} else {
				char penultima = paraula.charAt(paraula.length() - 2);
				String stringPenultima = Character.toString(penultima);
				if (!stringPenultima.equalsIgnoreCase("a") && !stringPenultima.equalsIgnoreCase("e") && !stringPenultima.equalsIgnoreCase("i") && !stringPenultima.equalsIgnoreCase("o") && !stringPenultima.equalsIgnoreCase("u")) {// Terminar vocales y listo
					System.out.println("El lloro diu: " + paraula);
				}
			}
		System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
		paraula = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
			
