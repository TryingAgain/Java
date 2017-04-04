<%@taglib uri="/struts-tags" prefix="s" %>
<html>
  <body>
    <s:form action="/user/HelloWorld">
      <s:textfield name="userName" label="userName"/>
      <s:submit/>
    </s:form>
  </body>
</html>
