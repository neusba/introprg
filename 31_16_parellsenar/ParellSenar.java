/* Programa que indica si el número donat per l'usuario és parell o senar */

public class ParellSenar {
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " és parell.");
		} else {
			System.out.println("El número " + numero + " és senar.");
		}
	}
}
