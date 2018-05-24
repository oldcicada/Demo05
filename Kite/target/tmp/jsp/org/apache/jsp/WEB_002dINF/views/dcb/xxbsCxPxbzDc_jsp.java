package org.apache.jsp.WEB_002dINF.views.dcb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xxbsCxPxbzDc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar bsdw=$(\"select[name=bsdw]\").val(\"\");\r\n");
      out.write("\tvar startDate=$(\"input[name=startDate]\").val(\"\");\r\n");
      out.write("\tvar endDate=$(\"input[name=endDate]\").val(\"\");\r\n");
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
      out.write("\tvar bsdw=$(\"select[name=bsdw]\").val();\r\n");
      out.write("\tvar startDate=$(\"input[name=startDate]\").val();\r\n");
      out.write("\tvar endDate=$(\"input[name=endDate]\").val();\r\n");
      out.write("\t\r\n");
      out.write("\t$.post(\"user/xxbsCxPxbzDc\",\r\n");
      out.write("\t\t\t{\"pageIndex\":pageIndex,\"pageSize\":pageSize,\r\n");
      out.write("\t\t\"bsdw\":bsdw,\r\n");
      out.write("\t\t\"startDate\":startDate,\r\n");
      out.write("\t\t\"endDate\":endDate},\r\n");
      out.write("\t\t\tfunction(data,status){\r\n");
      out.write("\t\t\t\t//字符串转成json对象\r\n");
      out.write("\t\t\t\tvar list=data.list;\r\n");
      out.write("\t\t\t\tif(status){\r\n");
      out.write("\t\t\t\t\t$(\"#content\").empty();\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<list.length;i++){\r\n");
      out.write("\t\t\t\t\t\tif(list[i].zcbs==0){\r\n");
      out.write("\t\t\t\t\t\t\tvar content=\"<tr><td><input type='checkbox' class='table_check'></td><td>\"+(i+1)\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].bsdw\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].hjmc\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].bzsj\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\" +list[i].bjdwmc\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\" +list[i].zpjf\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\" +list[i].bssj\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td class='text-center'><a href='user/xxbsBsPxbzJg?id=\"+list[i].id+\"'>报送</a> \"\r\n");
      out.write("\t\t\t\t\t\t\t+\"<a href='user/xxbsXqPxbzDc?id=\"+list[i].id+\"'>查看</a> \"\r\n");
      out.write("\t\t\t\t\t\t\t+\"<a href='javascript:(void);'onclick='deletePxbz(\"+list[i].id+\")'>删除</a> \"\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#content\").append(content);\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tvar content=\"<tr><td><input type='checkbox' class='table_check'></td><td>\"+(i+1)\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].bsdw\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].hjmc\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\"+list[i].bzsj\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\" +list[i].bjdwmc\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\" +list[i].zpjf\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td>\" +list[i].bssj\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td><td class='text-center'><a href='user/xxbsXqPxbzDc?id=\"+list[i].id+\"'>查看</a> \"\r\n");
      out.write("\t\t\t\t\t\t\t+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#content\").append(content);\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
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
      out.write("\t\t\t\t\t\t<span class=\"left_ten\">查询条件</span>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:(void);\" target=\"frame\"><input type=\"submit\" value=\"信息查询\" ></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"user/xxbsBsPxbzJg\" target=\"frame\"><input type=\"submit\" value=\"信息报送\"></a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sbaz_table\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t <span> 报送单位 <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"biaoti_select\" id=\"bsdw\" name=\"bsdw\" style=\"width: 150px; height: 30px\">\r\n");
      out.write("          <option value=\"社会救助处\">社会救助处</option>\r\n");
      out.write("          <option value=\"政权处于民管处\">政权处于民管处</option>\r\n");
      out.write("          <option value=\"法宣办\">法宣办</option>\r\n");
      out.write("          <option value=\"区划地名处\">区划地名处</option>\r\n");
      out.write("          <option value=\"办公室\">办公室</option>\r\n");
      out.write("          <option value=\"安置处\">安置处</option>\r\n");
      out.write("          <option value=\"双拥办（优抚处）\">双拥办（优抚处）</option>\r\n");
      out.write("          <option value=\"救灾救济处\">救灾救济处</option>\r\n");
      out.write("          <option value=\"社会事务处\">社会事务处</option>\r\n");
      out.write("          <option value=\"计财与核算中心\">计财与核算中心</option>\r\n");
      out.write("          <option value=\"民生办\">民生办</option>\r\n");
      out.write("          <option value=\"福慈处\">福慈处</option>\r\n");
      out.write("          <option value=\"项目办\">项目办</option>\r\n");
      out.write("          <option value=\"老龄办\">老龄办</option>\r\n");
      out.write("          <option value=\"市军休一所\">市军休一所</option>\r\n");
      out.write("          <option value=\"市军休二所\">市军休二所</option>\r\n");
      out.write("          <option value=\"市军休三所\">市军休三所</option>\r\n");
      out.write("          <option value=\"市军休四所\">市军休四所</option>\r\n");
      out.write("          <option value=\"市军休五所\">市军休五所</option>\r\n");
      out.write("          <option value=\"市军休六所\">市军休六所</option>\r\n");
      out.write("          <option value=\"市军休干部保健办\">市军休干部保健办</option>\r\n");
      out.write("          <option value=\"市巢湖军供与军休\">市巢湖军供与军休</option>\r\n");
      out.write("          <option value=\"市军供站\">市军供站</option>\r\n");
      out.write("          <option value=\"市救助管理站\">市救助管理站</option>\r\n");
      out.write("          <option value=\"市福彩中心\">市福彩中心</option>\r\n");
      out.write("          <option value=\"市巢湖福彩中心\">市巢湖福彩中心</option>\r\n");
      out.write("          <option value=\"市小蜀山陵园\">市小蜀山陵园</option>\r\n");
      out.write("          <option value=\"市殡葬管理处\">市殡葬管理处</option>\r\n");
      out.write("          <option value=\"市福利中心\">市福利中心</option>\r\n");
      out.write("          <option value=\"合肥市蜀山烈士陵园\">合肥市蜀山烈士陵园</option>\r\n");
      out.write("        </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span> 报送时间： <input type=\"date\" name=\"startDate\" id=\"startDate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> <span> 至： <input type=\"date\" name=\"endDate\" id=\"endDate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"  查询  \" id=\"query\" class=\"in_sub\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"reset\" value=\"  重置  \" id=\"reset\" class=\"in_sub\">\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>报送单位</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>获奖名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>表彰时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>颁奖单位名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>自评加分</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>报送时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody  id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"t_fanye\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"upten\"></span> <span class=\"up\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <span class=\"split\"></span> <span class=\"page_info_one\">第 1 / 1 页</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <span class=\"split\"></span> <span class=\"dowm\"></span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <span class=\"downten\"></span> <span class=\"page_info_two\">页记录数15</span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <span class=\"page_info_three\">当前1-1条记录，共1条记录</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction deletePxbz(id){\r\n");
      out.write("\t\tvar i = confirm(\"确认删除该条数据吗？\")\r\n");
      out.write("\t\tif(i){\r\n");
      out.write("\t\t\t$.post(\"user/deletePxbzDc\",\r\n");
      out.write("\t\t\t\t\t{\"id\":id},\r\n");
      out.write("\t\t\t\t\tfunction(data,status){\r\n");
      out.write("\t\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\t\twindow.location.href = 'user/xxbsCxPxbzDc';\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
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
