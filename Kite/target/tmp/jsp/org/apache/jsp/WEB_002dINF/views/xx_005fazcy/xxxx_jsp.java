package org.apache.jsp.WEB_002dINF.views.xx_005fazcy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxxx_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/xx_azcy/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/xx_azcy/../base.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"background-color: #000\">\r\n");
      out.write("<head>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    \r\n");

String baseUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()
				+request.getContextPath()+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<base href=\"");
      out.print(baseUrl );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\"\r\n");
      out.write("\tname=\"viewport\">\r\n");
      out.write("<script src=\"images/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/dist/css/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/dist/css/AdminLTE.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/dist/css/skins/_all-skins.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/vince/css/vince.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/vince/biao/css/font-awesome.min.css\">");
      out.write("\r\n");
      out.write("<script src=\"images/pageList/xxxx/xxxx.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"skin-blue\" style=\"height: 100% !important;\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"yjgl\">\r\n");
      out.write("\t\t\t\t<div class=\"ssjc_right_up\">\r\n");
      out.write("\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"left_ten\"> 查询条件 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t    <span class=\"tiaoshijian\"> 学校名称：\r\n");
      out.write("                                    <input type=\"text\" id=\"pzmc\" style=\"width: 200px;\">\r\n");
      out.write("                                 </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"query\" value=\"  查询 \" class=\"in_sub\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"add\" value=\"  新增  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>查询结果</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_rub_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"tj_table\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>学号名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>状态</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"content\"></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"t_fanye\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"upten\"></span> <span class=\"up\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"split\"></span> <span class=\"page_info_one\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"split\"></span> <span class=\"dowm\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"downten\"></span> <span class=\"page_info_two\"> 15</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"page_info_three\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>");
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
