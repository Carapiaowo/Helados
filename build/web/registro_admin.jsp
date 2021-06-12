<%-- 
    Document   : registro_usuario
    Created on : 7/06/2021, 09:32:52 AM
    Author     : Danielao.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de administrador</title>
          <link rel="stylesheet" href="CSS/login.css">
            <script src="JS/validar.js"></script>
    </head>
   <body>
       <section class="registro">
        <div class="the-bg"></div>
  <div class="container">
    <div class="title">Registrar nuevo administrador</div>
    <div class="content">
        <form name="formulario" method="get" action="guardar_admin">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Nombre</span>
            <input type="text" placeholder="Ingresa tu nombre" maxlength="30" required name="nom" onkeypress="return validarn(event);" >
          </div>
          <div class="input-box">
            <span class="details">Apellido paterno</span>
            <input type="text" placeholder="Ingresa apellido paterno" maxlength="20" required name="appat" onkeypress="return validarn(event);" >
          </div>
          <div class="input-box">
            <span class="details">Apellido materno</span>
            <input type="text" placeholder="Ingresa apellido materno" maxlength="20" required name="apmat"  onkeypress="return validarn(event);">
          </div>
             <div class="input-box">
            <span class="details">Nombre de usuario</span>
            <input type="text" placeholder="Nombre de usuario" maxlength="15" required name="usu">
          </div>
               <div class="input-box">
            <span class="details">Contraseña</span>
            <input type="password" placeholder="Crea una contraseña" required name="pass" maxlength="20">
          </div>
        </div>
           
        <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
      </form>
          </div>
  </div>
        </section>
    </body>
</html>
