/* Ejercicio examen */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class NomesAprovats {
    public static void main(String[] args) throws IOException {
        File path = new File("notes.csv");
        if (!path.exists()) {
            System.out.println("ERROR");
            return;
        }
        BufferedReader input = new BufferedReader(new FileReader(path));
        BufferedWriter output = new BufferedWriter(new FileWriter("alumnes.txt"));

        while (true) {
            String linia = input.readLine();
            if (linia == null) break;
            String[] valors = linia.split(",");

            for (int i=0; i<valors.length; i++) {
                if (i == 1) {
                    int nota = Integer.parseInt(valors[i]);
                    if (nota >= 5) {
                        output.write(String.format("%s%n", valors[0]));
                    }
                }
            }
        }
        input.close();
        output.close();
    }
}

