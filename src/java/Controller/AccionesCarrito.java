/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carrito;
import Model.Producto;
import Model.Productos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diana
 */
public class AccionesCarrito extends HttpServlet {

    Productos pr = new Productos();
    Producto p = new Producto();
    List<Producto> productos = new ArrayList<>();
    List<Carrito> carrito = new ArrayList<>();
    int item;
    double pagototal = 0.0;
    int cantidad = 1;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion_carrito");
        productos = pr.menu();
        switch (accion) {
            case "AgregarCarrito":

                int idpro = Integer.parseInt(request.getParameter("id_car"));

                item = item + 1;

                Carrito car = new Carrito();

                p = pr.consultaId(idpro);

                car.setItem(item);
                car.setIdProducto(p.getId_producto());
                car.setNombres(p.getNom_producto());
                car.setPrecioCompra(p.getPrecio_producto());
                car.setCantidad(cantidad);
                car.setSubtotal((float) (cantidad * p.getPrecio_producto()));
                carrito.add(car);
                request.setAttribute("contador", carrito.size());
                request.getRequestDispatcher("AccionesCarrito?accion_carrito=home").forward(request, response);
                break;
                
            case "Borrar":
                int idproducto = Integer.parseInt(request.getParameter("idp"));

                for (int i = 0; i < carrito.size(); i++) {
                    if (carrito.get(i).getIdProducto() == idproducto) {
                        carrito.remove(i);
                    }
                }
                break;
                
            case "Carrito":
                pagototal = 0.0;
                request.setAttribute("carrito", carrito);

                for (int i = 0; i < carrito.size(); i++) {
                    pagototal = pagototal + carrito.get(i).getSubtotal();
                }
                request.setAttribute("pagototal", pagototal);
                request.getRequestDispatcher("verCarrito.jsp").forward(request, response);
                break;
            default:
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}