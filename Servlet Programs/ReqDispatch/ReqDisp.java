import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDisp extends HttpServlet{

  PrintWriter out;

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    out = res.getWriter();
    out.println("<html><body>");
    req.setAttribute("test","pehla try hai");
    out.println("This is to test include and forward methods of Request Dispatcher");
    RequestDispatcher rd = req.getRequestDispatcher("dekhenge");
    rd.forward(req,res);
    //rd.include(req,res);
    out.println("This part needs to be executed after request dispatcher if include is used and not forward");
  }
}
