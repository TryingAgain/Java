<%-- <%@taglib uri="/struts-tags" prefix="s"%> --%>
<html>
  <body>
    <% String name =(String)request.getAttribute("name");
    out.println(name);
    out.println("<br/>");
    %>
  </body>
</html>
