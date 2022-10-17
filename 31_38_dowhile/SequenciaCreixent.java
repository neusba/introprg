/* Programa que demana nombres creixents i en el moment que introdueix un menor que l'anterior, pararà. Al final s'indicarà la longitud de la seqüència introduïda  */

public class SequenciaCreixent {
	public static void main(String[] args) {

		int sequencia = 0;
		System.out.println("Introdueix un valor");
		int valor = Integer.parseInt(Entrada.readLine());
		int valorAnterior; 
		do {
			sequencia = sequencia + 1;
			valorAnterior = valor; // Fiquem el valor introduït a una variable anterior abans de rebre el següent número
			System.out.println("Introdueix un valor"); // Codi repetit :(
			valor = Integer.parseInt(Entrada.readLine());

		} while (valor > valorAnterior);

		System.out.println("Longitud de la seqüència creixent: " + sequencia);
	}
}
			
