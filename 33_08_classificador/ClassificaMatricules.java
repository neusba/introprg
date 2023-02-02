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
                boolean italiana = matriculaValida(linia);
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

	public static boolean matriculaValida(String text) throws IOException {
		if (text.length() != 7) {
			return false;
		}
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			if (i > 1 && i < 5) {
				if (!Character.isDigit(lletra)) {
					return false;
				}
			} else {
				boolean valida = esLletraValidaPerMatriculaItaliana(lletra);
				if (!valida) {
					return false;
				}
			}
		}
		return true;
	}
	// revisio de les lletres de la matricula
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) throws IOException {
		String noValides = "IOQU";
		if (Character.isLetter(lletra) && Character.isUpperCase(lletra)) {
			if (lletra >= 'A' && lletra <= 'Z') {
				for (int i=0; i < noValides.length(); i++) {
					if (lletra == noValides.charAt(i)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
}
