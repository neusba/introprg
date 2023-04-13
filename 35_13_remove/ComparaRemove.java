/* Programa que s'encarrega de comparar els temps d'execució d'una arraylist i una linkedlist
 * fent ús de la funció remove();
 * El temps es calcularà en nano segons
 */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ComparaRemove {
    private static final int LONGITUD = 100000;

    private static List<Integer> emplena(List<Integer> llista) {
        // XXX codi que emplena la llista amb enters del 0 a LONGITUD - 1
        for (int i=0; i<LONGITUD; i++) {
            llista.add(i);
        }
        return llista;
    }
    private static long testRemove0(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la posició 0
        for (int i=0; i<=llista.size(); i++) {
            llista.remove(0);
        }
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemove(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la darrera posició
        for (int i=0; i<LONGITUD; i++) {
            llista.remove(llista.size() - 1);
        }
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemoveMig(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la posició mig
        for (int i=0; i<LONGITUD; i++) {
           llista.remove(llista.size() / 2);
        } 
        return System.nanoTime() - tempsInicial;
    }
    public static void main(String[] args) {
        System.out.println("Comparant l'eficiència de les llistes");
        System.out.println();

        System.out.println("Comparació quan eliminem sempre de l'inici");
        System.out.printf("test remove(0) LinkedList:     %10d%n", testRemove0(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(0) ArrayList:      %10d%n", testRemove0(emplena(new ArrayList<Integer>())));
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del final");
        System.out.printf("test remove(últim) LinkedList: %10d%n", testRemove(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(últim) ArrayList:  %10d%n", testRemove(emplena(new ArrayList<Integer>())));
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del mig");
        System.out.printf("test remove(mig) LinkedList:   %10d%n", testRemoveMig(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(mig) ArrayList:    %10d%n", testRemoveMig(emplena(new ArrayList<Integer>())));
        System.out.println();
    }
}
