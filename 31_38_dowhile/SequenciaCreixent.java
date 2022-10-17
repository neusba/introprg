/* Programa que demana nombres creixents i en el moment que introdueix un menor que l'anterior, pararà. Al final s'indicarà la longitud de la seqüència introduïda  */

public class SequenciaCreixent {
	public static void main(String[] args) {

		int sequencia = 0;
		int valor = 1;
		int valorAnterior;
		do {
			sequencia = sequencia + 1;
			valorAnterior = valor;
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());

		} while (valor > valorAnterior);

		System.out.println("Longitud de la seqüència creixent: " + sequencia);
	}
}
			
