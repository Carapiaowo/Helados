<%-- 
    Document   : consultarEmpleados
    Created on : 14/05/2021, 06:29:44 PM
    Author     : demon
--%>

<%@page import="Model.UsuarioCRUD"%>
<%@page import="Model.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="CSS/consultas.css">
        <title>Usuarios registrados</title>
    </head>
    <body>
        <h1>Tabla de Usuarios registrados</h1>
        <br>
        <div class="container">
        <table border="2" >
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Edad</th>
                    <th>Fecha de nacimiento</th>
                    <th>Domicilio</th>
                    <th>Teléfono</th>
                     <th>Celular</th>
                     <th>Usuario</th>
                </tr>        
            </thead>
            <tbody>
                <%
                    List<Usuario> lista = UsuarioCRUD.ConsultarUsuarios();
                    for(Usuario u : lista){
                    %>
                    <tr>
                        <td> <%=u.getIdusuario()%> </td>
                        <td> <%=u.getNom_usu()+" "+ u.getAppat_usu()+" "+u.getApmat_usu()%> </td>
                        <td> <%=u.getEdad_usu() %> </td>
                        <td> <%=u.getFechnac_usu()%> </td>
                        <td> <%=u.getDomicilio_usu() %> </td>
                         <td> <%=u.getTel_usu() %> </td>
                         <td> <%=u.getCel_usu() %> </td>
                           <td> <%=u.getUser_usu()%> </td>
                        <td> <a href="editarusuario.jsp?id=<%=u.getIdusuario()%>" >Editar</a> </td>
                        <td> <a href="borrarusuario?id=<%=u.getIdusuario()%>" >Borrar</a> </td>
                    </tr>    
                    <%
                    }
                    %>
            </tbody>
        </table>
            </div>
    </body>
</html>