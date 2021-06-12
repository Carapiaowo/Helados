<%-- 
    Document   : consultarProductos
    Created on : 8/06/2021, 02:46:05 PM
    Author     : Danielao.0
--%>

<%@page import="Model.Cpresentacion"%>
<%@page import="Model.CpresentacionCRUD"%>
<%@page import="Model.Ccantidad"%>
<%@page import="Model.CcantidadCRUD"%>
<%@page import="Model.Ctamano"%>
<%@page import="Model.CtamanoCRUD"%>
<%@page import="Model.CsaboresCRUD"%>
<%@page import="Model.Csabores"%>
<%@page import="Model.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Model.ProductoCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="CSS/consultas.css">
        <title>Productos|| Consulta</title>
    </head>
    <body>
        <h1>Tabla de Productos</h1>
        <br>
        <div class="container">
        <table border="2" >
            <thead>
                <tr>
                    <th>ID</th>
                     <th>Nombre</th>
                    <th>Sabor</th>
                    <th>Cantidad</th>
                    <th>Tamaño</th>
                    <th>Presentacion</th>
                     <th>$</th>
                      <th>Stock</th>
                </tr>        
            </thead>
            <tbody>
                <%
                    List<Producto> lista = ProductoCRUD.ConsultarProductos();
                    for(Producto u : lista){
                       Csabores cs = CsaboresCRUD.BuscarSabor(u.getId_sabor());
                       Ctamano ct = CtamanoCRUD.BuscarTamano(u.getId_tamano());
                       Ccantidad cc = CcantidadCRUD.BuscarCantidad(u.getId_cantidad());
                       Cpresentacion cp = CpresentacionCRUD.BuscarPresentacion(u.getId_presentacion());
                    %>
                    <tr>
                        <td> <%=u.getId_producto() %> </td>
                        <td> <%=u.getNom_producto() %> </td>
                        <td> <%=cs.getNom_sabor() %> </td>
                         <td> <%=cc.getValor_cantidad()+" "+cc.getUnidad_cantidad() %> </td>
                          <td> <%=ct.getNombre_tamano()%> </td>
                           <td> <%=cp.getTipo_presentacion()%> </td>
                            <td> <%=u.getPrecio_producto() %> </td>
                             <td> <%=u.getStock_producto() %> </td>
                        <td> <a href="actualizarProducto.jsp?id=<%=u.getId_producto()  %>" >Editar </a> </td>
                        <td> <a href="borrarproducto?id=<%=u.getId_producto() %>" >Borrar</a> </td>
                    </tr>    
                    <%
                    }
                    %>
            </tbody>
        </table>
            </div>
    </body>
</html>