package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/views/base.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>合肥市民政业务管理平台</title>\n");
      out.write("\r\n");
      out.write("    \r\n");

String baseUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()
				+request.getContextPath()+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<base href=\"");
      out.print(baseUrl );
      out.write("\">\r\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"images/vince/rain/css/normalize.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"images/vince/rain/css/default.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"images/vince/css/vince.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"images/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<script src=\"images/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"images/bootstrap/css/input.js\"></script>\n");
      out.write("<style media=\"screen\">\n");
      out.write("body {\n");
      out.write("\toverflow: hidden;\n");
      out.write("\theight: 100%;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"images/vince/rain/js/rainyday.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\tfunction run() {\n");
      out.write("\t\tvar image = document.getElementById('background');\n");
      out.write("\t\timage.onload = function() {\n");
      out.write("\t\t\tvar engine = new RainyDay({\n");
      out.write("\t\t\t\timage : this\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tengine.rain([ [ 1, 2, 8000 ] ]);\n");
      out.write("\t\t\tengine.rain([ [ 3, 3, 0.88 ], [ 5, 5, 0.9 ], [ 6, 2, 1 ] ], 100);\n");
      out.write("\t\t};\n");
      out.write("\t\timage.crossOrigin = 'anonymous';\n");
      out.write("\t\timage.src = \"images/vince/rain/css/1.jpg\";\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body onLoad=\"run();\">\n");
      out.write("\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t\t<div class=\"loginform\">\n");
      out.write("\t\t\t<form action=\"login\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"form-group  has-feedback\" id=\"form-group1\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"name\"\n");
      out.write("\t\t\t\t\t\taria-describedby=\"inputSuccess2Status\" onblur=\"inputAction1()\" name=\"name\"> \n");
      out.write("\t\t\t\t\t\t<span id=\"iconInput1\" class=\"glyphicon form-control-feedback\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group  has-feedback\" id=\"form-group2\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\"\n");
      out.write("\t\t\t\t\t\taria-describedby=\"inputSuccess2Status\" onblur=\"inputAction2()\" name=\"password\"> \n");
      out.write("\t\t\t\t\t\t<span id=\"iconInput2\" class=\"glyphicon form-control-feedback\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"login_botton\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"登录\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<img id=\"background\" alt=\"background\" src=\"images/vince/rain/css/1.jpg\" />\n");
      out.write("\t<script>\n");
      out.write("\t\tpingHeight = document.documentElement.clientHeight;\n");
      out.write("\t\tpingWidth = document.documentElement.clientWidth;\n");
      out.write("\t\t$(\"body\").css({\n");
      out.write("\t\t\t\"height\" : pingHeight\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
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
