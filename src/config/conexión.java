package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexión {
  
    Connection con;
    String bd = "db_empleados";
    String url = "jdbc:mysql://127.0.0.1/"+bd;
    String user = "root";
    String password = "";
    
    public Connection conectar () {
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e, url, 0);
        }
        return con;
    }
}