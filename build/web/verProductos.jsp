<%-- 
    Document   : index
    Created on : 23-may-2021, 11:25:42
    Author     : Jose Manuel
--%>

<%@page import="Model.CsaboresCRUD"%>
<%@page import="Model.Csabores"%>
<%@page import="Model.Producto"%>
<%@page import="Model.ProductoCRUD"%>
<%@page import="java.util.List"%>
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
            <a class="navbar-brand" type="submit" href="bienvenida.html">Principal</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                    <li class="nav-item">
                        <a class="nav-link" href="AccionesCarrito?accion_carrito=Carrito"><i class="fas fa-cart-plus"><label style="color:red">${contador}</label></i></a>                        
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Carrito</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container mt-3">
     
            <div class="row">

                <% List<Producto> lista = ProductoCRUD.ConsultarProductos();
              
                    for(Producto u : lista){
                 Csabores c = CsaboresCRUD.BuscarSabor(u.getId_sabor());
                %>
                    <div class="col-sm-4">
                        <div class="card" style="width: 18rem;">
                               <img src="https://images.unsplash.com/photo-1567206563064-6f60f40a2b57?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=667&q=80" class="card-img-top" alt="...">
                               <div class="card-body">
                                    <h5 class="card-title"> <%=u.getNom_producto()%> </h5>
                                <p class="card-text"><%=c.getNom_sabor()%></p>
                               </div>
                                 <ul class="list-group list-group-flush">
                                <li class="list-group-item">Precio:<%=u.getPrecio_producto()+"$"%></li>
                            </ul>
                               <div class="card-body text-center d-grid" >
                                <a href="AccionesCarrito?accion_carrito=AgregarCarrito&id_car=<%=u.getId_producto()%>" type="submit"  class="btn btn-outline-success">Comprar</a>
                            </div>
                            
                        </div>
                    </div>
                        
                    <%
                    }
                    %>
            
            </div>
        </div> 

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>