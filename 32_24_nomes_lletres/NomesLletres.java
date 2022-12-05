/* Exercici 31_72 "Només lletres" però aquesta vegada modular
 * Mostrarem la versió més compacta de les dues mostrades als exemples
 */ 

public class NomesLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		System.out.println(
			UtilString.lletresSeparades(
				UtilString.nomesLletres(
					Entrada.readLine()
					)
				)
			);
	}
}
