/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-03 16:27:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class T003_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#welcome {\r\n");
      out.write("	padding: 8px;\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logout {\r\n");
      out.write("	padding: 8px;\r\n");
      out.write("	float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#editForm {\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("    background-color: rgb(204, 255, 255);\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#welcome {\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logout {\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#editForm {\r\n");
      out.write("    padding: 20px; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("    padding: 10px; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"],\r\n");
      out.write("select,\r\n");
      out.write("textarea {\r\n");
      out.write("    width: calc(100% - 20px); \r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    margin-bottom: 10px; \r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("    padding: 12px 20px; \r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    background-color: #4CAF50; \r\n");
      out.write("    color: white; \r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("    background-color: #45a049; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:active {\r\n");
      out.write("    background-color: #3e8e41; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:focus {\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: rgb(204, 255, 255);\">\r\n");
      out.write("\r\n");
      out.write("	<div\r\n");
      out.write("		style=\"padding: 10px; color: red; font-size: 25px; font-weight: bold;\">Detail customer</div>\r\n");
      out.write("	<hr width=\"100%\" align=\"center\" color=\"black\" size=\"1\" />\r\n");
      out.write("	<div style=\"padding: 8px;\">Login > Search Customer</div>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div id=\"welcome\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("		<a href=\"#\" id=\"logout\" onclick=\"logOut()\">Log Out</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<hr width=\"100%\" align=\"center\" color=#3366ff size=\"10\" />\r\n");
      out.write("	<center>\r\n");
      out.write("		<form action=\"T003\" method=\"post\" id=\"editForm\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>Customer ID:</td>\r\n");
      out.write("					<td><label for=\"customerID\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>Customer Name:</td>\r\n");
      out.write("					<td><input type=\"text\" id=\"txtCustomerName\"\r\n");
      out.write("						name=\"customerName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>Sex:</td>\r\n");
      out.write("					<td><select id=\"cboSex\" name=\"sex\">\r\n");
      out.write("							<option value=\"\" ></option>\r\n");
      out.write("							<option value=\"M\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sex eq 'M' ? 'selected' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Male</option>\r\n");
      out.write("                        <option value=\"F\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sex eq 'F' ? 'selected' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">Female</option>\r\n");
      out.write("					</select></td>\r\n");
      out.write("\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>Birthday:</td>\r\n");
      out.write("					<td><input type=\"text\" id=\"txtBirthday\" name=\"birthday\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${birthday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>Email:</td>\r\n");
      out.write("					<td><input type=\"text\" id=\"txtEmail\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>Address:</td>\r\n");
      out.write("					<td><textarea id=\"txaAddress\" name=\"address\" rows=\"4\"\r\n");
      out.write("							cols=\"30\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			<button onclick=\"save()\" id=\"btnSave\" class=\"common-button\">Save</button>\r\n");
      out.write("			<input type=\"hidden\" id=\"mode\" name=\"mode\" value=\"\"> \r\n");
      out.write("		<input type=\"submit\" style=\"display: none;\">\r\n");
      out.write("			\r\n");
      out.write("		</form>\r\n");
      out.write("	</center>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function save() {    \r\n");
      out.write("    document.getElementById('mode').value = 'save';\r\n");
      out.write("    document.getElementById('editForm').submit();\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function logOut(){    \r\n");
      out.write("    document.getElementById('mode').value = 'logout';\r\n");
      out.write("    document.getElementById('editForm').submit();\r\n");
      out.write("}\r\n");
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
