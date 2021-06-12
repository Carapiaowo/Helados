package Model;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose Manuel
 */
public class Admin {
    
     
    private String nom_admin, appat_admin, apmat_admin, user_admin, pass_admin;
    private int idadmin;
    
    public Admin(){
        
    }

    public Admin(String user_admin, String pass_admin) {
  
        this.user_admin = user_admin;
        this.pass_admin = pass_admin;
   
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public String getAppat_admin() {
        return appat_admin;
    }

    public void setAppat_admin(String appat_admin) {
        this.appat_admin = appat_admin;
    }

    public String getApmat_admin() {
        return apmat_admin;
    }

    public void setApmat_admin(String apmat_admin) {
        this.apmat_admin = apmat_admin;
    }

    public String getUser_admin() {
        return user_admin;
    }

    public void setUser_admin(String user_admin) {
        this.user_admin = user_admin;
    }

    public String getPass_admin() {
        return pass_admin;
    }

    public void setPass_admin(String pass_admin) {
        this.pass_admin = pass_admin;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public Admin verificaradmin(String usuario, String pass){
        Admin adm =null;
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            con= Conexion.getConexion();
            String q="SELECT * FROM admin WHERE user_admin= ? AND pass_admin= ? ";
            ps=con.prepareStatement(q);
            ps.setString(1,usuario);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while(rs.next()){
                adm =new Admin();
                adm.setIdadmin(rs.getInt("idadmin"));
                adm.setApmat_admin(rs.getString("apmat_admin"));
                adm.setAppat_admin(rs.getString("appat_admin"));
                adm.setNom_admin(rs.getString("nom_admin"));
                adm.setPass_admin(rs.getString("pass_admin"));
                adm.setUser_admin(rs.getString("user_admin"));
                break;
            }
        }catch(SQLException sq){
            System.out.println("Error al consultar el admin");
            System.out.println(sq.getMessage());
            adm =null;
        }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(Exception e){
                System.out.println("Error al encontrar la clase");
                System.out.println(e.getMessage());
            }
        }
        return adm;
    }
    
}
