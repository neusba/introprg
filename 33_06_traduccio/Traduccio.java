/* Programa que des d'un fitxer origen reemplaçarà les paraules indicades a un fitxer traducció i 
 * escriurà amb el text intercanviat a un nou fitxer anomenat destinació
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Traduccio {
	// variables globales
	public static void main(String[] args) throws IOException {
		if (args.length != 3) {
			System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
			return;
		}
		String fitxerOrigen = args[0];
		String fitxerTraduccio = args[1];
		String fitxerDestinacio = args[2];
		tradueix(fitxerOrigen, fitxerTraduccio, fitxerDestinacio);
	}
	// Procediment que llegeix el fitxer origen i gestiona la traduccio per escriure al fitxer destinacio
	public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(fitxerOrigen));
		BufferedWriter output = new BufferedWriter(new FileWriter(fitxerDestinacio));
		while (true) {
			String liniaOrigen = input.readLine();
			if (liniaOrigen == null) { break; }
			liniaOrigen = tradueixLinia(liniaOrigen, fitxerTraduccio);
			output.write(String.format("%s%n", liniaOrigen));
		}
		input.close();
		output.close();
	}
	// Funcio que retorna la linia del fitxer origen traduida amb el text intercanviat
	public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(fitxerTraduccio));
		while (true) {
			String traduccio = input.readLine(); 
			if (traduccio == null) { break;}
			String[] clauValor = traduccio.split(",");
			clauValor = arrayArreglat(clauValor);
			linia = linia.replace(clauValor[0], clauValor[1]);
		}
		input.close();
		return linia;	
	}
	
	// Funcio que treu el espais en blanc als elements del array dels valors csv
	public static String[] arrayArreglat(String[] clauValor) {
		for (int i=0; i<clauValor.length; i++) {
			clauValor[i] = clauValor[i].strip();
		}
		return clauValor;
	}

}	

			


			





