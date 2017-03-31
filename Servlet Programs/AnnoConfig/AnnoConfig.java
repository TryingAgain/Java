import javax.servlet.http.*;
import javax. servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet (
  urlPatterns = {"/dekhle"},
  initParams = {
    @WebInitParam (name = "test", value ="Check that"),
    @WebInitParam (name = "test2", value = " Checking value again")
  }
)

public class AnnoConfig extends HttpServlet{

  //private String dekhega, dobara;

  //writing constructor to call parent constructor
  public AnnoConfig(){

    super();
  }

  @Override
  public void init(ServletConfig conf) throws ServletException{

    super.init(conf); // Sending config to parent so that it can be used by other methods
    //This can even be removed by saving parameters at class level by defining the variables at class level
    // dekhega = conf.getInitParameter("test");
    // dobara = conf.getInitParameter("test2");
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

      // if request is coming without any method defined then you should work either inside get method or service method
      //ServletConfig con = getServletConfig();
      String dekhega = getInitParameter("test");
      String dobara = getInitParameter("test2");
      PrintWriter out = res.getWriter();
      res.setContentType("text/html");
      out.println("<html><body>");
      out.println(dekhega);
      out.println(dobara);
      out.println("</body></html>");
  }
}
