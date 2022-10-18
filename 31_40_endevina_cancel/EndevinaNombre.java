/* Programa que demani números fins que encerta el 42 i va donant diferent respostes segons el número introduït. Si s'introdueix una cadena buida, el programa es cancel·la */


public class EndevinaNombre {
	public static void main(String[] args) {
		// Demanem el primer valor a l'usuari en format String
		System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
		System.out.println("Introdueix un valor");
		String stringValor = Entrada.readLine();
		
		while (stringValor.isEmpty() == false) { // Si la cadena no està buida, el bucle funcionarà
			int intValor = Integer.parseInt(stringValor); // Pasem de String a Int el valor que ens dona l'usuari per poder treballar amb expressions matemàtiques

			if (intValor == 42) { // En cas de que el valor donat sigui 42, tornarà a pasar-ho a String i sortirà del bucle forçadament.
				stringValor = Integer.toString(intValor);
				break;
			}
			
			if (intValor != 42) { // Les condicions per donar diferents respostes segons el valor introduït per l'usuari
				if (intValor > 0 && intValor <= 100) {
					if (intValor < 42) {
						System.out.println("És més gran que " + intValor);
					} else {
						System.out.println("És més petit que " + intValor);
					} 
				} else if (intValor > 100) {
					System.out.println("Com a màxim 100");
				} else if (intValor <= 0) {
					System.out.println("Com a mínim 1");
				}
			}
				
			stringValor = Integer.toString(intValor); // Quan ja hem donat la resposta per pantalla, tornem a String per que el bucle pugui llegir-ho bè 

			System.out.println("Introdueix un valor");
			stringValor = Entrada.readLine();
		}
		if (stringValor.equals("42")) { // Si la sortida del bucle és per el 42, mostrem que ha encertat i finalitzem
			System.out.println("Has encertat!");
		} else if (stringValor.isEmpty()) {
			System.out.println("Cancel·lat!"); // Si la sortida del bucle es per cadena buida, cancel·lem i finalitzem
		}
	}
}

