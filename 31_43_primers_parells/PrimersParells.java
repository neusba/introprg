/* Programa que escriu els primers números naturals parells del 0 al 10 */

public class PrimersParells {
	public static void main(String[] args) {
		// Declarem la variable
		int contador = 0;
		// Creem el bucle while
		while (contador < 10) {
			contador += 2;
			System.out.println(contador);
		}
	}
}
