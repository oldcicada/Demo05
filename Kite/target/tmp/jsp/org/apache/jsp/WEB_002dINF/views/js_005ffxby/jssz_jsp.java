package org.apache.jsp.WEB_002dINF.views.js_005ffxby;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jssz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/js_fxby/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/js_fxby/../base.jsp");
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
      out.write("\t\t\t\t\t\t\t\t<span>标题名称： <select class=\"biaoti_select\" name=\"bmmc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">-请选择-</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"法宣办(机关党委)员)委)\">法宣办(机关党委)员)委)</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"社会救助处\">社会救助处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"基层政权处\">基层政权处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"优抚处(双拥办)\">优抚处(双拥办)</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"民间组织管理处\">民间组织管理处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"老龄办\">老龄办</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"救灾救济处\">救灾救济处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"民生办\">民生办</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"区划地名处\">区划地名处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"安置处\">安置处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"办公室\">办公室</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"社会事务处\">社会事务处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"社会福利和慈善促进处\">社会福利和慈善促进处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"督查办\">督查办</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"计划财务处\">计划财务处</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"政治部\">政治部</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"行政服务中心民政窗口\">行政服务中心民政窗口</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"项目基建办\">项目基建办</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"工会\">工会</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"监察室\">监察室</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"局财务核算中心\">局财务核算中心</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> <input type=\"submit\" value=\"  查询 \" class=\"in_sub\" id=\"query\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"reset\" value=\"  取消  \" class=\"in_sub\" id=\"reset\">\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"table_check\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>单位名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>基数</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>维护时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"images/pageList/fxb/jssz.js\"></script>\r\n");
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
