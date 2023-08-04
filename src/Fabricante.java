import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tipo_de_Vehiculo {
    
    public static void ingresarTipo_de_Vehiculo() throws SQLException {
        String sqlFab = "INSERT INTO Tipo_de_Vehiculo VALUES (?, ?)";
        PreparedStatement senFab = Principal.conectar().prepareStatement(sqlFab);
        
        System.out.print("Id tipo de vehículo: ");
        int Idtipodeveh = Principal.sc.nextLine();
        senFab.setInt(1, Idtipodeveh);
        Principal.sc.nextLine();
        
        System.out.print("Nombre: ");
        String Nombre_del_fabricante = Principal.sc.nextLine();
        senFab.setString(2, Nombre_del_fabricante);
        
        int Insertadas = senFab.executeUpdate();
        if (Insertadas > 0) {
            System.out.println("Registros guardados exitosamente");
            System.out.println("--------------------------------");
        }
    }
}
