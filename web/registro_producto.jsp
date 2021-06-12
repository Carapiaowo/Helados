<%-- 
    Document   : registro_producto
    Created on : 8/06/2021, 12:07:25 PM
    Author     : Danielao.0
--%>

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
    <div class="title">Agregar producto</div>
    <div class="content">
        <form name="formulario" method="post" action="guardar_producto">
        
            <div class="user-details">
          <div class="input-box">
            <span class="details">Nombre</span>
            <input type="text" placeholder="Ingresa el nombre" maxlength="30" required name="nom" onkeypress="return validarn(event);" >
          </div>
            <div class="input-box">
            <span class="details">Precio</span>
            <input type="number" placeholder="Precio" min="1" required name="precio" >
          </div>
             <div class="input-box">
            <span class="details">Stock</span>
            <input type="number" placeholder="Stock"  required name="stock" >
          </div>
          <div class="input-box">
              <span class="details">Sabor</span>
            <select name="sabor" id="" required>
                <%  List<Csabores> listacs = CsaboresCRUD.ConsultarSabores();
                    for(Csabores u : listacs){
                    %>
                    <option value="<%=u.getId_sabor()%>"><%=u.getNom_sabor()%></option>
                 <% } %>
            </select>
            </div>
               <div class="input-box">
              <span class="details">Tamaño</span>
            <select name="tamano" id="" required>
                <%  List<Ctamano> listat = CtamanoCRUD.ConsultarTamanos();
                    for(Ctamano u : listat){
                    %>
                    <option value="<%=u.getId_tamano() %>"><%=u.getNombre_tamano() %></option>
                 <% } %>
            </select>
            </div>
              <div class="input-box">
              <span class="details">Presentación</span>
            <select name="presentacion" id="" required>
                <%  List<Cpresentacion> listap = CpresentacionCRUD.ConsultarPresentaciones();
                    for(Cpresentacion u : listap){
                    %>
                    <option value="<%=u.getId_presentacion() %>"><%=u.getTipo_presentacion() %></option>
                 <% } %>
            </select>
            </div>
               <div class="input-box">
              <span class="details">Cantidad</span>
            <select name="cantidad" id="" required>
                <%  List<Ccantidad> listacc = CcantidadCRUD.ConsultarCantidades();
                    for(Ccantidad u : listacc){
                    %>
                    <option value="<%=u.getId_cantidad() %>"><%=u.getValor_cantidad() + u.getUnidad_cantidad()%></option>
                 <% } %>
            </select>
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


