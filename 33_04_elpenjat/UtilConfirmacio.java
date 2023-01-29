/* Utilitats de confirmació
 * 
 * Petit mòdul que servirà per gestionar les confirmacions que apareguin a cada programa
 */

public class UtilConfirmacio {

	// ############# CONFIRMACIÓ PER SORTIR DEL JOC ############## //
	
	// Gestiona la sortida del joc a l'introduir la paraula "prou"	
	public static boolean gestionaProu() {
		System.out.println("Vols finalitzar?");
		String resposta = Entrada.readLine();
		boolean confirma = respostaABoolean(resposta);
		if (confirma) { return true; }
		return false;
	}
	// Demana confirmació per abandonar el joc 
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
	// Gestiona la sortida del joc quan l'usuari es derrotat
	public static boolean gestionaDerrota() {
		System.out.println("Has perdut. Vols continuar jugant?");
		String resposta = Entrada.readLine();
		boolean confirma = respostaABoolean(resposta);
		if (confirma) { return false; }
		return true;
	}
}
