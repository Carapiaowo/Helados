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
                        <a class="nav-link" href="AccionesCarrito?accion_carrito=Home"></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Carrito de compras</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container mt-5">
            <div class="row">
                <div class="col-sm-8">
                    <table class="table table-hover" border="0">
                        <thead>
                            <tr>
                                <th>ITEM</th>
                                <th>NOMBRE</th>
                                <th>PRECIO</th>
                                <th>CANTIDAD</th>
                                <th>SUBTOTAL</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="car" items="${carrito}">
                                <tr>
                                    <td>${car.getItem()}</td>
                                    <td>${car.getNombres()}</td>
                                    <td>${car.getPrecioCompra()}</td>
                                    <td>${car.getCantidad()}</td>
                                    <td>${car.getSubtotal()}</td>

                                    <td>
                                        <input type="hidden" id="idp" value="${car.getIdProducto()}">
                                        <a href="" id="btnBorrar" class="btn btn-outline-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col-sm-4">
                    <div class="card center-text">
                        <div class="card-header">
                            <h3>Realizar compra</h3>
                        </div>
                        <div class="card-body">
                            <label>Subtotal:</label>
                            <input type="text" value="${pagototal}" readonly="" class="form-control">
                            <label>Promocion:</label>
                            <input type="text" readonly="" class="form-control">
                            <label>Total a pagar:</label>
                            <input type="text" readonly="" value="${pagototal}" class="form-control">
                        </div>
                        <div class="card-footer d-grid">
                            <a href="#" class="btn btn-outline-success btn-justify">Generar ticket</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="JS/alertas.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.5.0.min.js"></script>

    </body>
</html>