import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ExcelServlet extends HttpServlet{

  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    String fileName = "1.xlsx";
    ServletOutputStream stream = null;
    BufferedInputStream buf = null;

    try {

      res.setContentType("application/vnd.ms-excel");

      stream = res.getOutputStream();
      String s1 = getServletContext().getRealPath("/file/1.xlsx");
      File doc = new File(s1);

      res.setHeader("Content-Disposition", "application; filname :" + fileName);
      res.setContentLength((int) doc.length());

      FileInputStream input = new FileInputStream(doc);
      buf = new BufferedInputStream(input);

      int read = 0;

      while((read = buf.read())!= -1){

        stream.write(read);
      }
    }

    catch(Exception e){


    }

  }
}
