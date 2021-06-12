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
public class ProductoCRUD {
    public static int registrar_producto(Producto u){
        int estatus = 0;
        try{
            Connection con = Conexion.getConexion();
            String q = "insert into mproducto(id_sabor, id_cantidad, id_tamano, id_presentacion, precio_producto, stock_producto, nom_producto) values(?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setInt(1, u.getId_sabor());
            ps.setInt(2, u.getId_cantidad());
            ps.setInt(3, u.getId_tamano());
            ps.setInt(4, u.getId_presentacion());
            ps.setInt(5, u.getPrecio_producto());
            ps.setInt(6, u.getStock_producto());
            ps.setString(7, u.getNom_producto());
            
            estatus = ps.executeUpdate();
            
            System.out.println("Registro de producto");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registar el p");
            System.out.println(ed.getMessage());
        }
        return estatus;
        
    }
    
    
    public static int borrarproducto(int id){
        int estatus = 0;
         try{
            Connection con = Conexion.getConexion();
            String q = "delete from mproducto where id_producto = ?";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Producto eliminado exitosamente");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar el producto");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    
    public static Producto BuscarProducto(int id){
        Producto u = new Producto();
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from  mproducto  where id_producto= ? ";
            
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId_tamano(rs.getInt(1));
                        }
            System.out.println("Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar");
        }
        return u;
    }
    
    
     public static List<Producto> ConsultarProductos(){
        List<Producto> lista = new ArrayList<Producto>();
       
        try{
            Connection con = Conexion.getConexion();
            String q = "select * from mproducto";
            
            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Producto  u = new Producto();
                u.setId_producto(rs.getInt(1));
                u.setId_sabor(rs.getInt(2));
                u.setId_cantidad(rs.getInt(3));
                u.setId_tamano(rs.getInt(4));
                u.setId_presentacion(rs.getInt(5));
                u.setPrecio_producto(rs.getInt(6));
                u.setStock_producto(rs.getInt(7));
                u.setNom_producto(rs.getString(8));
                
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
