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
public class CcantidadCRUD {
      public static int registrarCantidad(Ccantidad u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into cpresentacion (valor_cantidad, unidad_cantidad ) values(?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
  
            ps.setInt(1, u.getValor_cantidad());
            ps.setString(2, u.getUnidad_cantidad());
            
            estatus = ps.executeUpdate();
            System.out.println("Registro de cantidad");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar la cant");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrarcantidad(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from ccantidad where id_cantidad= ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Cantidad eliminada exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar la presentacion");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Ccantidad BuscarCantidad(int id){
      Ccantidad u = new Ccantidad();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from ccantidad where id_cantidad= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId_cantidad(rs.getInt(1));
                u.setValor_cantidad(rs.getInt(2));
                u.setUnidad_cantidad(rs.getString(3));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Ccantidad> ConsultarCantidades(){
        List<Ccantidad> lista = new ArrayList<Ccantidad>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from ccantidad";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Ccantidad u = new Ccantidad();
                u.setId_cantidad(rs.getInt(1));
                u.setValor_cantidad(rs.getInt(2));
                u.setUnidad_cantidad(rs.getString(3));
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
