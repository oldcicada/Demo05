package org.apache.jsp.WEB_002dINF.views.fcc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsWhSqylFc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/fcc/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/fcc/../base.jsp");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write(".nei span {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#text {\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"skin-blue\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"yjgl\">\r\n");
      out.write("\t\t\t\t<div class=\"ssjc_right_up\">\r\n");
      out.write("\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>合肥市养老服务设施管理</span> <a href=\"\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"养老服务设施维护\"> </a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"views/fcc_xxbs_cx_yljg_qx/xxbsCxSqylFc\"><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" value=\"信息查询\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_rub_table sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"tj_table\" style=\"border: 0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">基本信息</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"mc\" type=\"text\" id=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,30}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>联系人</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"lxr\" type=\"text\" id=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,20}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>联系电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"lxdh\" type=\"text\" id=\"text\" pattern=\"^[0-9]{11}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>地址</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"dz\" id=\"dz\" class=\"biaoti_select\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>建筑面积</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"jzmj\" type=\"text\" id=\"text\" pattern=\"^[0-9]{7}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>主要功能</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"zygn\" type=\"text\" id=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{40}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>辖区基本情况</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"xqjbqk\" type=\"text\" id=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{80}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>开放时间安排</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"kfsjap\" type=\"text\" style=\"width: 400px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{80}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"save\" type=\"submit\" value=\"  保存  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  取消  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"images/pageList/fcc/xxbsWhSqylssFc.js\"></script>\r\n");
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
