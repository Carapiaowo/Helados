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
public class Promocion {
    int idpromocion, iddescuento;
    String nom_promocion, desc_promocion;
    
    public Promocion(){
        
    }

    public Promocion(int idpromocion, int iddescuento, String nom_promocion, String desc_promocion) {
        this.idpromocion = idpromocion;
        this.iddescuento = iddescuento;
        this.nom_promocion = nom_promocion;
        this.desc_promocion = desc_promocion;
    }

    public int getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(int idpromocion) {
        this.idpromocion = idpromocion;
    }

    public int getIddescuento() {
        return iddescuento;
    }

    public void setIddescuento(int iddescuento) {
        this.iddescuento = iddescuento;
    }

    public String getNom_promocion() {
        return nom_promocion;
    }

    public void setNom_promocion(String nom_promocion) {
        this.nom_promocion = nom_promocion;
    }

    public String getDesc_promocion() {
        return desc_promocion;
    }

    public void setDesc_promocion(String desc_promocion) {
        this.desc_promocion = desc_promocion;
    }
    
    
}
