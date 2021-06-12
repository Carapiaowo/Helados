<%-- 
    Document   : detallesGestionar
    Created on : 8/06/2021, 02:05:20 AM
    Author     : Danielao.0
--%>

<%@page import="Model.Cdescuento"%>
<%@page import="Model.CdescuentoCRUD"%>
<%@page import="Model.Ccantidad"%>
<%@page import="Model.CcantidadCRUD"%>
<%@page import="Model.Ctamano"%>
<%@page import="Model.CtamanoCRUD"%>
<%@page import="Model.Cpresentacion"%>
<%@page import="Model.CpresentacionCRUD"%>
<%@page import="Model.Csabores"%>
<%@page import="java.util.List"%>
<%@page import="Model.CsaboresCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="CSS/consultas.css">
        <title>Configuraciones</title>
    </head>
    <body>
        <section>
        <h1>Gestión de configuraciones</h1>
        <br>
        <div class="container">
        <table border="2" >
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Sabores</th>
                </tr>        
            </thead>
            <tbody>
                <%
                    List<Csabores> listaa = CsaboresCRUD.ConsultarSabores();
                    for(Csabores u : listaa){
                    %>
                    <tr>
                        <td> <%=u.getId_sabor() %> </td>
                        <td> <%=u.getNom_sabor()%> </td>
                        <td> <a href="borrarsabor?id=<%=u.getId_sabor()%>" >Borrar</a> </td>
                    </tr>    
                    
                    <%
                    }
                    %>
            </tbody>
        </table>
               <section class="registro">
        <div class="the-bg"></div>
  <div class="container">
    <div class="title">Registrar nuevo sabor</div>
    <div class="content">
        <form name="formulario" method="get" action="guardar_sabor">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Nombre</span>
            <input type="text" placeholder="Nuevo sabor" maxlength="30" required name="nom" onkeypress="return validarn(event);" >
          </div>
              </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
      </form>
  </div>
        </section>
            </div>
            </section>
            <section>
                <div class="container">
                <table border ="2">
                      <thead>
                <tr>
                    <th>ID</th>
                    <th>Presentaciones</th>
                </tr>        
            </thead>
            <tbody
                   <%
                    List<Cpresentacion> lista = CpresentacionCRUD.ConsultarPresentaciones();
                    for(Cpresentacion u : lista){
                    %>
                    <tr>
                        <td> <%=u.getId_presentacion() %> </td>
                        <td> <%=u.getTipo_presentacion() %> </td>
                        <td> <a href="borrarpresentacion?id=<%=u.getId_presentacion() %>" >Borrar</a> </td>
                    </tr>    
                    
                    <%
                    }
                    %>
            </tbody>
                </table>
              <section class="registro">
        <div class="the-bg"></div>
  <div class="container">
    <div class="title">Registrar nueva presentación</div>
    <div class="content">
        <form name="formulario" method="get" action="guardar_presentacion">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Presentación</span>
            <input type="text" placeholder="Nueva presentación" maxlength="30" required name="nom" onkeypress="return validarn(event);" >
          </div>
              </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
      </form>
        
  </div>
        </section>
                </div>
            </section>
     
      <section>
                <div class="container">
                <table border ="2">
                      <thead>
                <tr>
                    <th>ID</th>
                    <th>Tamaños</th>
                </tr>        
            </thead>
            <tbody
                   <%
                    List<Ctamano> listat = CtamanoCRUD.ConsultarTamanos();
                    for(Ctamano u : listat){
                    %>
                    <tr>
                        <td> <%=u.getId_tamano() %> </td>
                        <td> <%=u.getNombre_tamano() %> </td>
                        <td> <a href="borrar_tamano?id=<%=u.getId_tamano() %>" >Borrar</a> </td>
                    </tr>    
                    
                    <%
                    }
                    %>
            </tbody>
                </table>
              <section class="registro">
        <div class="the-bg"></div>
  <div class="container">
    <div class="title">Registrar nuevo tamaño</div>
    <div class="content">
        <form name="formulario" method="get" action="guardar_tamano">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Nombre tamaño</span>
            <input type="text" placeholder="Nuevo tamaño" maxlength="30" required name="nom" onkeypress="return validarn(event);" >
          </div>
              </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
      </form>
        
  </div>
        </section>
                </div>
            </section>
            
      <section>
                <div class="container">
                <table border ="2">
                      <thead>
                <tr>
                    <th>ID Porción/Tamaño</th>
                    <th>Valor</th>
                     <th>Cantidad</th>
                </tr>        
            </thead>
            <tbody
                   <%
                    List<Ccantidad> listac = CcantidadCRUD.ConsultarCantidades();
                    for(Ccantidad u : listac){
                    %>
                    <tr>
                        <td> <%=u.getId_cantidad() %> </td>
                        <td> <%=u.getValor_cantidad() %> </td>
                        <td> <%=u.getUnidad_cantidad() %> </td>
                        <td> <a href="borrarcantidad?id=<%=u.getId_cantidad() %>" >Borrar</a> </td>
                    </tr>    
                    
                    <%
                    }
                    %>
            </tbody>
                </table>
              <section class="registro">
        <div class="the-bg"></div>
  <div class="container">
    <div class="title">Registrar nueva cantidad</div>
    <div class="content">
        <form name="formulario" method="get" action="guardar_cantidad">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Valor</span>
            <input type="number" placeholder="Valor" maxlength="30" required name="val" onkeypress="return validarnn(event);" >
          </div>
            <div class="input-box">
            <span class="details">Unidad</span>
            <input type="text" placeholder="Unidad de medida" maxlength="30" required name="uni" onkeypress="return validarn(event);" >
          </div>
              </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
      </form>
        
  </div>
        </section>
                </div>
            </section>
            
              <section>
                <div class="container">
                <table border ="2">
                      <thead>
                <tr>
                    <th>ID</th>
                    <th>Descuentos</th>
                </tr>        
            </thead>
            <tbody
                   <%
                    List<Cdescuento> listad = CdescuentoCRUD.ConsultarDescuentos();
                    for(Cdescuento u : listad){
                    %>
                    <tr>
                        <td> <%=u.getIddescuento()%> </td>
                        <td> <%=u.getValor()+"%" %> </td>
                        <td> <a href="borrardescuento?id=<%=u.getIddescuento()%>" >Borrar</a> </td>
                    </tr>    
                    
                    <%
                    }
                    %>
            </tbody>
                </table>
              <section class="registro">
        <div class="the-bg"></div>
  <div class="container">
    <div class="title">Registrar nuevo descuento</div>
    <div class="content">
        <form name="formulario" method="get" action="guardar_descuento">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Valor</span>
            <input type="number" placeholder="Valor" maxlength="2" required name="valor" onkeypress="return validarnn(event);" >
          </div>
              </div>
        <div class="contbtn">
          <input type="submit" name="accion" value="Registrar" class="btn btn-default">
        </div>
      </form>
        
  </div>
        </section>
                </div>
            </section>
    </body>
</html>