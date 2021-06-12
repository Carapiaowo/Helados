<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login de usuario</title>
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
    <div class="title">Inicia Sesión</div>
    <div class="content">
      <form action="Validar" method="post" name="Login">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Usuario</span>
            <input type="text" required name="usu" maxlength="10" >
            <span class="details">Contraseña</span>
            <input type="password" required name="pass" maxlength="15" >
            </div>
        </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Ingresar" class="btn btn-default" >
        </div>
      </form>
          </div>
       <div class="consulta">
           <br>
           
           <a href="login_admin.jsp">¿Eres administrador?</a>
       </div>
  </div>
        </section>
    </body>
</html>