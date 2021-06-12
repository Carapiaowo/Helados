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
public class CtamanoCRUD {
    public static int registrar_tamano(Ctamano u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into ctamano(nombre_tamano) values(?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, u.getNombre_tamano() );
     
            estatus = ps.executeUpdate();
            System.out.println("Registro de tamaño");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar el tamaño");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrartamano(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from ctamano where id_sabor = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Tamaño eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar el tamaño");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Ctamano BuscarTamano(int id){
        Ctamano u = new Ctamano();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from ctamano where idtamano= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId_tamano(rs.getInt(1));
                u.setNombre_tamano(rs.getString(2));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Ctamano> ConsultarTamanos(){
        List<Ctamano> lista = new ArrayList<Ctamano>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from ctamano";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Ctamano u = new Ctamano();
                u.setId_tamano(rs.getInt(1));
                u.setNombre_tamano(rs.getString(2));
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
