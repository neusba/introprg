/* Programa que demani números fins que encerta el 42 i va donant diferent respostes segons el número introduït. Si s'introdueix una cadena buida, el programa es cancel·la */


public class EndevinaNombre {
	public static void main(String[] args) {
		// Declarem les variables
		System.out.println("Ves introduïnt enters entre 1 i 100 fins que encertis el que jo he pensat");
		System.out.println("Introdueix un valor");
		String stringValor = Entrada.readLine();
		
		while (stringValor.isEmpty() == false) {
			int intValor = Integer.parseInt(stringValor);

			if (intValor == 42) {
				stringValor = Integer.toString(intValor);
				break;
			}
			
			if (intValor != 42) {
				if (intValor > 0 && intValor <= 100) {
					if (intValor < 42) {
						System.out.println("És més gran que " + intValor);
					} else {
						System.out.println("És més petit que " + intValor);
					} 
				} else if (intValor > 100) {
					System.out.println("Com a màxim 100");
				} else if (intValor <= 0) {
					System.out.println("Com a mínim 1");
				}
			}
				
			stringValor = Integer.toString(intValor);

			System.out.println("Introdueix un valor");
			stringValor = Entrada.readLine();
		}
		if (stringValor.equals("42")) { 
			System.out.println("Has encertat!");
		} else if (stringValor.isEmpty()) {
			System.out.println("Cancel·lat!");
		}
	}
}
				
			
