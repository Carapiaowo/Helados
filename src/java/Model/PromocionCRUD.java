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
public class PromocionCRUD {
  public static int registrar_promocion(Promocion u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into mpromocion(nom_promocion, desc_promocion) values(?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, u.getNom_promocion());
           ps.setInt(2, u.getIddescuento());
           
            estatus = ps.executeUpdate();
            System.out.println("Registro de promo");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar promo");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrarpromo(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from mpromocion where idpromocion = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("promo eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar promo");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Promocion BuscarPromo(int id){
        Promocion u = new Promocion();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from mpromocion where idpromocion= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setIdpromocion(rs.getInt(1));
                u.setNom_promocion(rs.getString(2));
                u.setIddescuento(rs.getInt(3));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Promocion> ConsultarPromociones(){
        List<Promocion> lista = new ArrayList<Promocion>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from mpromocion";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Promocion u = new Promocion();
                u.setIdpromocion(rs.getInt(1));
                u.setNom_promocion(rs.getString(2));
                u.setIddescuento(rs.getInt(3));
                u.setDesc_promocion(rs.getString(4));
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
