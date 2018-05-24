package org.apache.jsp.WEB_002dINF.views.fxb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsCxFxby_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/fxb/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/fxb/../base.jsp");
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
      out.write("</head>\r\n");
      out.write("<body class=\"skin-blue\"  style=\"height: 100% !important;\">\r\n");
      out.write("\t<div class=\"wrapper\" >\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"yjgl\">\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_up\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"left_ten\"> 查询条件 </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"user/xxbsCxFxby\" target=\"frame\"><input type=\"submit\" value=\"信息查询\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" target=\"frame\"><input type=\"submit\" value=\"信息审核\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" target=\"frame\"><input type=\"submit\" value=\"报表统计\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <span class=\"tiaoshijian\"> 送报时间：\r\n");
      out.write("                                    <input type=\"date\" id=\"date_time\" name=\"startDate\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-calendar fa fa-calendar\" style=\"top:14px;\"></i>\r\n");
      out.write("                                    </span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"tiaoshijian\"> 至：\r\n");
      out.write("                                    <input type=\"date\" id=\"date_time\" name=\"endDate\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-calendar fa fa-calendar\" style=\"top:14px; left: 40px;\"></i>\r\n");
      out.write("                                    </span> \r\n");
      out.write("                   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>标题名称：<input type=\"text\" name=\"xxbt\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>报送单位：\r\n");
      out.write("\t\t\t          \t\t\t\t\t<select  class=\"biaoti_select\" name=\"sbdw\" id=\"sbdw\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <option value=\"\">-请选择-</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("          \t\t\t\t            </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>审核结果：\r\n");
      out.write("\t\t\t          \t\t\t\t\t<select  class=\"biaoti_select\" name=\"shjg\" id=\"shjg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <option value=\"\">-请选择-</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("          \t\t\t\t            </span>\r\n");
      out.write("          \t\t\t\t            <span>提交状态：\r\n");
      out.write("\t\t\t          \t\t\t\t\t<select  class=\"biaoti_select\" name=\"tjzt\" id=\"tjzt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <option value=\"\">-请选择-</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("          \t\t\t\t            </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>栏目名称：\r\n");
      out.write("\t\t\t          \t\t\t\t\t<select  class=\"biaoti_select\" name=\"lmmc\" id=\"lmmc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <option value=\"\">-请选择-</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("          \t\t\t\t            </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  查询  \" class=\"in_sub\" id=\"query\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  重置  \" class=\"in_sub\" id=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ssjc_right_bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>查询结果</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ssjc_rub_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"tj_table\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"table_check\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>报送单位</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>标题</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>报送时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>提交状态</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>审核结果</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>栏目名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>稿酬(元)</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"t_fanye\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"upten\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <span class=\"up\"></span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <span class=\"split\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <span class=\"page_info_one\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <span class=\"split\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <span class=\"dowm\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"downten\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"page_info_two\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span> <span class=\"page_info_three\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"images/pageList/fxb/fxbyh.js\"></script>\r\n");
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
