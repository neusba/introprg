/* Programa que demani números fins que encerta el 42 i va donant diferent respostes segons el número introduït. Si s'introdueix una cadena buida, el programa es cancel·la */


public class EndevinaNombre {
        public static void main(String[] args) {
                // Demanem el primer valor a l'usuari en format String
                System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
                System.out.println("Introdueix un valor");
                String stringValor = Entrada.readLine();

                while (stringValor.equals("42") == false || stringValor.equals("") == false) { // Si la cadena no està buida, el bucle funcionarà
			int intValor = Integer.parseInt(stringValor);
			
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
			
			stringValor = Integer.toString(intValor);

                        System.out.println("Introdueix un valor");
                        stringValor = Entrada.readLine();
                }
                if (stringValor.equals("42")) { // Si la sortida del bucle és per el 42, mostrem que ha encertat i finalitzem
                        System.out.println("Has encertat!");
                } else if (stringValor.equals("")) {
                        System.out.println("Cancel·lat!"); // Si la sortida del bucle es per cadena buida, cancel·lem
                }
        }
}


