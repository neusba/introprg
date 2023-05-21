/* Fitxer que conté la classe Zoo. Aquesta será una classe contenidor per fer de connexió entre el programa i la base de dades
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
