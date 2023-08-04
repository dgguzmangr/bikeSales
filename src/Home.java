import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Home {
    public static Scanner sc = new Scanner(System.in); //Crea la instancia para utilizar el método Scanner para ingresar datos por consola
    
    public static void main (String[] args){ //Acá voy a instanciar el método Scanner para llamarlo desde todas las clases
        menu();//Es el llamado al menú para que sea lo primero que se vé en al consola
    }
    
    public static void menu(){ //Acá se guarda lo que va a ver el usuario en la consola
        try{
            System.out.println(
                    "------------------\n" +
                    "--- CRUD MySQL ---\n" +
                    "------------------\n" +
                    "1. Crear tablas"
                    );
        }
        catch(){
        
        }
    }
    
    public static Connection conectar(){ //Este método realiza la conexión con la DB
        
public static void main(String[] args) throws SQLException {
            String dbURL = "jdbc:mysql://localhost:3306/eco_dos_ruedas";
            String username = "root";
            String password = "martha15kd186710DGRO#";
            // conectar
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(dbURL, username, password);
                if (conn != null) {
                    System.out.println("Conectado");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
    }
    
    

    
        }
        
        /*
        String sql = "INSERT INTO libro(libId, libNombre, libPub, ediId, autId, libPrecio) VALUES(?,?,?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, 1010);
        statement.setString(2, "La Hojarasca");
        statement.setInt(3, 1955);
        statement.setInt(4, 1);
        statement.setInt(5, 1);
        statement.setDouble(6, 95000.0);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Insercion exitosa!");
        }
        */
        /*
        String sql = "SELECT * FROM libro";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        int count = 0;
        while (result.next()) {
            String titulo = result.getString(2);
            int pub = result.getInt(3);
            Double costo = result.getDouble(6);
            System.out.println("Titulo : "+ titulo + 
                               ", Anio publicacion: " + pub + 
                               ", Costo: " + costo);
            count++;
        }
        System.out.println("Cantidad de Registro: " + count);
        */ 
        /*
        String sql = "UPDATE libro SET libNombre = ?, libPub = ?, libPrecio = ? WHERE  libId = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "Crónica de una muerte anunciada");
        statement.setInt(2, 1981);
        statement.setDouble(3, 100000.0);
        statement.setInt(4, 1010);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("El registro fue actualizado exitosamente!");
        }
        */
            
        /*
        
        
        String sql = "DELETE FROM libro WHERE libId =?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, 1010);
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Borrado exitoso!");
        }
        */
        
        conn.close();
    }
}
