/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-01-01 14:36:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1672462777918L));
    _jspx_dependants.put("jar:file:/C:/movie/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/movie/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/movie.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class = \"title\">\r\n");
      out.write("	<h1> 영화 수정 </h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class = \"update\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"ms\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("						<!--  Http의 바디부분에 데이터를 여러 부분으로 나누어서 전송함 -->\r\n");
      out.write("						\r\n");
      out.write("	<input type=\"hidden\" name=\"command\" value=\"update\">\r\n");
      out.write("	<input type=\"hidden\" name=\"code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.code }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th>제목</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th>감독</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"director\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.director}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th>배우</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"actor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.actor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th>가격</th>\r\n");
      out.write("		<td><input type=\"number\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th>포스터</th>\r\n");
      out.write("		<td><div style=\"padding-bottom:10px; \">변경 전 <img src=\"upload/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.poster }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("			<div>변경 후 <input type=\"file\" name=\"poster\" onchange=\"readURL(this);\" style=\"padding:0; text-align:center;\">\r\n");
      out.write("				  <img id=\"preview\"/></div>\r\n");
      out.write("		</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th>synopsis</th>\r\n");
      out.write("		<td><textarea rows=\"7\" cols=\"40\" name=\"synopsis\">\r\n");
      out.write("		");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.synopsis}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		</textarea></td>\r\n");
      out.write("		</tr>		\r\n");
      out.write("		\r\n");
      out.write("	</table>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"u_button\">\r\n");
      out.write("		<input type=\"submit\" value=\"수정하기\">\r\n");
      out.write("		<input type=\"button\" onclick=\"location.href='ms?command=view&code=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\" value=\"상세보기\">\r\n");
      out.write("		<input type=\"button\" onclick=\"location.href='ms?command=list'\" value=\"목록보기\">\r\n");
      out.write("	</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	function readURL(input) {\r\n");
      out.write("	  if (input.files && input.files[0]) {\r\n");
      out.write("	    var reader = new FileReader();\r\n");
      out.write("	    reader.onload = function(e) {\r\n");
      out.write("	      document.getElementById('preview').src = e.target.result;\r\n");
      out.write("	    };\r\n");
      out.write("	    reader.readAsDataURL(input.files[0]);\r\n");
      out.write("	  } else {\r\n");
      out.write("	    document.getElementById('preview').src = \"\";\r\n");
      out.write("	  }\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
