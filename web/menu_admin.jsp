<%-- 
    Document   : menu_admin
    Created on : 7/06/2021, 04:46:05 PM
    Author     : Danielao.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gestión</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="CSS/masterstyle.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,300;1,400&display=swap" rel="stylesheet">
    </head>
    <body>

        
        <header class="header">
           
            <nav id="navegador">  
                <div class="icono" id="icono">
                    <a href="cerrarSesion"><img src="https://upload.wikimedia.org/wikipedia/en/1/17/Ben_and_jerry_logo.svg"> Salir</a>
              
                </div>
                <div class="menu" id="ayuda">
                    <ul class="listap">
                        <li class="cat" ><a class="cat">Usuarios</a>
                            <ul class="listah">
                                <li><a onClick="frame('consultarUsuarios.jsp')">Consultar</a></li>
                            </ul>
                        </li>
                        <li class="cat" ><a class="cat">Panel de administradores</a>
                            <ul class="listah">
                                <li><a onClick="frame('registro_admin.jsp')">Agregar</a></li>
                                <li><a onClick="frame('consultarAdmins.jsp')">Gestionar/Consultar</a></li>
                            </ul>
                        </li>
                        <li class="cat" ><a class="cat">Productos</a>
                            <ul class="listah">
                                <li><a onClick="frame('registro_producto.jsp')">Agregar</a></li>
                                <li><a onClick="frame('consultarProductos.jsp')">Consultar/Gestionar</a></li>
                                <li><a onClick="frame('detallesGestionar.jsp')">Controles avanzados</a></li>
                            </ul>
                        </li>
                        <li class="cat"><a class="cat">Promociones</a>
                            <ul class="listah">
                                <li><a onClick="frame('registro_promo.jsp')">Agregar</a></li>
                                <li><a onClick="frame('consultarPromociones.jsp')">Consultar</a></li>
                            </ul>
                        
                    </ul>
                </div>
            </nav>
  
        </header>

        <section class="section1">
            <div class="contenedor">
            <iframe id="frame" src="bienvenida.html"></iframe>
           </div>
        </section>

        <script src="JS/script.js"></script>
    </body>
</html>
