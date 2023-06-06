package upx_ecomercee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UPX_Ecomercee {
    public static void main(String[] args) {
        
        System.out.println("Conectando Java e MySQL");
 
        try{
            Connection conn = DataBase.getConnection("rafael", "rafaelperassi", "rafa280498el");
            System.out.println("Conectado!");
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Falha ao conectar!");
        }
    }
    public static boolean insert(Connection conn, String sql)
        throws SQLException
    {
        Statement cmd = conn.createStatement();
        cmd.executeUpdate(sql);
        
        return true;
    }
    
}
