/* Programa que escrigui els primers 10 números naturals en ordre amb el bucle while */

public class DeuPrimers {
	public static void main(String[] args) {
		// Declarem el número
		int contador = 1;

		// Creem el bucle while i finalitzem quan arribi a 10
		while (contador <= 10) {
			System.out.println(contador);
			contador += 1;
		}
	}
}
