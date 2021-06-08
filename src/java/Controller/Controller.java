/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.AdminCRUD;
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
 * @author Jose Manuel
 */
public class Controller extends HttpServlet {

    AdminCRUD admcrud = new AdminCRUD();
    List<Admin> datos_adm = new ArrayList<>();

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
        datos_adm = admcrud.adminConsulta();

        String user_adm, correo_adm, pass_adm;
        user_adm = request.getParameter("usu_adm");
        correo_adm = request.getParameter("cor_adm");
        pass_adm = request.getParameter("con_adm");
        String accion_adm = request.getParameter("accion_adm");
        System.out.println(user_adm + correo_adm + pass_adm);
        System.out.println("La cosa esta xD: " + accion_adm);
        if (accion_adm.equalsIgnoreCase("consulta_adm")) {

            accion_adm = "admin/consulta_adm.jsp";

        } else if (accion_adm.equalsIgnoreCase("agregar_adm")) {
            accion_adm = "admin/consulta_adm.jsp";

            Admin adm = new Admin();
            adm.setUser(user_adm);
            adm.setPass(pass_adm);
            adm.setCorreo(correo_adm);
            admcrud.adminAgregar(adm);

        } else if (accion_adm.equalsIgnoreCase("agregar_consulta_adm")) {

            accion_adm = "admin/agregar_adm.jsp";
            request.getRequestDispatcher(accion_adm).forward(request, response);
        }

        request.setAttribute("datos_adm", datos_adm);
        request.getRequestDispatcher(accion_adm).forward(request, response);

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
