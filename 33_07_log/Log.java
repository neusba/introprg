/* Biblioteca Log que escriu sobre un fitxer els errors o processos que es produeixen en un programa
 * printError
 * printWarning
 * printInfo
 * printDebug
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
	private static int sequencial = 1;
	// Per indicar errors greus, sovint irrecuperables
	public static String printError(String text) throws IOException {
		String type = "ERROR:";
		String path = "log.txt";
		BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		output.write(String.format("[%d] %s %s%n", sequencial, type, text));
		output.close();
		text = String.format("[%d] %s %s%n", sequencial, type, text);
		return text;
	}
	// Per indicar situacions anòmales que, si bé són recuperables, poden esdevenir un error.
	public static String printWarning(String text) throws IOException {
		sequencial += 1;
		String type = "WARNING:";
		String path = "log.txt";
		BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		output.write(String.format("[%d] %s %s%n", sequencial, type, text));
		output.close();
		text = String.format("[%d] %s %s%n", sequencial, type, text);
		return text;
	}
	//Permet indicar informació general, normalment no problemàtica, com ara, l'inici i finalització d'una execució.
	public static String printInfo(String text) throws IOException {
		sequencial += 1;
		String type = "INFO:";
		String path = "log.txt";
		BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		output.write(String.format("[%d] %s %s%n", sequencial, type, text));
		output.close();
		text = String.format("[%d] %s %s%n", sequencial, type, text);
		return text;
	}
	//Permet indicar detalls de l'execució, com per exemple, la crida a un mòdul amb els arguments que se li passen o l'opertura/tancament dels fitxers.
	public static String printDebug(String text) throws IOException {
		int sequencial = 1;
		String type = "DEBUG:";
		String path = "log.txt";
		BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		output.write(String.format("[%d] %s %s%n", sequencial, type, text));
		sequencial += 1;
		output.close();
		text = String.format("[%d] %s %s%n", sequencial, type, text);
		return text;
	}
	// Resetea el comptador sequencial
	public static void reset() {
		int sequencial = 1;
	}
}


