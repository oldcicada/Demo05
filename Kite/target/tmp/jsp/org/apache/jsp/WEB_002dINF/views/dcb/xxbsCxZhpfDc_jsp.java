package org.apache.jsp.WEB_002dINF.views.dcb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsCxZhpfDc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/dcb/../commont.jsp");
    _jspx_dependants.add("/WEB-INF/views/dcb/../base.jsp");
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
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var pageIndex=1;\r\n");
      out.write("var pageSize=8;\r\n");
      out.write("var pageTotal;\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\tqueryPage();\r\n");
      out.write("\t$(\".t_fanye > span\").click(otherOperate);\r\n");
      out.write("\t$(\"#query\").click(query);\r\n");
      out.write("\t$(\"#reset\").click(reset);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function query(){\r\n");
      out.write("\tqueryPage();\r\n");
      out.write("}\r\n");
      out.write("function reset(){\r\n");
      out.write("\tvar csfl=$(\"select[name=csfl]\").val(\"\");\r\n");
      out.write("\tvar year=$(\"select[name=year]\").val(\"\");\r\n");
      out.write("\tqueryPage();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function otherOperate(){\r\n");
      out.write("\tvar operate=$(this).attr(\"class\");\r\n");
      out.write("\tif(operate == \"upten\"){\r\n");
      out.write("\t\tpageIndex=1;\r\n");
      out.write("\t\tqueryPage();\r\n");
      out.write("\t}else if(operate == \"up\"){\r\n");
      out.write("\t\tif(pageIndex ==1){\r\n");
      out.write("\t\t\talert(\"已经是第一页\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpageIndex--;\r\n");
      out.write("\t\t\tqueryPage();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else if(operate == \"down\"){\r\n");
      out.write("\t\tif(pageIndex ==pageTotal){\r\n");
      out.write("\t\t\talert(\"已经是最后一页\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpageIndex++;\r\n");
      out.write("\t\t\tqueryPage();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(operate == \"downten\"){\r\n");
      out.write("\t\tpageIndex=pageTotal;\r\n");
      out.write("\t\tqueryPage();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function queryPage(){\r\n");
      out.write("\tvar csfl=$(\"select[name=csfl]\").val();\r\n");
      out.write("\tvar year=$(\"select[name=year]\").val();\r\n");
      out.write("\t\r\n");
      out.write("\t$.post(\"user/xxbsCxZhpfDc\",\r\n");
      out.write("\t\t\t{\"pageIndex\":pageIndex,\"pageSize\":pageSize,\r\n");
      out.write("\t\t\"csfl\":csfl,\r\n");
      out.write("\t\t\"year\":year},\r\n");
      out.write("\t\t\tfunction(data,status){\r\n");
      out.write("\t\t\t\t//字符串转成json对象\r\n");
      out.write("\t\t\t\tvar list=data.list;\r\n");
      out.write("\t\t\t\tif(status){\r\n");
      out.write("\t\t\t\t\t$(\"#content\").empty();\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<list.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tvar content=\"<tr><td><input type='checkbox' class='table_check'></td><td>\"+(i+1)\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].csfl\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].year\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].bt\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td><a href='user/xxbsXqZhpfDc?id=\"+list[i].id+\"&bt=\"+list[i].bt+\"'>详情</a> \"\r\n");
      out.write("\t\t\t\t\t\t\t+\"<a href='javascript:(void);'onclick='deleteZhpf(\"+list[i].id+\")'>删除</a> \"\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#content\").append(content);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(data.list.length == 0){\r\n");
      out.write("\t\t\t\t\t$(\"#pageControl\").css('display','none');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\tpageTotal=data.pageTotal;\r\n");
      out.write("\t\tcount=data.count;\r\n");
      out.write("\t\tvar nowPage=(pageIndex-1)*pageSize+1;\r\n");
      out.write("\t\t$('.page_info_one').text(\"第\"+pageIndex+\"/\"+pageTotal+\"页\");\r\n");
      out.write("\t\t$('.page_info_two').text(\"页记录数\"+pageTotal);\r\n");
      out.write("\t\t$('.page_info_three').text(\"共\"+count+\"条记录\");\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body class=\"skin-blue\">\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"yjgl\">\r\n");
      out.write("\t\t\t\t<div class=\"ssjc_right_up\">\r\n");
      out.write("\t\t\t\t\t<div class=\"nei\">\r\n");
      out.write("\t\t\t\t\t<div class=\"ssjc_ru_title\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"left_ten\">督查评比情况 </span>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\"><input type=\"submit\" value=\"新增评分\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><input type=\"submit\" value=\"评分查询\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t <span> 处室类型 <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"biaoti_select\" id=\"csfl\" name=\"csfl\" style=\"width: 150px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"机关处室\">机关处室</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"军休军供系统\">军休军供系统</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"局属其他单位\">局属其他单位</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t <span> 年度 <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"biaoti_select\" id=\"year\" name=\"year\" style=\"width: 150px; height: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2014\">2014</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2015\">2015</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2016\">2016</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> <input type=\"submit\" id=\"query\" value=\"  查询  \" class=\"in_sub\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"reset\" id=\"reset\" value=\"  重置  \" class=\"in_sub\">\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type='checkbox' class='table_check'></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>处室分类</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>年度</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>标题</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
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
      out.write("\t\t\t\t\t\t\t\t<div class=\"sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  保存  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"  取消  \" class=\"in_sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
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
