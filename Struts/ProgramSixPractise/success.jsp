<%@taglib uri="/struts-tags" prefix="s"%>

<html>
  <body>
    <%
      String a =(String)request.getAttribute("1");
      String b =(String)session.getAttribute("2");
      String c =(String)application.getAttribute("3");

      out.println(a);
      out.println("<br/>");
      out.println("<br/>");
      out.println(b);
      out.println("<br/>");
      out.println("<br/>");
      out.println(c);
      out.println("<br/>");
      out.println("<br/>");
    %>
    <s:property value ="message"/>
  </body>
</html>
