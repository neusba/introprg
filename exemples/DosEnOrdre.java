/* Alternativa per a l'exercici de Dos en Ordre */

public class DosEnOrdre {
	public static void main(String[] args) {
		System.out.println("Primer?");
		int primer = Integer.parseInt(Entrada.readLine());

		System.out.println("Segon?");
		int segon = Integer.parseInt(Entrada.readLine());
		
		int tmp;

		if (primer > segon) {
			tmp = segon;
			segon = primer;
			primer = tmp;
			System.out.println(primer + " i " + segon);
		} else {
			System.out.println(primer + " i " + segon);
		}
	}
}
