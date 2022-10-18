/* Programa que demana valors a l'usuari i els va sumant fins que hi ha un negatiu */

public class SumaPositius {
	public static void main(String[] args) {
		
		// Declarem la variable on anirà la suma i la variable del valor que donarà l'usuari
		int valor;
		int suma = 0;
		int contador = 0;	
		// Demanem valor a l'usuari
		System.out.println("Introdueix un valor");
		valor = Integer.parseInt(Entrada.readLine());

		while (valor >= 0 && contador <= 3) {
			suma = suma + valor;
			contador = contador + 1;
			// Demanem altre valor a l'usuari
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
		}
		
		// Quan el bucle termina, imprimim la suma total dels nombres positius
		System.out.println("La suma és " + suma);
	}
}


