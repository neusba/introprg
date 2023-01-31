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

	public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(fitxerTraduccio));
		while (true) {
			String traduccio = input.readLine(); 
			if (traduccio == null) { break;}
			String[] clauValor = traduccio.split(",");
			linia = linia.replace(clauValor[0], clauValor[1]);
		}
		input.close();
		return linia;	
	}

}	

			


			





