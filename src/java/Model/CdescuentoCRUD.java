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
public class CdescuentoCRUD {
       public static int registrar_descuento(Cdescuento u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into cdescuento(valor) values(?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setInt(1, u.getValor());
     
            estatus = ps.executeUpdate();
            System.out.println("Registro de desc");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar el desc");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrardescuento(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from cdescuento where iddescuento = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("desc eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar el desc");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Cdescuento BuscarDescuento(int id){
        Cdescuento u = new Cdescuento();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from cdescuento where iddescuento= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setIddescuento(rs.getInt(1));
                u.setValor(rs.getInt(2));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Cdescuento> ConsultarDescuentos(){
        List<Cdescuento> lista = new ArrayList<Cdescuento>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from cdescuento";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Cdescuento u = new Cdescuento();
                u.setIddescuento(rs.getInt(1));
                u.setValor(rs.getInt(2));
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
