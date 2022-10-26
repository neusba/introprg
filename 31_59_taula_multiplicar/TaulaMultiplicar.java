/* Programa que demani 4 números a l'usuari i construirà una taula de multiplicar personalitzada */

public class TaulaMultiplicar {
	public static void main(String[] args) {
		
		int valorFinalP = Integer.parseInt(args[1]);
		int valorFinalS = Integer.parseInt(args[3]);
		for (int valorInicialP = Integer.parseInt(args[0]); valorInicialP <= valorFinalP; valorInicialP++) {
			for (int valorInicialS = Integer.parseInt(args[2]); valorInicialS <= valorFinalS; valorInicialS++) {
				System.out.print(valorInicialP + " x " + valorInicialS + " = " + (valorInicialP * valorInicialS));
				System.out.println();
			}
		}	
	}
}	
