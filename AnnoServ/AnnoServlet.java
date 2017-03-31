import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet (urlPatterns = {"/dekho"})

public class AnnoServlet extends HttpServlet{

  public void service (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
    PrintWriter out = res.getWriter();
    res.setContentType("text/html");
    out.println("<html><body>");
    out.println("Success by Anno");
    out.println("</body></html>");

  }
}
