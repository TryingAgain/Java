import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ProgramOne extends GenericServlet{

  public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    System.out.println("servlet");

    String s =(String)req.getParameter("name1");
    String s1 =(String)req.getParameter("name2");

    out.println("<html><body>");
    out.println("hello with ajax" + s);
    out.println("<br/>");
    out.println("hello from ajax again" + s1);
    out.println("</body></html>");

  }
}
