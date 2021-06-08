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
        <script src="https://kit.fontawesome.com/c2b95e5f24.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio, Prueba</title>
    </head>
    <body>


        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" type="submit" href="AccionesCarrito?accion_carrito=Home">beniyerris</a>
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
                            <form method="GET" action="Controller">
                                <div>
                                    <a value="agregar_adm" href="Controller?accion_adm=agregar_consulta_adm" name="accion_adm" type="submit" class="dropdown-item text-secondary">Agregar</a>
                                    <a value="modificar_adm" href="Controller?accion_adm=modificar_adm" type="submit" class="dropdown-item text-secondary">Modificar</a>
                                    <a value="consulta_adm" href="Controller?accion_adm=consulta_adm" type="submit" class="dropdown-item text-secondary">Consultar</a>
                                </div>
                            </form>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="AccionesCarrito?accion_carrito=Carrito"><i class="fas fa-cart-plus"><label style="color:red">${contador}</label></i></a>                        
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Bienvenido</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container mt-3">
            <div class="row">

                <%System.out.println("Dios, dame una señal");
                    try {
                        ;%>
                <c:forEach var="pr" items="${productos}">
                    <%System.out.println("¿Es esta la señal?");%>
                    <div class="col-sm-4">
                        <div class="card" style="width: 18rem;">
                            <img src="https://hips.hearstapps.com/es.h-cdn.co/mcres/images/mi-casa/terraza-jardines-porche/cuidados-gatos-lactantes/1471229-1-esl-ES/me-he-encontrado-un-gatito-que-hago.jpg?resize=480:*" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${pr.getNombre()}</h5>
                                <p class="card-text">${pr.getDescripcion()}</p>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">Precio: ${pr.getPrecio()}</li>
                            </ul>
                            <div class="card-body text-center d-grid" >
                                <a href="AccionesCarrito?accion_carrito=AgregarCarrito&id_car=${pr.getId()}" type="submit"  class="btn btn-outline-success">Comprar</a>
                            </div>
                        </div></div>
                    </c:forEach>
                    <%} catch (Exception e) {
                            System.out.println(e);
                        }%>

            </div>
        </div> 

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
