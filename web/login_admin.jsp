<%-- 
    Document   : login_admin
    Created on : 7/06/2021, 09:37:49 AM
    Author     : Danielao.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuario</title>
          <link rel="stylesheet" href="CSS/login.css">
            <script src="JS/validar.js"></script>
    </head>
   <body>
       <section class="registro">
           <div class="the-bg"></div>
  <div class="container">
       <div class="logo">
                        <a href="index.html"><img src="img/camion.png"></a>
            </div>
    <div class="title">Inicia Sesión de Administrador</div>
    <div class="content">
        <form action="Validar2" name="login2" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Usuario</span>
            <input type="text" required name="usu" maxlength="15">
            </div>
               <div class="input-box">
            <span class="details">Contraseña</span>
            <input type="password" required name="pass" maxlength="20">
          </div>
        </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Ingresar">
        
        </div>
      </form>
          </div>
  </div>
        </section>
    </body>
</html>
