import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class SendRed extends HttpServlet{

  PrintWriter out;
  ServletConfig conf;
  ServletContext cont;
  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    out = res.getWriter();

    conf = getServletConfig();
    cont = getServletContext();
    res.setContentType("text/html");
    String User = conf.getInitParameter("User");
    String image = cont.getInitParameter("image");

    if(image.equals("Fill any value here")){
      res.sendRedirect("index.html");
    }
    else
      res.sendRedirect("http://www.google.com");
  }
}
