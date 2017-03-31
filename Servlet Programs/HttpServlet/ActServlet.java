import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActServlet extends HttpServlet{

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    super.service(req, res); // invoking parents duplicate service also. Since original service is not overloaded, original service will run.
    // once original will run it will run duplicate service of our class since we overloaded it. From super we are invoking parent's duplicate service

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<html><body>");
    out.println("actual service is being called");
    out.println("</body></html>");

  }
}
