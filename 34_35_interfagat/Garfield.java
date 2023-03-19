/* Fitxer que conté la classe Garfield i tots els mètodes heretats de les interfícies que implementa
   grande garfield
   */

class Garfield extends Gat implements AnimalDeCompanyia {
    // Constructor
    public Garfield() {
        super("Garfield");
    }

    // Mètodes de la interface AnimalDeCompanyia
    @Override public String deixatEstimar() {
        return("em deixo estimar, però només una mica");
    }
}
