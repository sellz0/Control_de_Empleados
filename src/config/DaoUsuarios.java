package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoUsuarios {
 
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public usuarios login(String user, String pass){
        usuarios us = new usuarios();
        String sql = "select * from usuarios where Usuario='"+user+"' and password='"+pass+"'";
        try{
            
        }catch(Exception e){
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while 
        }
    }
}
