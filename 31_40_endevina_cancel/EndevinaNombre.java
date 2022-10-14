/* Programa que demani números fins que encerta el 42 i va donant diferent respostes segons el número introduït. Si s'introdueix una cadena buida, el programa es cancel·la */


public class EndevinaNombre {
	public static void main(String[] args) {
		// Declarem les variables
		String stringValor = Entrada.readLine();

		// Creem el bucle
		while (stringValor.isNumeric()) {
			System.out.println("ole");
			stringValor = Entrada.readLine();
		}
		System.out.println("oeee");
	}
}
