import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class PDFServlet extends HttpServlet{

  public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

      res.setContentType("application/pdf");

      String fileName = "47.pdf";
      ServletOutputStream stream = null;
      BufferedInputStream buf = null;

      try{

        stream = res.getOutputStream(); // this is to get reference id for where to print
        String s1 = getServletContext().getRealPath("/file/47.pdf");
        File doc = new File(s1);

        res.setContentType("application/pdf");
        res.addHeader("Content-Disposition","attachment;filename :" + fileName);// line to open saving option below the browser// without this it will directly save the file
        res.setContentLength((int) doc.length());
        FileInputStream input = new FileInputStream(doc);
        buf = new BufferedInputStream(input);
        int readBytes =0;

        while((readBytes = buf.read())!= -1)
        {

          stream.write(readBytes);
        }
      }

      catch(Exception e){


      }
  }
}
