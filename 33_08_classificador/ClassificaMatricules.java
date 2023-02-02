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
		String noValides = "IOQU";
		if (text.length() != 7) {
			return false;
		}
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			if (i > 1 && i < 5) {
				if (!Character.isDigit(lletra)) {
					return false;
				}
			} else if (Character.isLetter(lletra) && Character.isUpperCase(lletra)) {
                            if (lletra >= 'A' && lletra <= 'Z') {
                                for (int j=0; j < noValides.length(); j++) {
                                    if (lletra == noValides.charAt(j)) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                    }
		}
		return true;
	}
}
