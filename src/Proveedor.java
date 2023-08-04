import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Proveedor_motor {
    
    public static void ingresarProveedor_motor() throws SQLException {
        String sqlProv = "INSERT INTO Proveedor_motor VALUES (?, ?, ?, ?)";
        PreparedStatement senProv = Principal.conectar().prepareStatement(sqlProv);
        
        System.out.print("Id proveedor motor: ");
        int Idproveedormotor = Principal.sc.nextLine();
        senProv.setInt(1, Idproveedormotor);
        Principal.sc.nextLine();
        
        System.out.print("Nombre: ");
        String Proveedor_Nombre = Principal.sc.nextLine();
        senProv.setString(2, Proveedor_Nombre);
        
        System.out.print("Dirección: ");
        String Direccion_proveedor = Principal.sc.nextLine();
        senProv.setString(3, Direccion_proveedor);
        
        System.out.print("Teléfono: ");
        String Telefono_proveedor = Principal.sc.nextLine();
        senProv.setString(4, Telefono_proveedor);
        
        int Insertadas = senProv.executeUpdate();
        if (Insertadas > 0) {
            System.out.println("Registros guardados exitosamente");
            System.out.println("--------------------------------");
        }
    }
}
