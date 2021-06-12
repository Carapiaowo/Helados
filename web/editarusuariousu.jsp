  
<%-- 
    Document   : editarempleado.jsp
    Created on : 14/05/2021, 06:38:30 PM
    Author     : demon
--%>

<%@page import="Model.Usuario"%>
<%@page import="Model.UsuarioCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="CSS/consultas.css">
        <title>Editar perfil</title>
    </head>
    <body>
        <h1>Actualizar Usuario</h1>
        <br>
        <form method="post" name="actualizarperfill" action="actualizarUsuario">
                    <table border="2" >
                        <%
                            HttpSession sesion = request.getSession();
                            Usuario usu = (Usuario)sesion.getAttribute("usuario");
                            int u = UsuarioCRUD.BuscarUsuid(usu.getUser_usu(), usu.getPass_usu());
                            Usuario enc = UsuarioCRUD.BuscarUsuario(u);
                            
                            if(usu == null){
                                request.getRequestDispatcher("error.jsp").forward(request, response);
                            }
                            %>
                        <tr>
                            <td>ID</td>
                            <td><input type="text" name="id2" value="<%=enc.getIdusuario()%>" ></td>
                        </tr>
                        <tr>
                            <td>Nombre:</td>
                            <td><input type="text" name="nom2" size="30" value="<%=enc.getNom_usu()%>"></td>        
                        </tr>
                          <tr>
                            <td>Apellido paterno:</td>
                            <td><input type="text" name="appat2" size="30" value="<%=enc.getAppat_usu() %>"></td>        
                        </tr>
                            <tr>
                            <td>Apellido materno:</td>
                            <td><input type="text" name="apmat2" size="30" value="<%=enc.getApmat_usu() %>"></td>        
                        </tr>
                           <tr>
                            <td>Edad:</td>
                            <td><input type="number" name="edad2" size="30" value="<%=enc.getEdad_usu() %>"></td>        
                        </tr>
                           <tr>
                            <td>Fecha de nacimiento:</td>
                            <td><input type="date" name="fechnac2" value="<%=enc.getFechnac_usu() %>"></td>        
                        </tr>
                        <tr>
                            <td>Password:</td>
                            <td><input type="password" name="pass2" size="30" value="<%=enc.getPass_usu() %>" ></td>        
                        </tr>
                        <tr>
                            <td>Domicilio:</td>
                            <td><input type="text" name="domicilio2" size="50" value="<%=enc.getDomicilio_usu() %>"></td>        
                        </tr>
                        <tr>
                            <td>Teléfono:</td>
                            <td><input type="text" name="tel2" size="10" value="<%=enc.getTel_usu()%>" ></td>        
                        </tr>
                        <tr>
                            <td>Celular:</td>
                            <td><input type="text" name="cel2" size="10" value="<%=enc.getCel_usu()%>" ></td>        
                        </tr>
                        <tr>
                            <td>Nombre de usuario:</td>
                            <td><input type="text" name="user2" size="15" value="<%=enc.getUser_usu()%>" ></td>        
                        </tr>
                        <tr>
                            <td colspan="2" ><input type="submit" 
                                                    value="Actualizar"></td>
                      
                        </tr>        
                    </table>
                </form>
    </body>
</html>