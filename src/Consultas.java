import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {
    public static void crearTablas () {
        try {
            String[] sqls = {
                "CREATE TABLE Proveedor_motor (Idproveedormotor integer not null primary key, Proveedor_Nombre varchar(35), Direccion_proveedor varchar(70), Telefono_proveedor varchar(11))",
                "CREATE TABLE Clientes (Alias varchar(35) not null primary key, Nombres_cliente varchar(35), Apellidos_cliente varchar(35), Email varchar(40), Celular_cliente varchar(10), Fecha_de_nacimiento_cliente date, contraseña_cliente varchar(8)",
                "CREATE TABLE Tipo_de_Vehiculo( Idtipodeveh integer not null primary key, Nombre_del_fabricante varchar(50))",
                "CREATE TABLE Bicicleta (IdBicicleta integer not null primary key, Precio_unitario_bicicleta varchar (60), Año_de_construccion integer, foreign key (IdBicicleta) references Tipo_de_Vehiculo (Idtipodeveh))",
                "CREATE TABLE Motocicleta_Electrica(IdMoto integer not null primary key, Precio_unitario_moto varchar(35), Autonomia_de_la_Bateria varchar(35), Doc_proveedormotor int, foreign key (IdMoto) references Tipo_de_Vehiculo (Idtipodeveh), foreign key (Doc_proveedormotor) references Proveedor_motor (Idproveedormotor)",
                "CREATE TABLE Registro_intdecompra (Reg_Idtipodeveh integer not null, Reg_Alias varchar(35) not null, fecha_de_registro datetime, primary key(Reg_Idtipodeveh, Reg_Alias), foreign key (Reg_Idtipodeveh) references Tipo_de_Vehiculo (Idtipodeveh), foreign key (Reg_Alias) references Clientes (Alias))"
            };
            for (String i:sqls) {
                PreparedStatement sentencia = Home.conectar().prepareStatement(i);
                sentencia.executeUpdate();
            }
        }
        catch (Exception e) {
            System.out.println("Tablas creadas"); //Crea las tablas
        }
    }    
    public static void modificaAno() throws SQLException {
        String sql = "UPDATE bicicleta SET Año_de_construccion =? WHERE Tipo_de_Vehiculo =?";
        PreparedStatement senBici = Home.conectar().prepareStatement(sql);
        System.out.println("Ingrese fabricante y año a modificar:");
        
        System.out.println("Fabricante: ");
        String Tipo_de_Vehiculo = Home.sc.nextLine();
        senBici.setString(4,Tipo_de_Vehiculo);
        
        System.out.println("Año: ");
        int Año_de_construccion = Home.sc.nextInt();
        senBici.setInt(3, Año_de_construccion);
        Home.sc.nextLine();
        
        int filasIns = senBici.executeUpdate();
        if (filasIns > 0) {
            System.out.println("Se modificó correctamente");    
        }
    } 
    public static void modificarCelular_cliente() throws SQLException {
        String sql = "UPDATE clientes SET Celular_cliente =? WHERE alias =?";
        PreparedStatement sentencia = Home.conectar().prepareStatement(sql);
        System.out.println("Ingrese el alias y el nuevo número de celular.");
        
        System.out.println("Alias: ");
        String Alias = Home.sc.nextLine();
        sentencia.setString(1, Alias);
        
        System.out.println("Celuar: ");
        String Celular_cliente = Home.sc.nextLine();
        sentencia.setString(1, Celular_cliente);
        
        int filasIns = sentencia.executeUpdate();
        if (filasIns > 0) {
            System.out.println("Se modificó correctamente");
        }
    }
    public static void borrarRegistro() throws SQLException {
        String sql = "DELETE FROM Registro_intdecompra WHERE Alias =? AND Tipo_de_Vehiculo =?";
        PreparedStatement senRegis = Home.conectar().prepareStatement(sql);
        System.out.println("Ingrese el Alias y el fabricante en el registro de intensión de compra");
        
        System.out.println("Aias: ");
        String Reg_Alias = Home.sc.nextLine();
        senRegis.setString(2, Reg_Alias);
        
        System.out.println("Fabricante: ");
        String Tipo_de_Vehiculo = Home.sc.nextLine();
        senRegis.setString(5, Tipo_de_Vehiculo);
        
        int filasIns = senRegis.executeUpdate();
        if (filasIns > 0) {
            System.out.println("El registro de intesión de compra se eliminó correctamente");
        }
    }
}