package lulu;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.apache.struts2.*;
import com.opensymphony.xwork2.*;

public class Checking{

  private String test;
  private String message;

  public String execute(){

    setMessage("hello" + getTest());

    ActionContext atx = ActionContext.getContext();

    HttpServletRequest s = (HttpServletRequest)atx.get(ServletActionContext.HTTP_REQUEST);
    Map s1 = (Map) atx.get(ServletActionContext.SESSION);
    ServletContext s2 = (ServletContext)atx.get(ServletActionContext.SERVLET_CONTEXT);
    s.setAttribute("1","kaam chalao");
    s1.put("2", "firSe");
    s2.setAttribute("3","KitniBaar");
    return "SUCCESS";
  }

  public String getTest(){

    return test;
  }

  public String getMessage(){

    return message;
  }

  public void setMessage(String message){

    this.message = message;
  }

  public void setTest(String test){

    this.test=test;
  }

}
