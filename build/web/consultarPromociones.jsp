<%-- 
    Document   : consultarProductos
    Created on : 8/06/2021, 02:46:05 PM
    Author     : Danielao.0
--%>

<%@page import="Model.Cdescuento"%>
<%@page import="Model.CdescuentoCRUD"%>
<%@page import="Model.Promocion"%>
<%@page import="Model.PromocionCRUD"%>
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
        <title>Promociones|| Consulta</title>
    </head>
    <body>
        <h1>Tabla de Promociones</h1>
        <br>
        <div class="container">
        <table border="2" >
            <thead>
                <tr>
                    <th>ID</th>
                     <th>Nombre</th>
                    <th>Descuento</th>
                </tr>        
            </thead>
            <tbody>
                <%
                    List<Promocion> lista = PromocionCRUD.ConsultarPromociones();
                    for(Promocion u : lista){
                       Cdescuento cp = CdescuentoCRUD.BuscarDescuento(u.getIddescuento());
                    %>
                    <tr>
                        <td> <%=u.getIdpromocion() %> </td>
                        <td> <%=u.getNom_promocion() %> </td>
                        <td> <%=cp.getValor()+"%"%> </td>
                        <td> <a href="borrarpromocion?id=<%=u.getIdpromocion()%>" >Borrar</a> </td>
                    </tr>    
                    <%
                    }
                    %>
            </tbody>
        </table>
            </div>
    </body>
</html>