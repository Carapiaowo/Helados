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
public class Cpresentacion {
  int  id_presentacion;
  String tipo_presentacion;
  
  public Cpresentacion(){
      
  }

    public Cpresentacion(int id_presentacion, String tipo_presentacion) {
        this.id_presentacion = id_presentacion;
        this.tipo_presentacion = tipo_presentacion;
    }

    public int getId_presentacion() {
        return id_presentacion;
    }

    public void setId_presentacion(int id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public String getTipo_presentacion() {
        return tipo_presentacion;
    }

    public void setTipo_presentacion(String tipo_presentacion) {
        this.tipo_presentacion = tipo_presentacion;
    }
  
  
}
