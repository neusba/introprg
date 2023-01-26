/* Programa ques simula el joc del "penjat" on a partir d'un fitxer extern amb paraules, l'usuari haurà d'anar donant lletres per encertar
 * S'haurà de mostrar un resum del procés en el que es troba el joc i mostrar per pantalla la figura correponent als intents
 * Es podrà cancel·lar la partida amb la paraula "prou" o quan acabin les paraules del fitxer
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Penjat {
	public static void main(String[] args) throws IOException {
		// Extrae cuantas lineas hay en el archivo y lo cierra
		String path = "paraules.txt";									// fitxer en el mateix directori
		BufferedReader input = new BufferedReader(new FileReader);
