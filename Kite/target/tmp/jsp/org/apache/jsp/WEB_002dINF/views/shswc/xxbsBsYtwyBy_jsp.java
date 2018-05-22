package org.apache.jsp.WEB_002dINF.views.shswc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsBsYtwyBy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/shswc/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/shswc/../base.jsp");
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
      out.write("\t\t\t\t\t\t\t<span class=\"left_ten\">遗体外运信息 </span> <a href=\"user/xxbsCxYtwyBy\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttarget=\"frame\"><input type=\"submit\" value=\"信息查询\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_rub_table sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"user/xxbsZcYtwyBy\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"tj_table\" style=\"border: 0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">逝者基本信息 <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.bygmc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"bygmc\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>身份证号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.szsfzhm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"szsfzhm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.szxm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"szxm\" pattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,10}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>户籍地</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.szhjd }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"szhjd\" pattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,30}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>死亡原因</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.szswyy }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"szswyyValue\"> <select class=\"biaoti_select\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; height: 30px\" name=\"szswyy\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"szswyy\"></select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>遗体运往地</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"szytywd\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.szytywd }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p></p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">申请人信息</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>身份证号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ ytwy.sqrsfzhm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"sqrsfzhm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>申请人姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.sqrxm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"sqrxm\" pattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,10}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>与逝者关系</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.gx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"gxValue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"biaoti_select\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; height: 30px\" name=\"gx\" id=\"gx\"></select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>联系电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.sqrlxdh }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"sqrlxdh\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>遗体承担运输单位名称</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ytwy.ytcdysdwmc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"ytcdysdwmc\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><p></p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>附件信息</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"  运入地殡仪馆或者民政局来函同意接收并监督火化的证明材料\" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t运入地殡仪馆或者民政局来函同意接收并监督火化的证明材料 <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"  申请人书面申请材料  \" class=\"in_sub\"> 申请人书面申请材料<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"  逝者身份证  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t逝者身份证 <input type=\"checkbox\" value=\"  逝者户口簿  \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"in_sub\"> 逝者户口簿 <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"  死亡证明  \" class=\"in_sub\"> 死亡证明\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  暂存  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  取消  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  报送  \" class=\"in_sub\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"images/pageList/shswc/xxbsBsYtwyBy.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$('#submit').click(function() {\r\n");
      out.write("\t\t\t$(\"form\").attr(\"action\", \"user/xxbsBsYtwyBy\");\r\n");
      out.write("\t\t});</script>\r\n");
      out.write("\t\t</body>\r\n");
      out.write("\t");
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
