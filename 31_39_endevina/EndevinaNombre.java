/* Programa que repta als usuaris a endevinar el número 42 i segons el número que donin torna una resposta o una altra */

public class EndevinaNombre {
	public static void main(String[] args) {
	
	// Demanem el valor a l'usuari
	System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
	System.out.println("Introdueix un valor");
	int valor = Integer.parseInt(Entrada.readLine()); // Inicialitzem en cero per estalviar codi despŕes
	
	// Creem el bucle while
	while (valor != 42) {
		// Creem les condicions del número donat i afegim la resposta corresponent
		if (valor < 42) {
			System.out.println("És més gran que " + valor);
		} else if (valor > 42) {
			System.out.println("És més petit que " + valor);
		} else if (valor > 100) {
			System.out.println("Com a màxim 100");
		} else if (valor == 0) {
			System.out.println("És més gran que " + 0);
		}
		// Demanem el valor a l'usuari
		System.out.println("Introdueix un valor");
		valor = Integer.parseInt(Entrada.readLine());
	}
	// Si encerta el número, llavors;
	System.out.println("Has encertat!");
	}
}
		      

