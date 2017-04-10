import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ImageServlet extends HttpServlet{

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

    String fileName = "1.jpg";
    ServletOutputStream stream = null;
    BufferedInputStream buf = null;

    try{

      stream = res.getOutputStream();
      String s1 = getServletContext().getRealPath("/file/1.jpg");
      File doc = new File(s1);

      res.setContentType("image/jpeg");
      res.setHeader("Content-Disposition","attachment;filename :" + fileName);
      res.setContentLength((int) doc.length());

      FileInputStream input = new FileInputStream(doc);
      buf = new BufferedInputStream(input);

      int readByte = 0;

      while((readByte = buf.read())!=-1){

        stream.write(readByte);
      }
    }

    catch(Exception e){

      
    }
  }
}
