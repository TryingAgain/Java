<%@taglib uri="/struts-tags" prefix="s" %>

<html>
  <body>
    <%
    String name =(String) request.getAttribute("name");
    String name1 =(String) session.getAttribute("name1");
    String name2 =(String) application.getAttribute("name2");

    out.println(name);
    out.println("<br/>");
    out.println("<br/>");
    out.println(name1);
    out.println("<br/>");
    out.println("<br/>");
    out.println(name2);
    out.println("<br/>");
    out.println("<br/>");
    %>
    <h1><s:property value ="message"/></h1>
  </body>
</html>
