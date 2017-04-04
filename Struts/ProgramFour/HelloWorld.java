package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.ServletResponseAware;

public class HelloWorld implements ServletResponseAware{

  private HttpServletResponse res;
  private String mssage;
  private String userName;

  public HelloWorld(){


  }

  public void setServletResponse(HttpServletResponse res){

    this.res = res;
  }

  public String execute() throws Exception{

    PrintWriter out =res.getWriter();
    setMssage("Hello" + getUserName());
    out.println("Welcome Lulu : " + getMssage());
    return null;// success file is not required in this program because we are going to directly send response from this file
  }

  public String getMssage(){

    return mssage;
  }

  public String getUserName(){

    return userName;
  }

  public void setMssage(String mssage){

    this.mssage=mssage;
  }

  public void setUserName(String userName){

    this.userName = userName;
  }
}
