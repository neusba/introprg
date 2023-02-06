/* Programa que llegirà un fitxer amb un registre de matrícules i les classificarà en dos fitxers nous:
 * italianes.txt i desconegudes.txt
 * S'haurà de comprovar si la matrícula està repetida o no
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
        BufferedReader input = new BufferedReader(new FileReader(path));                                // Lectura del fitxer llegides
        BufferedWriter outputItalianes = new BufferedWriter(new FileWriter(pathItalianes));             // Escritura del fitxer italianes
        BufferedWriter outputDesconegudes = new BufferedWriter(new FileWriter(pathDesconegudes));       // Escritura del fitxer Desconegudes
        

        while (true) {
            String linia = input.readLine();
            if (linia == null) { break; }
            if (linia.isEmpty()) { continue; }
            linia = linia.strip();
            if (matriculaItalianaValida(linia)) {                                                       // Comprova si és una matrícula vàlida
                if (!exists(linia, "italianes.txt")) {
                    outputItalianes.write(String.format("%s%n", linia));
                }
            } else {
                if (!exists(linia, "desconegudes.txt")) {
                    outputDesconegudes.write(String.format("%s%n", linia));
                }
            }
        }
        input.close();
        outputDesconegudes.close();
        outputItalianes.close();
    } 
    // Procediment que comprova si la matrícula està repetida dins del seu fitxer corresponent
    public static boolean exists(String linia, String path) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        while (true) {
            String check = input.readLine();
            if (check == null) { break; }
            if (linia.equals(check)) {
                input.close();
                return true;
            }
        }
        input.close();
        return false;
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

