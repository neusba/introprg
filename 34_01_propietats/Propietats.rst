###########################
Anotacions sobre propietats
###########################

* Autor/a: Neus Bravo Arias

* Data: 8/2/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       public int vides = 7;         // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``GatRenat.java``.

Si reanomeno el fitxer anterior a ``UnNomQualsevol.java``, em trobo el
següent resultat a l'hora de compilar:

::

    $ javac UnNomQualsevol.java
    UnNomQualsevol.java:1: error: class GatRenat is public, should be declared in a file named GatRenat.java
    public class GatRenat {
            ^
    1 error

    

Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
    Al gat Renat li quedan 7 vides.

Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 5 és una instància.

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 2.

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

::

    El gat Renat tè 0 vides.

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

    GatRenat.java:6: error: variable renat might not have been initialized
            System.out.println("Al gat Renat li queden " + renat.vides + " vides");
                                                       ^
    1 error

Penso que passa això perquè la variable renat de tipus GatRenat no ha sigut inicialitzada, només declarada la referència.

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè la variale renat no és de tipus primitut per tant està apuntant a un valor a altre lloc en la memòria.

Crec que la  relació entre *referència* i *variable* és: la variable és només una referència que apunta al valor real que utilitzem.


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: el que ha creat el resultat del new GatRenat() i l'espai reservat.

* la variable és: renat

* la referència és: renat (la referència apunta al valor real en la posició de memòria)

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències presenta la variable ``vides`` respecte les 
*variables globals* són:

1. No conté el static

2. Pertany a una classe i es crida amb la variable corresponent
