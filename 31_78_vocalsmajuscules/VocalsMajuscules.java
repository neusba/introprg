/* Programa que demana un text i el retorna amb totes les lletres en minúscules excepte les vocals que hauran d'estar en majúscules */

public class VocalsMajuscules {
        public static void main(String[] args) {
                System.out.println("Text?");
                String text = Entrada.readLine();
                text = text.toLowerCase();
                String vocals  = "aeiou";
                boolean conteVocal;
                String nouText = "";

                for (int i=0; i < text.length(); i++) {
                        conteVocal = false;
                        if (Character.isLetter(text.charAt(i))) {
                                for (int j=0; j < vocals.length(); j++) {
                                       if (text.charAt(i) == vocals.charAt(j)) {
                                               nouText = nouText + Character.toUpperCase(text.charAt(i));
                                               conteVocal = true;
                                       }
                                }
                                if (!conteVocal) {
                                        nouText = nouText + text.charAt(i);
                                }
                        } else {
                                nouText = nouText + text.charAt(i);
                        }
                }
                System.out.println(nouText);
        }
}
	
