/* Programa que escriu els 10 primers números naturals però en ordre dereixent */

public class DeuPrimersDecreixent {
	public static void main(String[] args) {
		// Declarem la variable
		int contador = 10;

		// Creem el bucle while i finalitzem quan arriba a 1
		while (contador >= 1) {
			System.out.println(contador);
			contador -= 1;
		}
	}
}
