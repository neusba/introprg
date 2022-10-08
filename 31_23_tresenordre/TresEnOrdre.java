/* Programa que demani tres números a l'usuari i els torni en ordre ascendent per pantalla */

public class TresEnOrdre {
	public static void main(String[] args) {
		// Demanem els números a l'usuari
		System.out.println("Primer?");
		int primer = Integer.parseInt(Entrada.readLine());

		System.out.println("Segon?");
		int segon = Integer.parseInt(Entrada.readLine());

		System.out.println("Tercer?");
		int tercer = Integer.parseInt(Entrada.readLine());

		// Ordenem els números ascendentment comparant les possibilitats
		if (primer > segon) {
			if (primer > tercer) {
				if (segon > tercer) {
					System.out.println(tercer + ", " + segon + " i " + primer);
				} else {
					System.out.println(segon + ", " + tercer + " i " + primer);
				}
			} else {
				System.out.println(segon + ", " + primer + " i " + tercer);
			}
		} else {
			if (segon > tercer) {
				if (primer > tercer) {
					System.out.println(tercer + ", " + primer + " i " + segon);
				} else {
					System.out.println(primer + ", " + tercer + " i " + segon);
				}
			} else {
				System.out.println(primer + ", " + segon + " i " + tercer);
			}
		}
	}
}
