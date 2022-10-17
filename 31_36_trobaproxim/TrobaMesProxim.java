/* Programa que demani un número enter positiu i es declari como àncora. Despŕes es van demanant nombres positius fins que es reb un negatiu, finalment es mostrarà el nombre més proper a l'àncora. */

public class TrobaMesProxim {
        public static void main(String[] args) {
                int contador = 0; // Acumulador de valor positius
                int diferencia; // Diferencia de l'àncora amb el valor més pròxim
                int diferenciaActual; // Diferencia de l'àncora amb el valor actual
 
                System.out.println("Introdueix l'àncora");
                int ancora = Integer.parseInt(Entrada.readLine());
                                                            
                if (ancora <= 0) {
                        System.out.println("Àncora no vàlida");
                } else {
                        System.out.println("Introdueix un valor");
                        int valor = Integer.parseInt(Entrada.readLine());
                        int valorMesProxim = valor;
                        while (valor >= 0) {
                                diferencia = Math.abs(ancora - valorMesProxim);
                                contador = contador + 1;
                                diferenciaActual = Math.abs(ancora - valor);
                                if (diferenciaActual < diferencia) {
                                        valorMesProxim = valor;
                                } else if (diferenciaActual == diferencia && valor < valorMesProxim) {
                                        valorMesProxim = valor;
                                }
                                System.out.println("Introdueix un valor");
                                valor = Integer.parseInt(Entrada.readLine());
                        }
                if (contador == 0) {
                        System.out.println("No s'ha introduït cap valor positiu");
                } else {
                        System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);
                }
                }
        }
}








		


