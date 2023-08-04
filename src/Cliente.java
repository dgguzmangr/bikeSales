import java.sql.PreparedStatement;

public class Clientes {
    
    public static void ingresarClientes(){
        String sql = "INSERT INTO clientes VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement sentencia = Principal.conectar().prepareStatement(sql);
        
        System.out.print("Alias: ");
        String alias = Principal.sc.nextLine();
        sentencia.setString(1, alias);
        
        System.out.print("Nombres: ");
        String Nombres_cliente = Principal.sc.nextLine();
        sentencia.setString(2, Nombres_cliente);
        
        System.out.print("Apellidos: ");
        String Apellidos_cliente = Principal.sc.nextLine();
        sentencia.setString(3, Apellidos_cliente);
        
        System.out.print("Email: ");
        String Email = Principal.sc.nextLine();
        sentencia.setString(4, Email);
        
        System.out.print("Celular cliente: ");
        String Celular_cliente = Principal.sc.nextLine();
        sentencia.setString(5, Celular_cliente);
        
        System.out.print("Fecha de nacimiento: ");
        String Fecha_de_nacimiento_cliente = Principal.sc.nextLine();
        sentencia.setString(6, Fecha_de_nacimiento_cliente);
        
        System.out.print("Contraseña: ");
        String contraseña_cliente = Principal.sc.nextLine();
        sentencia.setString(7, contraseña_cliente);
        
        int Insertadas = sentencia.executeUpdate();
        if (Insertadas > 0) {
            System.out.println("Registros guardados exitosamente");
        }
    }
}
