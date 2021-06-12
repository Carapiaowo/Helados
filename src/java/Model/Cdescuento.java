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
public class Cdescuento {
    int iddescuento, valor;
    public Cdescuento(){
        
    }

    public Cdescuento(int iddescuento, int valor) {
        this.iddescuento = iddescuento;
        this.valor = valor;
    }

    public int getIddescuento() {
        return iddescuento;
    }

    public void setIddescuento(int iddescuento) {
        this.iddescuento = iddescuento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
