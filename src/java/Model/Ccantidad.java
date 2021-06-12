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
public class Ccantidad {
   int  id_cantidad, valor_cantidad;
   String unidad_cantidad;
   
   public Ccantidad(){
       
   }

    public Ccantidad(int id_cantidad, int valor_cantidad, String unidad_cantidad) {
        this.id_cantidad = id_cantidad;
        this.valor_cantidad = valor_cantidad;
        this.unidad_cantidad = unidad_cantidad;
    }

    public int getId_cantidad() {
        return id_cantidad;
    }

    public void setId_cantidad(int id_cantidad) {
        this.id_cantidad = id_cantidad;
    }

    public int getValor_cantidad() {
        return valor_cantidad;
    }

    public void setValor_cantidad(int valor_cantidad) {
        this.valor_cantidad = valor_cantidad;
    }

    public String getUnidad_cantidad() {
        return unidad_cantidad;
    }

    public void setUnidad_cantidad(String unidad_cantidad) {
        this.unidad_cantidad = unidad_cantidad;
    }
   
   
}
