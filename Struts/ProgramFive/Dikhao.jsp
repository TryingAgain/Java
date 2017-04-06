<%@taglib uri="/struts-tags" prefix="s"%>

<html>
  <body>
    <% String s = (String)session.getAttribute("Bored");
    out.println(s);%>
    <br/>
    <h1><s:property value="#session.Bored"/></h1>
    <s:property value ="#session['Bored']"/>
    <s:property value="message"/>
  </body>
<html>
