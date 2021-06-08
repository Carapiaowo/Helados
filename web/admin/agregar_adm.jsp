<%-- 
    Document   : agregar_adm
    Created on : 7/06/2021, 09:50:32 AM
    Author     : CarapiaOwO
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <title>agregar Administrador</title>
    </head>
    <body>

        <div class="container">
            <div>
                <h2 class="center-text">Agregar administrador</h2>
            </div>
            <form class="row g-3" method="GET" action="Controller">
                <div class="col-md-12">
                    <label class="form-label">Usuario</label>
                    <input type="text" class="form-control" name="usu_adm" placeholder="...">
                    
                </div>
                <div class="col-md-12">
                    <label class="form-label">Correo</label>
                    <input type="email" class="form-control" name="cor_adm" placeholder="example@example.com">
                </div>
                <div class="col-6">
                    <label class="form-label">Contraseña</label>
                    <input type="password" class="form-control" name="con_adm" placeholder="...">
                </div>
                <div class="col-6">
                    <label class="form-label">Confirma tu contraseña</label>
                    <input type="password" class="form-control" name="con_con_adm" placeholder="...">
                </div>
                <div class="d-grid mt-4 mb-4">    
                    <a value="agregar_adm" href="Controller?accion_adm=agregar_adm" type="submit" class="btn btn-outline-success">Agregar</a>
                </div>
            </form>
        </div>
    </body>
</html>
