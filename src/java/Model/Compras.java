/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CarapiaOwO
 */
public class Compras {
    
    Connection con;
    Connect cn = new Connect();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public int comprar(Compra compra){
    
        String sql ="insert into compras (idCompras,idCliente,idPago,Monto,Estado) values (?,?,?,?)";
        
        try{
            con=cn.connect();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        
    return r;
    }
}
