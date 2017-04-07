<%@taglib uri="/struts-tags" prefix="s"%>

<html>
  <body>
    <s:form action="checkThat" method ="GET">
      <s:textfield name="username" label="Username"/>
      <s:submit label = "Anything" />
    </s:form>
  </body>
</html>
