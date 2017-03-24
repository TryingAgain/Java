import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet implements Servlet{

  public void init(ServletConfig con){

  }

  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    out.println("<html><body>");
    out.println("Hello Servlet.... Our First program");
    out.println("<br>");
    out.println("Reference Id :" + this);
    out.println("<br>");
    out.println("Thread Name :" + Thread.currentThread().getName());

    try{
      Thread.sleep(15000);
    }

    catch(Exception e){

    }

    out.println("</body></html>");
  }

  public void destroy(){


  }

  public ServletConfig getServletConfig(){

    return null;
  }

  public String getServletInfo(){

    return null;
  }
}
