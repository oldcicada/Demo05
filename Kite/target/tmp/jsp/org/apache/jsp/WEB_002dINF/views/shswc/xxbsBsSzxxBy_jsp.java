package org.apache.jsp.WEB_002dINF.views.shswc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsBsSzxxBy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t\t    <span>信息报送 </span>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"user/xxbsBsSzxxBy\"><input type=\"submit\" value=\"信息报送\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"user/xxbsCxSzxxBy\"><input type=\"submit\" value=\"信息查询\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_rub_table sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"user/xxbsZcSzxxBy\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"tj_table\" style=\"border: 0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">逝者基本信息<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>身份证号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.szsfzhm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" name=\"szsfzhm\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.szxm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,10}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" name=\"szxm\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>户籍地</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.szhjd }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,30}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\" name=\"szhjd\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>死亡原因</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.szswyy }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"szswyyValue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"biaoti_select\" style=\"width: 150px; height: 30px\" name=\"szswyy\" id=\"szswyy\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>遗体入馆日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- 具体到小时 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.ytrgrq }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"ytrgrq\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>火化日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- 具体到小时 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.szhhrq }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"szhhrq\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>重点救助对象</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.zdjzdx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"zdjzdxValue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"biaoti_select\" name=\"zdjzdx\" id=\"zdjzdx\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>是否选择江葬</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.sfxzjz }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"sfxzjzValue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"biaoti_select\" name=\"sfxzjz\" id=\"sfxzjz\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t合肥市殡葬基本公共服务惠民工程六项免费清单（单位：元）\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>普通车辆遗体接运费</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>普通火化炉火化费</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>骨灰存放费用</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>殡仪馆内遗体冷藏费用</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>普通骨灰盒</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>普通告别厅费用</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"ptclytjyf\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.ptclytjyf }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9_]{1,5}$\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- 5位纯数字组合，如果打到四位数，以千分位展示；如果没有使用该项，则填写0； -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"pthhlhhf\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.pthhlhhf }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9_]{1,5}$\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"ghcffy\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.ghcffy }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9_]{1,5}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"bygnytlcfy\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.bygnytlcfy }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9_]{1,5}$\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"ptghh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.ptghh }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9_]{1,5}$\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"ptgbtfy\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.pthhlhhf }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9_]{1,5}$\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t经办人信息\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>身份证号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"jbrsfzhm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.jbrsfzhm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"jbrxm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.jbrxm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[\\u4E00-\\u9FA5A-Za-z0-9_]{1,10}$\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trequired=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>联系电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"jbrlxdh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${szxx.jbrlxdh }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tpattern=\"^[0-9]{11}$\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>证明材料</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"逝者身份证\" class=\"in_sub\"> 逝者身份证\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"逝者户口簿\" class=\"in_sub\"> 逝者户口簿\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" value=\"死亡证明\" class=\"in_sub\"> 死亡证明\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  暂存  \" class=\"in_sub\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  重置   \" class=\"in_sub\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  报送  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"images/pageList/shswc/xxbsBsSzxxBy.js\"></script>\r\n");
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
