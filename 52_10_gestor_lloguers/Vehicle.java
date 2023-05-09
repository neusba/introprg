/* Classe Vehicle pel programa de Gestió de lloguers
 * Define 3 constants que fan referència a les categories disponibles dels vehicles, seràn propietats estàtiques definides amb números 1, 2 i 3.
 * La relació amb la classe Lloguer requiere una propietat
 */

// IMPORTS

public class Vehicle {
    // propietats
    public static final int BASIC = 1;
    public static final int GENERAL = 2;
    public static final int LUXE = 3;
    private String model;
    private String marca;
    private int categoria;
    
    // CONSTRUCTOR
    public Vehicle(String marca, String model, int categoria) {
        setModel(model);
        setMarca(marca);
        setCategoria(categoria);
    }
    // GETTERS
    public String getModel()  { return this.model; }
    public String getMarca()  { return this.marca; }
    public int getCategoria() { return this.categoria; }

    // SETTERS
    public void setModel(String model)  { this.model = model; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    // metodes
    // TODO: buit de moment
}
