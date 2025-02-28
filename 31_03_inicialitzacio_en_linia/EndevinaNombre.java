/* Programa d'endevinació amb les declaracions i les inicialitzacions en la mateixa línia
 * Per executar:
 * $java Endevinanombre (numero) */
 
 public class EndevinaNombre {
    public static void main(String[] args) {
        
        int numeroPensat = Integer.parseInt(args[0]);   // Declarem la variable i la inicialitzem en la mateixa línia.
        System.out.print("El número pensat és ");
        System.out.println(numeroPensat);
        
        // Declarem la segona variable que será el número que s'anirà transformant i la inicialitzem al multiplicar-la per 3.
        int numero = numeroPensat * 3;
        System.out.print("Quan el multipliques per 3 obtens ");
        System.out.println(numero);
        
        // Sumem 6
        numero = numero + 6;
        System.out.print("Quan li sumes 6 arriba a ");
        System.out.println(numero);
        
        // Dividim tot per 3
        numero = numero / 3;
        System.out.print("Un cop dividit per 3 queda ");
        System.out.println(numero);
        
        // Restem el número pensat
        numero = numero - numeroPensat;
        System.out.print("Finalment, en restar-li el valor inicial, queda ");
        System.out.println(numero);
        
        // Comparem el resultat
        System.out.println("A que el resultat és 2?");
    }
}                 
