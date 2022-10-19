/* Programa que escriu del primer valor al segon saltejant els números amb el tercer utilitzant el bucle for */

public class EntersIniciFi {
	public static void main(String[] args) {
		System.out.println("Valor inicial?");
		for (int valorInicial = Integer.parseInt(Entrada.readLine());
				System.out.println("Valor final?");
				int valorFinal = Integer.parseInt(Entrada.readLine());
				valorInicial < valorFinal;
				System.out.println("Salt?");
				int salt = Integer.parseInt(Entrada.readLine());
				valorInicial += salt) {
				System.out.prinln(valorInicial);
		}
	}
}
