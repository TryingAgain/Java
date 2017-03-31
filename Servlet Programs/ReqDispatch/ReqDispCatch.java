import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDispCatch extends HttpServlet{

  PrintWriter out;

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/Html");
    out = res.getWriter();
    String sec = (String)req.getAttribute("test");
    out.println("<html><body>");
    out.println(sec);
    out.println("</body></html>");
  }
}
