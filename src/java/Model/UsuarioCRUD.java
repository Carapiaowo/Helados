/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Danielao.0
 */

import Config.Conexion;
import Model.Usuario;
import java.sql.*;
import java.util.*;


public class UsuarioCRUD{
    public static int registrar_usuario(Usuario u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into usuario(nom_usu, appat_usu, apmat_usu, edad_usu, fechnac_usu, domicilio_usu, tel_usu, cel_usu, user_usu, pass_usu) values(?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, u.getNom_usu());
            ps.setString(2, u.getAppat_usu());
            ps.setString(3, u.getApmat_usu());
            ps.setInt(4, u.getEdad_usu());
            ps.setString(5, u.getFechnac_usu());
            ps.setString(6, u.getDomicilio_usu());
            ps.setString(7, u.getTel_usu());
            ps.setString(8, u.getCel_usu());
            ps.setString(9, u.getUser_usu());
            ps.setString(10, u.getPass_usu());
     
            estatus = ps.executeUpdate();
            System.out.println("Registro de usuario exitoso");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar al usuario");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int actualizarUsuario(Usuario u){
               int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "update usuario set nom_usu = ?, appat_usu = ?,  apmat_usu = ?, edad_usu= ?,  fechnac_usu = ?, domicilio_usu = ?, tel_usu = ?, cel_usu = ?, user_usu = ?, pass_usu = ? where idusuario = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, u.getNom_usu());
            ps.setString(2, u.getAppat_usu());
            ps.setString(3, u.getApmat_usu());
            ps.setInt(4, u.getEdad_usu());
            ps.setString(5, u.getFechnac_usu());
            ps.setString(6, u.getDomicilio_usu());
            ps.setString(7, u.getTel_usu());
            ps.setString(8, u.getCel_usu());
            ps.setString(9, u.getUser_usu());
            ps.setString(10, u.getPass_usu());
            ps.setInt(11, u.getIdusuario());
            estatus = ps.executeUpdate();
            System.out.println("Act de usuario exitoso");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al act al usuario");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static int borrarusuario(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from usuario where idusuario = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Usuario eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar al usuario");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Usuario BuscarUsuario(int id){
        Usuario u = new Usuario();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from usuario where idusuario = ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setIdusuario(rs.getInt(1));
                u.setNom_usu(rs.getString(2));
                u.setAppat_usu(rs.getString(3));
                u.setApmat_usu(rs.getString(4));
                u.setEdad_usu(rs.getInt(5));
                u.setFechnac_usu(rs.getString(6));
                u.setDomicilio_usu(rs.getString(7));
                u.setTel_usu(rs.getString(8));
                u.setCel_usu(rs.getString(9));
                u.setUser_usu(rs.getString(10));
                u.setPass_usu(rs.getString(11));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
        public static int BuscarUsuid(String usu, String pass){
            Usuario u = new Usuario();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from usuario where user_usu = ? and pass_usu = ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, usu);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setIdusuario(rs.getInt(1));
                u.setNom_usu(rs.getString(2));
                u.setAppat_usu(rs.getString(3));
                u.setApmat_usu(rs.getString(4));
                u.setEdad_usu(rs.getInt(5));
                u.setFechnac_usu(rs.getString(6));
                u.setDomicilio_usu(rs.getString(7));
                u.setTel_usu(rs.getString(8));
                u.setCel_usu(rs.getString(9));
                u.setUser_usu(rs.getString(10));
                u.setPass_usu(rs.getString(11));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u.getIdusuario();
    }
    
    
    
     public static List<Usuario> ConsultarUsuarios(){
        List<Usuario> lista = new ArrayList<Usuario>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from usuario";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 Usuario u = new Usuario();
                u.setIdusuario(rs.getInt(1));
                u.setNom_usu(rs.getString(2));
                u.setAppat_usu(rs.getString(3));
                u.setApmat_usu(rs.getString(4));
                u.setEdad_usu(rs.getInt(5));
                u.setFechnac_usu(rs.getString(6));
                u.setDomicilio_usu(rs.getString(7));
                u.setTel_usu(rs.getString(8));
                u.setCel_usu(rs.getString(9));
                u.setUser_usu(rs.getString(10));
                u.setPass_usu(rs.getString(11));
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
