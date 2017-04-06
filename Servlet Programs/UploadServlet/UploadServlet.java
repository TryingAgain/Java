import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import com.oreilly.servlet.*;

public class UploadServlet extends HttpServlet{

  PrintWriter out;

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    res.setContentType("text/html");
    out = res.getWriter();

    String path= getServletContext().getRealPath("/file");
    MultipartRequest mpr = new MultipartRequest(req, path, 500*1024*1024);

    String s1 = mpr.getOriginalFileName("file");
    out.println("<html><body>");
    out.println("File uploaded successfully :" +s1);
    out.println("</html></body>");
  }
}
