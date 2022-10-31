/* Nova versió del programa del lloro, en aquesta ocasió només repeteix les paraules que comencen per una vocal en mínúscules i s'atura quan rep una cadena en blanc */

public class LloroVocalMinuscules {
	public static void main(String[] args) {
		System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
		String paraula = Entrada.readLine();
   		
		while (!paraula.isEmpty() && !paraula.isBlank()) {
			if (paraula.startsWith("a") || paraula.startsWith("e") || paraula.startsWith("i") || paraula.startsWith("o") || paraula.startsWith("u")) {
				System.out.println("El lloro diu: " + paraula);
			} 
			System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
			paraula = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
	

