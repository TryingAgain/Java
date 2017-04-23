import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ProgramTwo extends GenericServlet{

  public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<html><body>");

    try{

      String tab = req.getParameter("table");
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345678");
      Statement s = c.createStatement();
      ResultSet rs = s.executeQuery("select * from "+ tab);

      while(rs.next()){

        out.println(rs.getString(1) + " =  ");
        out.println(rs.getString(2));
        out.println("<br/>");

      }
    }

    catch (Exception e){}
    out.println("</body></html>");
  }
}
