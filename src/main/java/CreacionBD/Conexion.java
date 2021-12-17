package CreacionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Conexion con la base de datos (biblioteca.db) y uso del driver SQLite
public class Conexion {
    private static final Connection miCon = Conexion.conectar();


    public static Connection conectar() {
        Connection conexion = null;
        final String URL = "jdbc:mysql://localhost:3306/biblioteca";
        final String USUARIO = "root";
        final String CONTRASENA = "";
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            System.out.println("Error de conexion");
            e.printStackTrace();
        }
        return conexion;
    }
}
