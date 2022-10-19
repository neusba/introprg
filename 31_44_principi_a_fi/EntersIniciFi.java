/* Programa que demana tres números enters a l'usuari i escriu els números entre el primer i el segon saltejant-los amb el tercer */

public class EntersIniciFi {
	public static void main(String[] args) {
		// Declarem les variables
		System.out.println("Valor inicial?");
		int valorInicial = Integer.parseInt(Entrada.readLine());
		System.out.println("Valor final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		System.out.println("Salt?");
		int salt = Integer.parseInt(Entrada.readLine());

		while (valorInicial < valorFinal) {
			System.out.println(valorInicial);
			valorInicial = valorInicial + salt;
		}
	}
}
