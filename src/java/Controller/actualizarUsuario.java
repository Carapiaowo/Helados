/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Model.UsuarioCRUD;
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
public class actualizarUsuario extends HttpServlet {

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
       String user, pass, fechnac, tel, cel, nom, appat, apmat, domicilio;
       int edad;
        int id = Integer.parseInt(request.getParameter("id2"));
        
       user = request.getParameter("user2");
       pass = request.getParameter("pass2");
       fechnac = request.getParameter("fechnac2");
       tel = request.getParameter("tel2");
       cel = request.getParameter("cel2");
       nom = request.getParameter("nom2");
       appat = request.getParameter("appat2");
       apmat = request.getParameter("apmat2");
       domicilio = request.getParameter("domicilio2");
      edad = Integer.parseInt(request.getParameter("edad2"));
      
      Usuario u = new Usuario();
      
      u.setIdusuario(id);
      u.setApmat_usu(apmat);
      u.setAppat_usu(appat);
      u.setCel_usu(cel);
      u.setDomicilio_usu(domicilio);
      u.setEdad_usu(edad);
      u.setFechnac_usu(fechnac);
      u.setUser_usu(user);
      u.setPass_usu(pass);
      u.setNom_usu(nom);
      u.setTel_usu(tel);
      
      int estatus = UsuarioCRUD.actualizarUsuario(u);
      
        if(estatus>0){
            System.out.println("Actualizado");
            
           response.sendRedirect("bienvenida.html");
       }else{
           response.sendRedirect("error.jsp");
            System.out.println("no actualizado");
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
