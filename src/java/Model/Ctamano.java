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
public class Ctamano {
    int id_tamano;
    String nombre_tamano;
    
    public Ctamano(){
        
    }
    
    public Ctamano(int id_tamano, String nombre_tamano) {
        this.id_tamano = id_tamano;
        this.nombre_tamano = nombre_tamano;
    }
        
    public int getId_tamano() {
        return id_tamano;
    }

    public void setId_tamano(int id_tamano) {
        this.id_tamano = id_tamano;
    }

    public String getNombre_tamano() {
        return nombre_tamano;
    }

    public void setNombre_tamano(String nombre_tamano) {
        this.nombre_tamano = nombre_tamano;
    }


    
    
}
