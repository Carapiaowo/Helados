<%-- 
    Document   : registro_producto
    Created on : 8/06/2021, 12:07:25 PM
    Author     : Danielao.0
--%>

<%@page import="Model.Cdescuento"%>
<%@page import="Model.CdescuentoCRUD"%>
<%@page import="Model.Ccantidad"%>
<%@page import="Model.CcantidadCRUD"%>
<%@page import="Model.Cpresentacion"%>
<%@page import="Model.CpresentacionCRUD"%>
<%@page import="Model.Ctamano"%>
<%@page import="Model.CtamanoCRUD"%>
<%@page import="Model.Csabores"%>
<%@page import="java.util.List"%>
<%@page import="Model.CsaboresCRUD"%>
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
    <div class="title">Agregar promoción</div>
    <div class="content">
        <form name="formulario" method="post" action="guardar_promocion">
            <div class="user-details">
          <div class="input-box">
            <span class="details">Nombre de la promoción</span>
            <input type="text" placeholder="Ingresa el nombre" maxlength="30" required name="nom" onkeypress="return validarn(event);" >
          </div>
          <div class="input-box">
              <span class="details">Descuento aplicado</span>
            <select name="descuento" id="" required>
                <%  List<Cdescuento> listacd = CdescuentoCRUD.ConsultarDescuentos();
                    for(Cdescuento u : listacd){
                    %>
                    <option value="<%=u.getIddescuento() %>"><%=u.getValor()%></option>
                 <% } %>
            </select>
            </div>
                <div class="input-box">
            <span class="details">Descripcion</span>
            <input type="text" placeholder="Ingresa el nombre" maxlength="40" required name="desc" >
          </div>
            <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
             </div>  
      </form>
  </div>
        </section>
    </body>
</html>


