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

/**
 *
 * @author CarapiaOwO
 */
public class Productos {

    Connection con;
    Connect cn = new Connect();
    PreparedStatement ps;
    ResultSet rs;
    
    public Product consultaId(int id){
    
        String sql = "select * from producto where idProducto="+id;
        Product pr = new Product();
        try {
            con = cn.connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            

            while (rs.next()) {
                pr.setId(rs.getInt(1));
                pr.setNombre(rs.getString(2));
                pr.setFoto(rs.getBinaryStream(3));
                pr.setDescripcion(rs.getString(4));
                pr.setPrecio(rs.getDouble(5));
                pr.setStock(rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    return pr;
    }

    public List menu(){

        List<Product> productos = new ArrayList<>();

        String sql = "select * from producto";
        
        try {
            con = cn.connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Product pr = new Product();
                pr.setId(rs.getInt(1));
                pr.setNombre(rs.getString(2));
                pr.setFoto(rs.getBinaryStream(3));
                pr.setDescripcion(rs.getString(4));
                pr.setPrecio(rs.getDouble(5));
                pr.setStock(rs.getInt(6));
                productos.add(pr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return productos;
    }

    public void mostrarImg(int id, HttpServletResponse response) {
        String sql = "select * from producto where idProducto=" + id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputStream = response.getOutputStream();
            con = cn.connect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                inputStream = rs.getBinaryStream("Foto");
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            
            while((i=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(i);
            }

        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
