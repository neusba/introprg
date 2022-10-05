/* Desenvolupem un programa que simuli una transacció en la que es paga una quantitat de € y depén del que l'usuari doni indica si sobran o si falten diners */

public class Pagament {
	public static void main(String[] args) {
		System.out.println("Preu?");
		int preu = Integer.parseInt(Entrada.readLine());

		System.out.println("Paga?");
		int pagament = Integer.parseInt(Entrada.readLine());

		int canvi;

		if (pagament > preu) {
			canvi = pagament - preu;
			System.out.println("Sobren " + canvi + "€");
		} else if (preu > pagament) {
			canvi = preu - pagament;
			System.out.println("Falten " + canvi + "€");
		} else if (preu == pagament) {
			canvi = preu;
			System.out.println("No sobra ni falta res");
		}
	}
}
