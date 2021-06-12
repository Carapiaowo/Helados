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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielao.0
 */
public class Usuario {
   private  int idusuario, edad_usu;
   private String nom_usu, appat_usu, apmat_usu, fechnac_usu, domicilio_usu, tel_usu, cel_usu, user_usu, pass_usu;
  
   public Usuario(){
       
   }

    public Usuario(String user_usu, String pass_usu) {
  
        this.user_usu = user_usu;
        this.pass_usu = pass_usu;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getEdad_usu() {
        return edad_usu;
    }

    public void setEdad_usu(int edad_usu) {
        this.edad_usu = edad_usu;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getAppat_usu() {
        return appat_usu;
    }

    public void setAppat_usu(String appat_usu) {
        this.appat_usu = appat_usu;
    }

    public String getApmat_usu() {
        return apmat_usu;
    }

    public void setApmat_usu(String apmat_usu) {
        this.apmat_usu = apmat_usu;
    }

    public String getFechnac_usu() {
        return fechnac_usu;
    }

    public void setFechnac_usu(String fechnac_usu) {
        this.fechnac_usu = fechnac_usu;
    }

    public String getDomicilio_usu() {
        return domicilio_usu;
    }

    public void setDomicilio_usu(String domicilio_usu) {
        this.domicilio_usu = domicilio_usu;
    }

    public String getTel_usu() {
        return tel_usu;
    }

    public void setTel_usu(String tel_usu) {
        this.tel_usu = tel_usu;
    }

    public String getCel_usu() {
        return cel_usu;
    }

    public void setCel_usu(String cel_usu) {
        this.cel_usu = cel_usu;
    }

    public String getUser_usu() {
        return user_usu;
    }

    public String getPass_usu() {
        return pass_usu;
    }

    public void setUser_usu(String user_usu) {
        this.user_usu = user_usu;
    }

    public void setPass_usu(String pass_usu) {
        this.pass_usu = pass_usu;
    }
   
    public Usuario verificarusu(String usuario, String pass){
        Usuario usu =null;
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            con= Conexion.getConexion();
            String q="SELECT * FROM usuario WHERE user_usu= ? AND pass_usu= ?";
            ps=con.prepareStatement(q);
            ps.setString(1,usuario);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while(rs.next()){
                usu=new Usuario();
                usu.setIdusuario(rs.getInt("idusuario"));
                usu.setApmat_usu(rs.getString("apmat_usu"));
                usu.setAppat_usu(rs.getString("appat_usu"));
                usu.setCel_usu(rs.getString("cel_usu"));
                usu.setNom_usu(rs.getString("nom_usu"));
                usu.setEdad_usu(rs.getInt("edad_usu"));
                usu.setTel_usu(rs.getString("tel_usu"));
                usu.setFechnac_usu(rs.getString("fechnac_usu"));
                usu.setDomicilio_usu(rs.getString("domicilio_usu"));
                usu.setUser_usu(rs.getString("user_usu"));
                usu.setPass_usu(rs.getString("pass_usu"));
                break;
            }
        }catch(SQLException sq){
            System.out.println("Error al consultar el usuario");
            System.out.println(sq.getMessage());
            usu=null;
        }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(Exception e){
                System.out.println("Error al encontrar la clase");
                System.out.println(e.getMessage());
            }
        }
        return usu;
    }
    
  
   
    
}
