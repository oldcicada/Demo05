package org.apache.jsp.WEB_002dINF.views.azc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsCxBdxxAz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/azc/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/azc/../base.jsp");
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
      out.write("#table {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("#text{\r\n");
      out.write("width:150px;\r\n");
      out.write("height:30px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"skin-blue\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"yjgl\">\r\n");
      out.write("\t\t\t\t<div class=\"ssjc_right_up\">\r\n");
      out.write("\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"left_ten\">查询条件</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t<p><span> 士兵姓名\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,4}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> 士兵身份证号码\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9]{18}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t <span> 学校名称  <select class=\"biaoti_select\"\r\n");
      out.write("\t\t\t\t\t\t\t\t style=\"width: 150px; height: 30px\">\r\n");
      out.write("          <option value=\"\"></option>\r\n");
      out.write("        </select></span><br/>\r\n");
      out.write("        <span> 报送单位  <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"biaoti_select\" style=\"width: 150px; height: 30px\">\r\n");
      out.write("          <option value=\"\">长丰县民政局</option>\r\n");
      out.write("        </select></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span> 报送时间： <input type=\"date\" id=\"date_time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> <span> 至： <input type=\"date\" id=\"date_time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"submit\" value=\"  查询  \" class=\"in_sub\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"reset\" value=\"  重置  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_bottom\" id=\"table\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>查询结果</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_rub_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"tj_table sbaz_table\" style=\"border: 0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>报送单位</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>士兵姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>身份证号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>报到时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>学校名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>专业</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>庐阳区民政局</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>XXX</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>XXX</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>安徽大学</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>通讯</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2014-5-10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"\">查看</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"t_fanye\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"upten\"></span> <span class=\"up\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"split\"></span> <span class=\"page_info_one\">第 1 /\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t1 页</span> <span class=\"split\"></span> <span class=\"dowm\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"downten\"></span> <span class=\"page_info_two\">页记录数\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t15</span> <span class=\"page_info_three\">当前1-1条记录，共1条记录</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
