package org.apache.jsp.WEB_002dINF.views.tzgg;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/views/tzgg/../base.jsp");
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
      out.write("<html>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=10\">\r\n");
      out.write("<title>合肥市民政业务管理平台</title>\r\n");
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
      out.write("<meta\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\"\r\n");
      out.write("\tname=\"viewport\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/dist/css/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/dist/css/AdminLTE.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/dist/css/skins/_all-skins.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/vince/css/vince.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"images/vince/biao/css/font-awesome.min.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function startTime()\r\n");
      out.write("{\r\n");
      out.write("\tvar today=new Date();\r\n");
      out.write("\tvar y=today.getFullYear();\r\n");
      out.write("\tvar M=today.getMonth()+1;\r\n");
      out.write("\tvar d=today.getDate();\r\n");
      out.write("\tvar h=today.getHours();\r\n");
      out.write("\tvar m=today.getMinutes();\r\n");
      out.write("\tvar s=today.getSeconds();\r\n");
      out.write("\tm=checkTime(m);\r\n");
      out.write("\ts=checkTime(s);\r\n");
      out.write("\tdocument.getElementById(\"nowTime\").innerHTML=y+\"-\"+M+\"-\"+d+\"  \"+h+\":\"+m+\":\"+s;\r\n");
      out.write("\tt=setTimeout('startTime()',500);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkTime(i)\r\n");
      out.write("{\r\n");
      out.write("if (i<10) \r\n");
      out.write("  {i=\"0\" + i}\r\n");
      out.write("  return i\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\"  onload=\"startTime()\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<header class=\"main-header\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"logo\"> <span class=\"logo-mini\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"images/vince/images/v01.png\">\r\n");
      out.write("\t\t\t</span> <span class=\"logo-lg\"><img src=\"images/vince/images/v01.png\"></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-static-top\" style=\"position:relative;\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\"></a> \r\n");
      out.write("\t\t\t\t<div class=\"all_title\" style=\"width: 300px; height:50px;display:inline-block;float: left;\">合肥市民政业务管理系统</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin-left: 150px;display: inline-block;float: left; \"><iframe allowtransparency=\"true\" frameborder=\"0\" width=\"575\" height=\"77\" scrolling=\"no\" \r\n");
      out.write("\t\t\t\tsrc=\"//tianqi.2345.com/plugin/widget/index.htm?s=2&z=1&t=0&v=0&d=5&bd=0&k=000000&f=&ltf=009944&htf=cc0000&q=1&e=1&a=1&c=58321&w=575&h=77&align=center\"></iframe>\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t<div class=\"navbar-custom-menu\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown user user-menu\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/dist/img/user2-160x160.jpg\" class=\"user-image\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"User Image\"> <span class=\"hidden-xs\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.power }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"user-header\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images/dist/img/user2-160x160.jpg\" class=\"img-circle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"User Image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t姓名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <small>部门：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.department }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"user-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"user/cancel\" class=\"btn btn-default btn-flat\">退出系统</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<aside class=\"main-sidebar\">\r\n");
      out.write("\t\t\t<section class=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"user-panel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pull-left image\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/dist/img/user2-160x160.jpg\" class=\"img-circle\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"User Image\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pull-left info\">\r\n");
      out.write("\t\t\t\t\t\t<p>当前用户：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.power }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"menu_time\">\r\n");
      out.write("\t\t\t\t\t\t\tTIME:<span id=\"nowTime\"></span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t\t\t<li class=\"header\">菜单 MENU</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t    <a href=\"user/tzggCx\" target=\"frame\"> <i class=\"fa fa-home\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-size: 22px\"></i> <span>通知公告管理</span>\r\n");
      out.write("\t\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t\t    <a> <i class=\"fa fa-commenting-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>通知送报</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxFxby\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t信息报送 (法宣办)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxSzxxSh\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t逝者信息查询(社会事务处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxSzxxBy\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t逝者信息查询(殡仪馆用户)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxGhjzSh\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t骨灰江葬报送 (社会事务处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxYtwySh\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t遗体外运报送 (社会事务处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"user/xxbsCxMzxxSh\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t墓葬信息报送 (社会事务处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxBdxxAz\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t信息报送 (安置处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxPxbzDc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t评先表彰加分报送 (督查办)</a></li>\r\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"user/xxbsCxXcbdDc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t宣传报道加分报送 (督查办)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxBn\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t信息报送 (不能办)</a></li>\r\n");
      out.write("\t\t\t\t\t\t    <li><a href=\"user/xxbsCxYljgFc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t养老机构信息报送 (福慈处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxSqylFc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t养老服务设施信息报送 (福慈处)</a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t\t    <a href=\"#\"> <i class=\"fa fa-bar-chart\"></i>\r\n");
      out.write("\t\t\t\t\t        <span>统计报表 (法宣办)</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t    </span>\r\n");
      out.write("\t\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/gftj\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t稿费统计表</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/gfcy\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t稿费采用明细统计报表</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/jgcs\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t机关处室年度投稿统计表</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t\t    <a href=\"#\"> <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t        <span>数据维护</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t    </span>\r\n");
      out.write("\t\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsCxZhpfDc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t综合评分维护 (督查办)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsWhYljgFc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t养老机构维护 (福慈处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxbsWhSqylFc\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t养老服务设施维护 (福慈处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("\t\t\t\t\t    <a href=\"#\"> <i class=\"fa fa-gears\"></i>\r\n");
      out.write("\t\t\t\t\t        <span>参数配置</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t    </span>\r\n");
      out.write("\t\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/jssz\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t基数设置 (法宣办)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/xxxx\" target=\"frame\"><i class=\"fa fa-bookmark\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t学校和专业配置 (安置处)</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t<div class=\"content-wrapper\">\r\n");
      out.write("\t\t\t<section class=\"content-header\">\r\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> 首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\">系统管理</li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<div class=\"content qqq\">\r\n");
      out.write("\t\t\t\t<iframe width=\"100%\" name=\"frame\" height=\"100%\" frameborder=0  src=\"user/tzggCx\"></iframe>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer class=\"main-footer\">\r\n");
      out.write("\t\t\t<strong>Copyright 科大讯飞有限公司 &copy; 2014-2018</strong>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"images/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("\t<script src=\"images/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"images/dist/js/app.min.js\"></script>\r\n");
      out.write("\t<script src=\"images/dist/js/demo.js\"></script>\r\n");
      out.write("\t<script src=\"images/vince/js/nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"images/vince/js/demo.js\"></script>\r\n");
      out.write("\t<div id=\"sss\" style=\"display: none; height: 200px; width: 200px;\"></div>\r\n");
      out.write("\t<script src=\"images/vince/js/echarts.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
