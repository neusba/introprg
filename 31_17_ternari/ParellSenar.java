/* Programa per saber si un número és parell o senar amb un operador ternari */

public class ParellSenar {
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);

		String resultat;

		resultat = (numero % 2 == 0) ? ("El número " + numero + " és parell") : ("El número " + numero + " és senar");

		System.out.println(resultat);
	}
}

		

		
