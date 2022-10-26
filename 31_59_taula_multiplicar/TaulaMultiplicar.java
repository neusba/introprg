/* Programa que demani 4 números a l'usuari i construirà una taula de multiplicar personalitzada */

public class TaulaMultiplicar {
	public static void main(String[] args) {
		System.out.println("El primer argument és " + args[0]);
	        System.out.println("El segon argument és  " + args[1]);
	        System.out.println("El tercer argument és " + args[2]);
        	System.out.println("El quart argument és  " + args[3]);
		
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
