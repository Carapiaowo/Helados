package Model;

import Config.Conexion;
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
    public static int registrar_admin(Admin a){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into admin(nom_admin, appat_admin, apmat_admin,user_admin, pass_admin) values(?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1,a.getNom_admin());
            ps.setString(2, a.getAppat_admin());
            ps.setString(3, a.getApmat_admin());
            ps.setString(4, a.getUser_admin());
            ps.setString(5, a.getPass_admin());
            estatus = ps.executeUpdate();
            System.out.println("Registro de administrador exitoso");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar al administrador");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }

    public static int actualizarAdmin(Admin u){
               int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "update admin  set nom_admin = ?, appat_admin = ?,  apmat_admin = ?,  user_admin = ?, pass_admin = ? where idadmin = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, u.getNom_admin());
            ps.setString(2, u.getAppat_admin());
            ps.setString(3, u.getApmat_admin());
            ps.setString(4, u.getUser_admin());
            ps.setString(5, u.getPass_admin());
            estatus = ps.executeUpdate();
            System.out.println("Actualizar admin exitoso");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al actualizar admin");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static int borraradmin(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from admin where idadmin= ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Admin eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar al admin");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Admin BuscarAdmin(int id){
        Admin u = new Admin();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from admin where idadmin = ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setIdadmin(rs.getInt(1));
                u.setNom_admin(rs.getString(2));
                u.setAppat_admin(rs.getString(3));
                u.setApmat_admin(rs.getString(4));
                u.setUser_admin(rs.getString(5));
                u.setPass_admin(rs.getString(6));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Admin> ConsultarAdmins(){
        List<Admin> lista = new ArrayList<Admin>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from admin";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 Admin u = new Admin();
                u.setIdadmin(rs.getInt(1));
                u.setNom_admin(rs.getString(2));
                u.setAppat_admin(rs.getString(3));
                u.setApmat_admin(rs.getString(4));
                u.setUser_admin(rs.getString(5));
                u.setPass_admin(rs.getString(6));
                lista.add(u);
                        }
            System.out.println("Encontrados");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar usuarios");
        }
         return lista;
    }
}

