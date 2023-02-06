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
    public static String path = "llegides.txt";
    public static String pathItalianes = "italianes.txt";
    public static String pathDesconegudes = "desconegudes.txt";
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        BufferedReader inputItalianes = new BufferedReader(new FileReader(pathItalianes));
        BufferedReader inputDesconegudes = new BufferedReader(new FileReader(pathDesconegudes));
        BufferedWriter outputItalianes = new BufferedWriter(new FileWriter(pathItalianes));
        BufferedWriter outputDesconegudes = new BufferedWriter(new FileWriter(pathDesconegudes));

        while (true) {
            String linia = input.readLine();
            if (linia == null) { break; }
            if (linia.isEmpty()) { continue; }
            linia = linia.strip();
            boolean valida = matriculaItalianaValida(linia);
            if (valida) {
                int comptaLinies = 0;
                while (true) {
                    String checkLinia = inputItalianes.readLine();
                    comptaLinies += 1;
                    if (checkLinia == null) { break; }
                    if (checkLinia.equals(linia)) {
                        outputItalianes.write(String.format("%s%n", linia));
                    }
                }
                if (comptaLinies == 0) {
                    outputItalianes.write(String.format("%s%n", linia));
                }
            } else {
                int comptaLinies = 0;
                while (true) {
                    String checkLinia = inputDesconegudes.readLine();
                    comptaLinies += 1;
                    if (checkLinia == null) { break; }
                    if (checkLinia.equals(linia)) {
                        outputDesconegudes.write(String.format("%s%n", linia));
                    }
                }
                if (comptaLinies == 0) {
                    outputDesconegudes.write(String.format("%s%n", linia));
                }
            }
        }
        input.close();
        outputDesconegudes.close();
        outputItalianes.close();
    }

    // Funcio que retorna true si la matrícula és vàlida com a italiana o no
    public static boolean matriculaItalianaValida(String matricula) {
        String noValides = "IOQU";
        if (matricula.length() != 7) {
            return false;
        }
        for (int i=0; i < matricula.length(); i++) {
            char lletra = matricula.charAt(i);
            if (i > 1 && i < 5) {
                if (!Character.isDigit(lletra)) { return false; }
            } else {
                if (!Character.isLetter(lletra)) { return false; }
                if (Character.isLowerCase(lletra)) { return false; }
                for (int j=0; j < noValides.length(); j++) {
                    if (lletra == noValides.charAt(j)) { return false; }
                }
            }
        }
        return true;
    }
}
