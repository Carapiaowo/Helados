<%-- 
    Document   : consultarEmpleados
    Created on : 14/05/2021, 06:29:44 PM
    Author     : demon
--%>

<%@page import="Model.Admin"%>
<%@page import="Model.AdminCRUD"%>
<%@page import="Model.UsuarioCRUD"%>
<%@page import="Model.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="CSS/consultas.css">
        <title>Admins registrados</title>
    </head>
    <body>
        <h1>Tabla de Administradores</h1>
        <br>
        <div class="container">
        <table border="2" >
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Usuario</th>
                    <th>Contraseña</th>
                </tr>        
            </thead>
            <tbody>
                <%
                    List<Admin> lista = AdminCRUD.ConsultarAdmins();
                    for(Admin u : lista){
                    %>
                    <tr>
                        <td> <%=u.getIdadmin()%> </td>
                        <td> <%=u.getNom_admin()+" "+ u.getAppat_admin()+" "+u.getApmat_admin()%> </td>
                           <td> <%=u.getUser_admin() %> </td>
                           <td> <%=u.getPass_admin() %> </td>
                        <td> <a href="actualizarAdmin.jsp?id=<%=u.getIdadmin()%>" >Editar</a> </td>
                        <td> <a href="borraradmin?id=<%=u.getIdadmin()%>" >Borrar</a> </td>
                    </tr>    
                    <%
                    }
                    %>
            </tbody>
        </table>
            </div>
    </body>
</html>