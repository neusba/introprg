/* Programa que demani un número enter positiu i es declari como àncora. Despŕes es van demanant nombres positius fins que es reb un negatiu, finalment es mostrarà el nombre més proper a l'àncora. */

public class TrobaMesProxim {
	public static void main(String[] args) {

		int ancora;
		int valorMesProxim;
		int valor = 1;
		int contador = 0; // Acumulador de valores positivos
		int diferencia;
		int diferenciaActual;
		valorMesProxim = valor; // Comencarà sent el primer valor introduït, 1 en aquest cas

		System.out.println("Introdueix l'àncora");
		ancora = Integer.parseInt(Entrada.readLine());
		diferencia = Math.abs(ancora - valor);

		if (ancora <= 0) {
			System.out.println("Àncora no vàlida");
		} else {
			while (valor >= 0) {
				contador = contador + 1;
				diferenciaActual = Math.abs(ancora - valor);
				if (diferenciaActual < diferencia) {
					valorMesProxim = valor;
				} else if (diferenciaActual == diferencia && valor < valorMesProxim) {
					valorMesProxim = valor;
				} 

				System.out.println("Introdueix un valor");
				valor = Integer.parseInt(Entrada.readLine());
			}
		if (contador == 1) {
			System.out.println("No s'ha introduït cap valor positiu");
		} else {
			System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);
		}
		}
	}
}








		


