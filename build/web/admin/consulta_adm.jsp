<%-- 
    Document   : consulta_adm
    Created on : 7/06/2021, 09:50:08 AM
    Author     : CarapiaOwO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <title>Consulta Admin</title>
    </head>
    <body>
        <div class="m-5">
            <div>
                <h2>Administradores</h2>
            </div>
            <div class="d-grid mt-4 mb-4">    
                <a  href="Controller?accion_adm=agregar_consulta_adm" class="btn btn-primary">Agregar</a>
            </div>
            <table class="table table-hover">
                <thead class="bg-dark text-white">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Correo</th>
                        <th scope="col">Contraseña</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <%

                %>
                <tbody>
                    <%                        try {
                    %>
                    <c:forEach var="dato" items="${datos_adm}">
                        <tr>
                            <th scope="row">${dato.getId() }</th>
                            <td>${dato.getUser()}</td>
                            <td>${dato.getCorreo()}</td>
                            <td>${dato.getPass()}</td>
                            <td>
                                <form>
                                    <input class="btn btn-outline-danger" type="submit" value="Borrar">
                                    <input class="btn btn-outline-warning" type="submit" value="Editar">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    <%
                        } catch (Exception e) {
                            System.out.println("Mal." + e);
                        }
                    %>
                </tbody>
            </table>   
        </div>
    </body>
</html>
