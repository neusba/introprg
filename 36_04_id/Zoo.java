/* Fitxer que conté la classe Zoo. Aquesta será una classe contenidor per fer de connexió entre el programa i la base de dades
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;  
import java.util.LinkedList;  

public class Zoo {
    private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
                                                     NOM_BASE_DE_DADES;
    private Connection conn = null;

    public void connecta() throws SQLException {
        if (conn != null) return;   // ja connectat
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }

    public void desconnecta() throws SQLException {
        if (conn == null) return; // ja desconnectat
        conn.close();
        conn = null;
    }
    
    // implementem la creació de taula CATEGORIES
    public void creaTaulaCategories() throws SQLException {
    String sqlCreate = "CREATE TABLE  CATEGORIES (" +
                 "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                 "       nom       VARCHAR(40))";
    // Modificació per borrar la taula abans de crear-la si ja existeix"
    String sqlDropIfExists = "DROP TABLE IF EXISTS CATEGORIES;";

    Statement st = null;
    try {
        st = conn.createStatement();
        st.executeUpdate(sqlDropIfExists);
        st.executeUpdate(sqlCreate);
    } finally {
        if (st != null) {
            st.close();
        }
    }
    }
    // mètode d'eliminació de taula CATEGORIES
    public void eliminaTaulaCategories() throws SQLException {
        String sqlDropIfExists = "DROP TABLE IF EXISTS CATEGORIES;";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sqlDropIfExists);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    // Afegir categories
    public void afegeixCategoria(Categoria categoria) throws SQLException {
    String sql = String.format(
            "INSERT INTO CATEGORIES (nom) VALUES ('%s')",
            categoria.getNom());
    Statement st = null;
    try {
        st = conn.createStatement();
        st.executeUpdate(sql);
        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        int id = rs.getInt(1);
        categoria.setId(id);
    } finally {
        if (st != null) {
            st.close();
        }
    }
    }
    // mètode que recupera les categories trobades a la taula CATEGORIES
    public List<Categoria> recuperaCategories() throws SQLException {
    String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
    Statement st = null;
    try {
        st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<Categoria> categories = new LinkedList<>();
        while (rs.next()) {
            int bdId = rs.getInt("id");
            String nom = rs.getString("nom");
            Categoria categoria = new Categoria(bdId, nom);
            categories.add(categoria);
        }
        rs.close();
        return categories;
    } finally {
        if (st != null) {
            st.close();
        }
    }
    }
    // mètode que recupera una categoria en base al seu nom
    public Categoria obteCategoriaPerNom(String nom) throws SQLException {
        String sqlSelectCategoria = String.format("SELECT id, nom FROM CATEGORIES WHERE nom = '%s' ORDER BY id LIMIT 1;", nom);
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlSelectCategoria);
            if (rs.getString("nom") != null) {
                int bdId = rs.getInt("id");
                String bdNom = rs.getString("nom");
                rs.close();
                return new Categoria(bdId, bdNom);
            }
        } finally { 
            if (st != null) {
                st.close();
            }
        }
        return null;
    }
}
