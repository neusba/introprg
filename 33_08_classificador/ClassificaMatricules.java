/* Programa que llegirà un fitxer amb un registre de matrícules i les classificarà en dos fitxers nous:
 * italianes.txt i desconegudes.txt
 * S'haurà de comprovar si la matrícula és italiana o no
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassificaMatricules {
	public static void main(String[] args) throws IOException {
		String path = "llegides.txt";
                String pathItalianes = "italianes.txt";
                String pathDesconegudes = "desconegudes.txt";
		classificaMatricules(path, pathItalianes, pathDesconegudes);
	}

	// Procediment que comprova la matrícula donada i la classifica a un fitxer o un altre segons el tipus
	public static void classificaMatricules(String path, String pathItalianes, String pathDesconegudes) throws IOException {
            BufferedReader input = new BufferedReader(new FileReader(path));
            BufferedWriter outputItalianes = new BufferedWriter(new FileWriter(pathItalianes));
            BufferedWriter outputDesconegudes = new BufferedWriter(new FileWriter(pathDesconegudes));
            while (true) {
                String linia = input.readLine();
                if (linia == null) { break; }
                if (linia.isEmpty()) { continue; }
                linia = linia.strip();
                boolean italiana = UtilString.matriculaItalianaValida(linia);
                if (italiana) {
                    outputItalianes.write(String.format("%s%n", linia));
                } else {
                    outputDesconegudes.write(String.format("%s%n", linia));
                }
            }
            input.close();
            outputItalianes.close();
            outputDesconegudes.close();
        }
}
