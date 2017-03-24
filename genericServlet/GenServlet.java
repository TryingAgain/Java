import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GenServlet extends GenericServlet{

  PrintWriter out;
  static int count = 0;

  public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{

  res.setContentType("text/html");
  out = res.getWriter();

  //destroy methid is called explicitly to prove that this will execute normally just like a normal function
  // This just acts like a finalize method in java classes. Last method executed by container before closing servlet.
  destroy();

  out.println("<html> <body>");
  out.println("<br>");
  out.println("Output is coming from extending Generic Servlet class");
  out.println("<br>");
  out.println("Reference ID of object created is : " + this);
  out.println("<br>");

  try{

    Thread.sleep(2000);
  }

  catch(Exception exci){


  }

  out.println("Thread Number/ Name : " + Thread.currentThread().getName());
  out.println("</body></html>");
  }

  public void destroy(){

    out.println("destroy");
    count = count+5;
  }
}
