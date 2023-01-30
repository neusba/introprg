/*
 * programa que simula un lloro que recorda les frases que li han dit
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Recordat {
	public static void main(String[] args) throws IOException {
		String cami = "records.txt";								
		processaEntrada(cami);								// Demana la paraula i la registra
		System.out.println("D'acord");
		mostraRecords(cami);								// Mostra totes les linies registrades
    	}

    	public static void processaEntrada(final String cami) throws IOException {
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));
		while (true) {
			System.out.println("El lloro pregunta paraula:");
			String entrada = Entrada.readLine();
			if (entrada.isEmpty()) { sortida.close(); return; }
			entrada = entrada.strip();
			sortida.write(String.format("%s%n", entrada));
			System.out.printf("El lloro registra: %s%n", entrada);
		}
	}

	public static void mostraRecords(final String cami) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(cami));
		while (true) {
			String linia = input.readLine();
			if (linia == null) { System.out.println("Adéu"); return; }
			System.out.printf("El lloro recorda: %s%n", linia);
		}

	}

}
