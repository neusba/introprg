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
		BufferedReader input = new BufferedReader(new FileReader(path));
		int controlaLinies = 0;
		while (true) {
			String linia = input.readLine();
			if (linia == null) { 
				if (controlaLinies == 0) {
					return;
				}
				break;
			}
			controlaLinies += 1;
		}
		input.close();
		classificaMatricules(path);
	}

	// Procediment que comprova la matrícula donada i la classifica a un fitxer o un altre segons el tipus
	public static void classificaMatricules(String path) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(path));
		//String italianes = "";
		//String desconegudes = "";
		while (true) {
			String linia = input.readLine();
			if (linia == null) { break; }
			if (linia.isEmpty()) { continue; }
			linia = linia.strip();
			boolean checkMatricula = UtilString.matriculaItalianaValida(linia);
			if (checkMatricula) {
                                fitxerItalianes(linia);
				//italianes = italianes + linia + ",";
			} else {
                                fitxerDesconegudes(linia);
				//desconegudes = desconegudes + linia + ",";
			}
		}
		input.close();
		/*String[] matriculesItalianes = italianes.split(",");
		String[] matriculesDesconegudes = desconegudes.split(",");
		fitxerItalianes(matriculesItalianes);
		fitxerDesconegudes(matriculesDesconegudes);*/
	}

	// Procediment que afegeix les matrícules italianes al fitxer de "italianes.txt"
	public static void fitxerItalianes(String matricula) throws IOException {
		String path = "italianes.txt";
		BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		
		output.write(String.format("%s%n", matricula));
                output.close();
	}

	// Procediment que afegeix les matrícules desconecgudes al fitxer de "desconegudes.txt"
	public static void fitxerDesconegudes(String matricula) throws IOException {
		String path = "desconegudes.txt";
		BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		
		output.write(String.format("%s%n", matricula));
                output.close();
	}
}
