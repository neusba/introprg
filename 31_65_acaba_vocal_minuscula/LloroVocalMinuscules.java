/* Nova versió del lloro que repeteix les paraules donades per l'usuari només quan aquestes finalitzen amb una vocal en minúscules i s'atura quan rep cadena en blanc. */

public class LloroVocalMinuscules {
	public static void main(String[] args) {
		
		System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
		String paraula = Entrada.readLine();

		while (!paraula.isEmpty() && !paraula.isBlank()) {
			if (paraula.endsWith("a") || paraula.endsWith("e") || paraula.endsWith("i") || paraula.endsWith("o") || paraula.endsWith("u")) {
				System.out.println("El lloro diu: " + paraula); 
			}
			System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
			paraula = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
			
