import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registro_intdecompra {
    
    public static void ingresarRegistro_intdecompra() throws SQLException {
        String sqlRegis = "INSERT INTO Registro_intdecompra VALUES (?, ?, ?)";
        PreparedStatement senRegis = Home.conectar().prepareStatement(sqlRegis);
        
        System.out.print("Reg_Idtipodeveh: ");
        int Reg_Idtipodeveh = Home.sc.nextInt();
        senRegis.setInt(1, Reg_Idtipodeveh);
        Home.sc.nextInt();
                
        System.out.print("Reg_Alias: ");
        String Reg_Alias = Home.sc.nextLine();
        senRegis.setString(2, Reg_Alias);
        
        System.out.print("Fecha de registro: ");
        int fecha_de_registro = Home.sc.nextInt();
        senRegis.setInt(3, fecha_de_registro);
        Home.sc.nextInt();
               
        int Insertadas = senRegis.executeUpdate();
        if (Insertadas > 0) {
            System.out.println("Registros guardados exitosamente");
        }
    }
}
//ESTE TIENE LA POSTA