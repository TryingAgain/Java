package my;

import javax.servlet.http.*;
import javax.servlet.*;
import org.apache.struts2.interceptor.ServletRequestAware;

public class HelloWorld implements ServletRequestAware{

  private HttpServletRequest req;
  private String mssage;
  private String userName;

  public HelloWorld(){


  }

  public void setServletRequest(HttpServletRequest req){

    this.req = req;
  }

  public String execute(){

    setMssage("Hello" + getUserName());
    String s = req.getParameter("userName");
    req.setAttribute("name", s);
    return"SUCCESSOne";
  }

  public String getUserName(){

    return userName;
  }

  public void setUserName(String userName){

    this.userName = userName;
  }

  public String getMssage(){

    return mssage;
  }

  public void setMssage(String mssage){

    this.mssage = mssage;
  }
}
