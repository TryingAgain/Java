package test;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.apache.struts2.*;
import com.opensymphony.xwork2.*;

public class HelloWorld{

  private String message;
  private String username;

  public String execute(){

    setMessage("Hello" + getUsername());

    ActionContext ctx = ActionContext.getContext();

    HttpServletRequest s = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);
    Map s1 =(Map) ctx.get(ServletActionContext.SESSION);

    //HttpServletRequest s2 =(HttpServletRequest) ctx.get(ServletActionContext.HTTP_RESPONSE);
    ServletContext atx = (ServletContext)ctx.get(ServletActionContext.SERVLET_CONTEXT);
    s.setAttribute("name", "Chal be");
    s1.put("name1", "Checking it");
    atx.setAttribute("name2", "Dekhle");

    return "SUCCESS";
  }

  public String getMesage(){

    return message;
  }

  public String getUsername(){

    return username;
  }

  public void setMessage(String message){

    this.message = message;
  }

  public void setUsername(String username){

    this.username = username;
  }
}
