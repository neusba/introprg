####################################
Anotacions sobre propietats mutables
####################################

* Autor/a: Neus Bravo Arias

* Data: 8/2/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats mutables*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01    public class GatRenat {
    02        public int vides = 7;                                                             // vides disponibles del gat Renat
    03        public static void main(String[] args) {
    04            GatRenat renat;                                                               // declarem l'objecte (la referència) al gat
    05            renat = new GatRenat();                                                       // creem la instància del gat Renat.
    06            System.out.println("Abans el gat Renat tenia " + renat.vides + " vides");
    07            renat.vides = renat.vides - 1;  // Renat ha tingut un accident
    08            System.out.println("Ara el gat Renat té " + renat.vides);
    09        }
    10    }

Pregunta 1. Obtenir
===================

Per consultar (llegir, obtenir) el valor d'una propietat de la instància,
cal agefir el nom de la variable. Ex: renat.vides per poder obtenir la propietats vides

Pregunta 2. Assignar
====================

Per canviar (escriure, assignar) el valor d'una propietat de la instància,
cal cambiar el seu valor cridant la variable. Ex: renat.vides = renat.vides - 1

Pregunta 3. Valors absurds
==========================

A la pregunta següent:

    És possible indicar que el gat Renat té -12 vides? Com? És quelcom
    desitjable que pugui passar? En cas que es pugui, com ho podries
    evitar fent servir els coneixements de programació estructurada i
    modular que hem treballat fins ara?

La meva resposta és: Sí que és possible pero no tendria gaire sentit, per tant estaria bé crear un mòdul apart que passi com argument renat.vides i comprovi si el número està per sota de 0 i retorni true o false.
