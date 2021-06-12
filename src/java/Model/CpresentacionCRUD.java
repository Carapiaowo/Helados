/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielao.0
 */
public class CpresentacionCRUD {
       public static int registrarPresentacion(Cpresentacion u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into cpresentacion (tipo_presentacion) values(?)";
            
            PreparedStatement ps = con.prepareStatement(q);
  
            ps.setString(1, u.getTipo_presentacion());
     
            estatus = ps.executeUpdate();
            System.out.println("Registro de presentacion");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar la prsentacion");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrarpresentacion(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from cpresentacion where id_presentacion= ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Presentacion eliminada exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar la presentacion");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Cpresentacion BuscarPresentacion(int id){
        Cpresentacion u = new Cpresentacion();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from cpresentacion where id_presentacion= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId_presentacion(rs.getInt(1));
                u.setTipo_presentacion(rs.getString(2));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Cpresentacion> ConsultarPresentaciones(){
        List<Cpresentacion> lista = new ArrayList<Cpresentacion>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from cpresentacion";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cpresentacion u = new Cpresentacion();
                u.setId_presentacion(rs.getInt(1));
                u.setTipo_presentacion(rs.getString(2));
                 lista.add(u);
                        }
            System.out.println("Encontrados");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar sabores");
        }
         return lista;
    }
}
