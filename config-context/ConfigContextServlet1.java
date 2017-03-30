import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ConfigContextServlet1 extends HttpServlet{

  PrintWriter out;
  ServletConfig conf;
  ServletContext conf1;
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    out= res.getWriter();
    conf = getServletConfig();
    conf1 = getServletContext();
    //Enumeration en = conf.getInitParameterNames();
    String drive = conf1.getInitParameter("driver");
    String imag = conf1.getInitParameter("image");
    String use = conf.getInitParameter("User1");
    String property = conf.getInitParameter("property1");

    res.setContentType("text/html");
    out.println("<html><body>");
    out.println(drive);
    out.println(imag);
    out.println(use);
    out.println(property);
    out.println("</body></html>");

  }
}
