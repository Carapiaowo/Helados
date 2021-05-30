<%-- 
    Document   : index
    Created on : 23-may-2021, 11:25:42
    Author     : Jose Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio, Prueba</title>
    </head>
    <body>
        
        
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">beniyerris</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
         <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Productos
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdown">
          <form method="POST" action="Controller">
            <div>
                <input name="accion" value="AgregarProducto" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="ConsultarProducto" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="EditarProducto" type="submit" class="dropdown-item text-secondary">
          </div>
        </form>
        </div>
      </li>
      <li class="nav-item">
         <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Promociones
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdown">
          <form method="POST" action="Controller">
            <div>
                <input name="accion" value="AgregarPromocion" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="ConsultarPromocion" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="EditarPromocion" type="submit" class="dropdown-item text-secondary">
          </div>
        </form>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Usuarios
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdown">
        <form method="POST" action="Controller">
            <div>
                <input name="accion" value="AgregarUsuario" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="ConsultarUsuario" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="EditarUsuario" type="submit" class="dropdown-item text-secondary">
          </div>
        </form>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Administradores
        </a>
        <div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdown">
          <form method="POST" action="Controller">
            <div>
                <input name="accion" value="AgregarAdministrador" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="ConsultarAdministrador" type="submit" class="dropdown-item text-secondary">
                <input name="accion" value="EditarAdministrador" type="submit" class="dropdown-item text-secondary">
          </div>
        </form>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Bienvenido</a>
      </li>
    </ul>
  </div>
</nav>
        
       
       <div class="m-5">
        
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
            <tbody>
                <%
                    try{
                        
                %>
            <c:forEach var="dato" items="${datos}">
            <tr>
                <th scope="row">${dato.getId()}</th>
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
                <%System.out.println("Bien.");
                    }catch(Exception e){
                            System.out.println("Mal.");
                    }
                %>
            </tbody>
        </table>
        
       
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
    </html>
