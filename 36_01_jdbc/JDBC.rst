##################
Indica quines de les següents afirmacions són certes respecte JDBC. Argumenta-les.
##################

Comencem
============

# 1. És un sistema que ens permet accedir des d'una base de dades relacional, a un programa fet en Java.
-----------------------------------------------------------------------------------------------------------------------------------------
Això no és cert. El JDBC el que fa és proporcionar-nos una API que ens permet interactuar amb les dades emmagatzemades en una font de dades.


2. Per a poder accedir a un SGBD concret, ens caldrà una implementació adequada del JDBC, doncs JDBC per si sol només defineix interfaces i poc més.
-----------------------------------------------------------------------------------------------------------------------------------------------------
És cert, JDBC només ens aportarà les interfaces i mètodes per accedir i processar les dades una vegada "conectats", pero abans necessitem instal·lar els drivers necessaris per poder conectar amb un SGBD concret.


3. Si els nostres programes fan servir les interfícies definides per JDBC en comptes de les classes concretes dels drivers, hauria de ser raonablement fàcil canviar de SGBD sense haver de modificar els nostres programes.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Cert perquè al no utilizar les classes concretes dels drivers, els quals són propis de cada SGBD, no depenem tant d'aquest i podem tornar el codi més reutilitzable.


4. Donada una implementació concreta de JDBC, coneguda com a driver, podríem accedir a diverses fonts de dades, no només bases de dades.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
No eś cert ja que els drivers que implementem al JDBC estan dissenyats per per interactuar només amb les bases de dades des de aplicacions java.


5. Amb el driver adequat, el nostre programa hauria de poder accedir a un full de càlcul fent servir JDBC.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Cert, no hauria de tenir problemes per interactuar amb fonts de dades en format tabular si està ben implementat.


