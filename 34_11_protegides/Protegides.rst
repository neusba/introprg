##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Neus Bravo Arias

* Data: 13/2/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que ens donarà error al compilar perquè l'accés a GatRenat és privat

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que el mòdul getVides(), el qual es troba al mateix fitxer, retorna al main el valor de vides per tant permet utilitzar la variable

El resultat ara és "El gat renat tè 7 vides".

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal ficar el mètode setVides() amb argument el número 5 abans del print amb el getVides()

El codi de ``UsaGatRenat`` seria:

::

    GatRenat renat = new GatRenat();
    renat.setVides(5);
    System.out.printf("El gat renat tè ara %d vides%n", getVides());

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat renat tè 5 vides.


La meva explicació de perquè això és així és perquè hem solicitat al mètode que ens comprovi el nou númoer, si és vàlid 


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que es queda amb 5 vides per que al condicional no fa la substitució ja que el nombre no és un de vàlid

El codi seria:

::

    renat.setVides(-12);


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat renat tè 5 vides


La meva explicació de perquè això és així és que el condicional no permet fe la mutació del valor perquè no és vàlid


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què no da cap error

Comparant-lo amb el que passava a la pregunta 1, veiem que permet utilitzar renat.vides

La meva explicació és que el private només és per privar l'accés extern i no l'intern per tant podem utlitzar i modificar les propietats sense cap necessitat de getters i setters

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és que sí ho posem desde el main del mateix Gat Renat ho podrem fer, si ho fem des d'un accés extern ens serà impossible ja que la propietat és privada i sempre necessitarem accedir-hi amb un setter/Getter

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és que public permet que la variable sigui utlitzada per accés intern i extern i private s'assegura que no és pot accedir desde fora fàcilment

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls XXX i XXX.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria XXX.

En canvi, si només en tingués *setter* el que passaria és XXX.

Finalment, si no en tingués cap dels dos, ens trobaríem que XXX.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret no disposen de la paraula static
