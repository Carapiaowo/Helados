package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregar_005fadm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("        <title>agregar Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div>\n");
      out.write("                <h2 class=\"center-text\">Agregar administrador</h2>\n");
      out.write("            </div>\n");
      out.write("            <form class=\"row g-3\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <label for=\"inputEmail4\" class=\"form-label\">Usuario</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <label for=\"inputPassword4\" class=\"form-label\">Correo</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"\" placeholder=\"example@example.com\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <label for=\"inputAddress\" class=\"form-label\">Contraseña</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <label for=\"inputAddress2\" class=\"form-label\">Confirma tu contraseña</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-grid mt-4 mb-4\">    \n");
      out.write("                    <input type=\"submit\" name=\"accionexp\" value=\"Agregar\" class=\"btn btn-success\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
