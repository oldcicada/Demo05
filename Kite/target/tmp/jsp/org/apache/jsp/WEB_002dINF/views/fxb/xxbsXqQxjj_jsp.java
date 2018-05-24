package org.apache.jsp.WEB_002dINF.views.fxb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsXqQxjj_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t    <span class=\"left_ten\">当前位置：首页->信息详情 </span> \r\n");
      out.write("\t\t\t\t\t    <a href=\"\" target=\"frame\"><input type=\"submit\" value=\"信息查询\" ></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\" target=\"frame\"><input type=\"submit\" value=\"信息审核\"></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\" target=\"frame\"><input type=\"submit\" value=\"报表统计\" ></a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_right_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ssjc_rub_table sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"tj_table\" style=\"border: 0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>信息标题</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.xxbt }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"xxbt\" id=\"xxbt\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>上报单位</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.sbdw }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"sbdw\" id=\"sbdw\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>正文</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea rows=\"5\" cols=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.sbdw }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"xxzw\" id=\"xxzw\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.xxzw }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>附件</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MzywFjxx.fjmc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>分管领导</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"fgld\" id=\"fgld\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MzywFxb.fgld }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>上报人员</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"sbry\" id=\"sbry\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MzywFxb.sbry }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>作者</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"zz\" id=\"zz\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MzywFxb.zz }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>栏目</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"lm\" id=\"lm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.lm }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>稿酬</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"gc\" id=\"gc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.gc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>采用情况</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"cyqk\" id=\"cyqk\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.cyqk }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>期数</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"qs\" id=\"qs\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.qs }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>见报日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 200px;\" name=\"jbrq\" id=\"jbrq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.jbrq }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" style=\"width: 200px;\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mzywFxb.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <input type=\"button\" value=\"  审核  \" class=\"in_sub bt\" id=\"submit\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  取消 \" class=\"in_sub\" id=\"reset\">\r\n");
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
      out.write("\t<script src=\"images/pageList/fxb/fxbsh.js\"></script>\r\n");
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
