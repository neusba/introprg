/* Programa que demani un número entre l'1 i el 7 a l'usuari i torni un dia de la setmana per pantalla */

public class DiaSetmana { 
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);

		// Fem les condicionals de totes les possibilitats
		if (numero == 1) {
			System.out.println("Dilluns");
		} else if (numero == 2) {
			System.out.println("Dimarts");
		} else if (numero == 3) {
			System.out.println("Dimecres");
		} else if (numero == 4) {
			System.out.println("Dijous");
		} else if (numero == 5) {
			System.out.println("Divendres");
		} else if (numero == 6) {
			System.out.println("Dissabte");
		} else if (numero == 7) {
			System.out.println("Diumenge");
		} else {
		       System.out.println("Error");
		}
 	}
}	
