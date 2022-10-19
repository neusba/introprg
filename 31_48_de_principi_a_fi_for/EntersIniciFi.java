/* Programa que escriu del primer valor al segon saltejant els números amb el tercer utilitzant el bucle for */

public class EntersIniciFi {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		int valorInicial = Integer.parseInt(Entrada.readLine());
		System.out.println("Valor final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		System.out.println("Salt?");
		int salt = Integer.parseInt(Entrada.readLine());

		for (; valorInicial <= valorFinal; valorInicial += salt) {
			System.out.println(valorInicial);
		}
	}
}
