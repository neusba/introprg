/* Programa que serveix de prova per la biblioteca LOG. 
 * Crida diferents mòduls al fitxer Log amb el seu missatge i desde l'altre fitxer 
 * registra els errors a un .txt
 */

import java.io.IOException;

public class UsaLog {
   	public static void main(String[] args) throws IOException {
       		Log.printError("Això és un error greu");
       		Log.printWarning("Això és un avís");
       		for (int i=0; i < args.length; i++) {
           		Log.printInfo(String.format("Argument %d: %s", i, args[i]));
       		}
       		Log.reset();     // comencem a comptar un altre cop
       		Log.printDebug("Aquí s'acaba el main()");
   	}
}
