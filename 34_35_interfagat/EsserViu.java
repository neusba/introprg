/* Fitxer que conté la 'Interface' d'Esser viu. Una interface es crea en base a la restricció de Java
 * d'utilitzar l'herència múltiple, per tant ens permet tenir subclasses pertanyents a diferentes
 * superclasses
 */

public interface EsserViu {
    // Les interfaces han de definir tots els mètodes que es volen usar en subclasses pero no definir-los
    boolean estaViu();
    String mor();
    String ressuscita();
}
