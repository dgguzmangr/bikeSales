import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motocicleta_Electrica {
    
    public static void ingresarMotocicleta_Electrica() throws SQLException {
        String sqlMoto = "INSERT INTO Motocicleta_Electrica VALUES (?, ?, ?, ?)";
        PreparedStatement senMoto = Principal.conectar().prepareStatement(sqlMoto);
        
        System.out.print("Id Moto: ");
        int IdMoto = Principal.sc.nextInt();
        senMoto.setInt(1, IdMoto);
        Principal.sc.nextLine();
                
        System.out.print("Precio unitario moto: ");
        String Precio_unitario_moto = Principal.sc.nextLine();
        senMoto.setString(2, Precio_unitario_moto);
        
        System.out.print("Autonomia de la Bateria: ");
        int Autonomia_de_la_Bateria = Principal.sc.nextLine();
        senMoto.setInt(3, Autonomia_de_la_Bateria);
        Principal.sc.nextLine();
        
        System.out.print("Doc proveedormotor: ");
        int Doc_proveedormotor = Principal.sc.nextLine();
        senMoto.setInt(4, Doc_proveedormotor);
        Principal.sc.nextLine();
        
        int Insertadas = senMoto.executeUpdate();
        if (Insertadas > 0) {
            System.out.println("Registros guardados exitosamente");
        }
    }
}