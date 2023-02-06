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
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("llegides.txt"));

        BufferedWriter conegudes = new BufferedWriter(new FileWriter("italianes.txt"));
        //conegudes.close();
        BufferedWriter desconegudes = new BufferedWriter(new FileWriter("desconegudes.txt"));
        //desconegudes.close();
        while (true) {
            String linia = input.readLine();
            if (linia == null) break;
            linia = linia.strip();
            if (!matriculaItalianaValida(linia)) {
                if (!exists(linia, "desconegudes.txt")) {
                    //BufferedWriter noValid = new BufferedWriter(new FileWriter("desconegudes.txt", true));
                    /*noValid.write(String.format("%s%n", linia));
                    noValid.close();*/
                    desconegudes.write(String.format("%s%n", linia));
                    desconegudes.close();
                }
            } else {
                if (!exists(linia, "italianes.txt")) {
                    //BufferedWriter valid = new BufferedWriter(new FileWriter("italianes.txt", true));
                    /*valid.write(String.format("%s%n", linia));
                    valid.close();*/
                    conegudes.write(String.format("%s%n", linia));
                    conegudes.close();
                }
            }
        }
        input.close();
    }
    // Procediment que comprova si la matrícula està repetida o no
    public static boolean exists(String linia, String path) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        while (true) {
            String check = input.readLine();
            if (check == null) break;
            if (linia.equals(check)) {
                input.close();
                return true;
            }
        }
        input.close();
        return false;
    }
    // Procediment que retorna true si la matrícula és vàlida com a italiana o no
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

