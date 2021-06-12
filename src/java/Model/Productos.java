/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/*
 *
 * @author CarapiaOwO
 */
public class Productos {

    Connection con;
    Connect cn = new Connect();
    PreparedStatement ps;
    ResultSet rs;
    
    public Producto consultaId(int id){
    
        String sql = "select * from mproducto where id_producto="+id;
        Producto pr = new Producto();
        try {
            con = cn.connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            

            while (rs.next()) {
                pr.setId_producto(rs.getInt(1));
               pr.setId_sabor(rs.getInt(2));
               pr.setId_cantidad(rs.getInt(3));
               pr.setId_tamano(rs.getInt(4));
               pr.setId_presentacion(rs.getInt(5));
               pr.setPrecio_producto(rs.getInt(6));
               pr.setStock_producto(rs.getInt(7));
               pr.setNom_producto(rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    return pr;
    }

    public List menu(){

        List<Producto> productos = new ArrayList<>();

        String sql = "select * from mproducto";
        
        try {
            con = cn.connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
               Producto pr = new Producto();
               pr.setId_producto(rs.getInt(1));
               pr.setId_sabor(rs.getInt(2));
               pr.setId_cantidad(rs.getInt(3));
               pr.setId_tamano(rs.getInt(4));
               pr.setId_presentacion(rs.getInt(5));
               pr.setPrecio_producto(rs.getInt(6));
               pr.setStock_producto(rs.getInt(7));
               pr.setNom_producto(rs.getString(8));
               productos.add(pr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return productos;
    }

  
}