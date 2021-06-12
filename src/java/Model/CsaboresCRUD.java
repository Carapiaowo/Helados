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
import Model.Csabores;
import java.sql.*;
import java.util.*;


public class CsaboresCRUD{
    public static int registrar_sabor(Csabores u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into csabores(nom_sabor) values(?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, u.getNom_sabor());
     
            estatus = ps.executeUpdate();
            System.out.println("Registro de sabor");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar el sabor");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrarsabor(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from csabores where id_sabor= ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Sabor eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar el sabor");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Csabores BuscarSabor(int id){
        Csabores u = new Csabores();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from csabores where id_sabor= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId_sabor(rs.getInt(1));
                u.setNom_sabor(rs.getString(2));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Csabores> ConsultarSabores(){
        List<Csabores> lista = new ArrayList<Csabores>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from csabores";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 Csabores u = new Csabores();
                u.setId_sabor(rs.getInt(1));
                u.setNom_sabor(rs.getString(2));
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
