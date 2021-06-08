package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Manuel
 */
public class AdminCRUD {
    
    PreparedStatement ps;
    ResultSet rs;
    Connect c = new Connect();
    Connection con;
    
    public List adminConsulta(){
        List<Admin>lista= new ArrayList<>();
        
        String sql = "select * from madmin";
        
        try{
            con=c.connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Admin adm = new Admin();
                adm.setId(rs.getInt(1));
                adm.setUser(rs.getString(2));
                adm.setCorreo(rs.getString(3));
                adm.setPass(rs.getString(4));
                lista.add(adm);
            }
        }catch(Exception e){
            System.out.println("No se pudo visualizar: "+e);
        }
        
        return lista;
    }
    
    public boolean adminAgregar(Admin adm){
        
        String sql = "INSERT INTO madmin (usuario_admin, correo_admin, contrasena_admin) VALUES ('" + adm.getUser() + "','" + adm.getCorreo() + "', '" + adm.getPass() + "' );";    
        
        try{
            con=c.connect();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
        
    return false;
    }
}
