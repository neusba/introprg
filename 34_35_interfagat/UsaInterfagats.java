/* Fitxer que conté la classe principal del programa amb el main.
 * El programa consisteix en veure el polimorfisme en les classes de gats 
 * i veure com itneractuen les classes abstractes o no i les seves interfícies
 */
public class UsaInterfagats {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        Garfield garfield = new Garfield();
        GatSalvatge gatSalvatge = new GatSalvatge();
        Gat gargamel = new Gat("Gargamel");
        Gat[] gats = { renat, garfield, gatSalvatge, gargamel };
        AnimalDeCompanyia[] animalsDeCompanyia = { renat, garfield };
        Ensinistrable[] ensinistrables = { renat };
        EsserViu[] essersVius = {renat, garfield, gatSalvatge, gargamel };

        System.out.println("Comprovem els mètodes de ensinistrable");
        System.out.println("======================================");
        for (Ensinistrable ensinistrable: ensinistrables) {
            System.out.println(ensinistrable.aixecat());
            System.out.println(ensinistrable.estaDret());
            System.out.println(ensinistrable.seu());
            System.out.println(ensinistrable.estaAssegut());
            System.out.println(ensinistrable.estirat());
            System.out.println(ensinistrable.estaEstirat());
        }

        System.out.println();
        System.out.println("Comprovem els mètodes d'AnimalDeCompanyia");
        System.out.println("=========================================");
        for (AnimalDeCompanyia animalDeCompanyia: animalsDeCompanyia) {
            System.out.println(animalDeCompanyia.deixatEstimar());
        }

        System.out.println();
        System.out.println("Comprovem els mètodes d'Esser viu");
        System.out.println("=================================");
        for (EsserViu esserViu: essersVius) {
            System.out.println(esserViu.estaViu());
            System.out.println(esserViu.mor());
            System.out.println(esserViu.ressuscita());
        }

        System.out.println();
        System.out.println("Comprovem els mètodes de Gat");
        System.out.println("============================");
        for (Gat gat: gats) {
            System.out.println(gat.getNom());
            gat.setVides(1);
            System.out.println(gat.ressuscita());
            System.out.println(gat.mor());
            System.out.println(gat.mor());
            System.out.println(gat.estaViu());
            System.out.println(gat.ressuscita());
            System.out.println(gat.getVides());
        }
    }
}
