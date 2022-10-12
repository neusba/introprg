/* Programa que demana números a l'usuari i els va sumant sempre que siguin positius */

public class SumaPositius {
	public static void main(String[] args) {
		
		// Declarem l variable on es guardarà la suma i la que contendrà el valor que l'usuari introdueixi cada vegada
		int suma = 0;
		int valor;

		// Demanem el valor a l'usuari i el sumem en cas que sigui positiu
		System.out.println("Introdueix el primer valor:");
		valor = Integer.parseInt(Entrada.readLine());
		if (valor >= 0) {
			suma = suma + valor;
		} else {
			System.out.println("Has introduit un número negatiu");
		}

		// Demanem el segon valor a l'usuari
		System.out.println("Introdueix el segon valor:");
		valor = Integer.parseInt(Entrada.readLine());
		if (valor >= 0) {
			suma = suma + valor;
		} else {
			System.out.println("Has introduit un número negatiu");
		}

		// Demanem el tercer valor
		System.out.println("Introdueix el tercer valor:");
		valor = Integer.parseInt(Entrada.readLine());
		if (valor >= 0) {
			suma = suma + valor;
		} else {
			System.out.println("Has introduit un número negatiu");
		}

		// Imprimim la suma total
		System.out.println("La suma total es: " + suma);
	}
}
