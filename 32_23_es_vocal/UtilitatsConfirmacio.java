/* Utilitats de confirmació
 * 
 * Petit mòdul que servirà per gestionar les confirmacions que apareguin a cada programa
 */

public class UtilitatsConfirmacio {
	public static boolean respostaABoolean(String resposta) {
		if (null == resposta) {
			return false;
		}
		resposta = resposta.toLowerCase();
		if (resposta.equals("s") || resposta.equals("y")) {
            		return true;
        	}
        	if (resposta.equals("sí") || resposta.equals("yes")) {
            		return true;
        	}
        	if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {
		       	return true;
        	}
        	return false;
	}
}
