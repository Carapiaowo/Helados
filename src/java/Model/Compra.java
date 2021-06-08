/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CarapiaOwO
 */
public class Compra {
    
    private int id,idpago;
    private String estado;
    private Double monto;
    private Usuario usuario;
    
    private List<Carrito> compras;

    public Compra() {
    }

    public Compra(int idpago, String estado, Double monto, Usuario usuario, List<Carrito> compras) {
        this.idpago = idpago;
        this.estado = estado;
        this.monto = monto;
        this.usuario = usuario;
        this.compras = compras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Carrito> getCompras() {
        return compras;
    }

    public void setCompras(List<Carrito> compras) {
        this.compras = compras;
    }
    
    
    
    
}
