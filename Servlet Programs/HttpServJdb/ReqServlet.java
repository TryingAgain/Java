import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ReqServlet extends HttpServlet{

  PrintWriter out;

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

  res.setContentType("text/html");
  out = res.getWriter();
  //out.println("<html><body>");
  String S = req.getMethod(); // This is to find out which method was invoked in request
//  out.println(S); // This will directly print method name
  if (S.equals("POST"))
    doPost(req, res);
  if (S.equals("GET"))
    doGet(req, res);
  }

  /*
  This section is repatition of above section with invoking super method to run thus invoking father's duplicate service to detect method

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    out= res.getWriter();
    String name = req.getParameter("name");
    String pass = req.getParameter("pass");

    if (name.equals("SUMIT") && pass.equals("isha"))
      out.println("User is in love with password");
    else
      out.println("User is not in love with password");

    out.println(</body></html>);
  }
  */

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    out.println("<html><body>");
    String name = req.getParameter("name");
    String pass = req.getParameter("pass");
    // try{
    //
    //   Class.forName("Oracle.jdbc.driver.OracleDriver");
    //   Connection C = DriverManager.getConnection*"jdbc:oracle:thin:@localhost:1"
    out.println(name);
    out.println(pass);
    //out.println("success");
    out.println("</body></html>");
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    out.println("<html><body>");
    String name = req.getParameter("name");
    String pass = req.getParameter("pass");
    out.println(name);
    out.println(pass);
    out.println("</body> </html>");
  }
}
