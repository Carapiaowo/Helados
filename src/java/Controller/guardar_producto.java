/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Producto;
import Model.ProductoCRUD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Danielao.0
 */
public class guardar_producto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
       String nom_producto;
       int id_sabor, id_cantidad, id_tamano, id_presentacion, precio_producto, stock_producto;
               
       nom_producto = request.getParameter("nom");
       stock_producto = Integer.parseInt(request.getParameter("stock"));
       precio_producto = Integer.parseInt(request.getParameter("precio"));
       id_sabor = Integer.parseInt(request.getParameter("sabor"));
       id_cantidad = Integer.parseInt(request.getParameter("cantidad"));
       id_tamano = Integer.parseInt(request.getParameter("tamano"));
       id_presentacion = Integer.parseInt(request.getParameter("presentacion"));
       
       Producto p = new Producto();
       
       p.setId_cantidad(id_cantidad);
       p.setId_presentacion(id_presentacion);
       p.setId_sabor(id_sabor);
       p.setNom_producto(nom_producto);
       p.setPrecio_producto(precio_producto);
       p.setStock_producto(stock_producto);
       p.setId_tamano(id_tamano);
       
       int estatus = ProductoCRUD.registrar_producto(p);
       
       if(estatus>0){
           System.out.println("registrado");
           response.sendRedirect("detallesGestionar.jsp");
       }else{
           System.out.println("noregistrado");
           response.sendRedirect("error.jsp");
       }
        }
        
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
        processRequest(request, response);
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
