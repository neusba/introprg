/* Programa que demana un text i mostra la quantitat de dígits que conté sumada
 * No es podrà utilitzar ni while ni for 
 */

public class SumaDigits {
	public static void main(String[] args){
        	System.out.println("Text?");
        	String text = Entrada.readLine();
        	int nombres = sumaDigits(text);
        	System.out.println(nombres);
    	}

    // analitza el text, extreu els nombres i els retorna sumats
    	public static int sumaDigits(String text) {
		if (text.isEmpty()) return 0;						// cas base

		char primer = text.charAt(0);
		String numero = "";	// conversió del primer caràcter a String
		int digitPrimer = 0;	// conversió del numero string a int
		if (Character.isDigit(primer)) { 					// tracta pas actual
			numero = numero + primer;
			digitPrimer = Integer.parseInt(numero);	
		}

		text = text.substring(1);
		int digitRestaText = sumaDigits(text);					// pas recursiu
		
		int nombres = digitPrimer + digitRestaText;
		return nombres;
	}
}





	
