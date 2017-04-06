package my;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.apache.struts2.interceptor.SessionAware;

public class NyaNaam implements SessionAware{

  private Map session; // reason for doing this is that session prepares key value pairs
  private String message;
  private String missme;

  public void setSession(Map session){

    this.session = session;
  }

  public NyaNaam(){


  }

  public String execute(){

    setMessage("This is to test" + getMissme());
    session.put("Bored","Please Something New");
    return "KuchNya";
  }

  public void setMessage(String message){

    this.message=message;
  }

  public void setMissme(String missme){

    this.missme = missme;
  }

  public String getMissme(){

    return missme;
  }

  public String getMessage(){

    return message;
  }
}
