import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bicicleta {
    
    public static void ingresarBicicleta() throws SQLException {
        String sqlBici = "INSERT INTO Bicicleta VALUES (?, ?, ?, ?)";
        PreparedStatement senBici = Principal.conectar().prepareStatement(sqlBici);
        
        System.out.print("Id Bicicleta: ");
        int IdBicicleta = Principal.sc.nextInt();
        senBici.setInt(1, IdBicicleta);
        Principal.sc.nextLine();
                
        System.out.print("Precio_unitario_bicicleta: ");
        String Precio_unitario_bicicleta = Principal.sc.nextLine();
        senBici.setString(2, Precio_unitario_bicicleta);
        
        System.out.print("Año de construccion: ");
        int Año_de_construccion = Principal.sc.nextLine();
        senBici.setInt(3, Año_de_construccion);
        Principal.sc.nextLine();
        
        System.out.print("Tipo de vehículo: ");
        String Idtipodeveh = Principal.sc.nextLine();
        senBici.setString(4, Idtipodeveh);
        
        int Insertadas = senBici.executeUpdate();
        if (Insertadas > 0) {
            System.out.println("Registros guardados exitosamente");
        }
    }
}