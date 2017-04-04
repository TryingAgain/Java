package my;

public class HelloWorld{

  private String mssage;
  private String userName;

  public HelloWorld(){

  }

  public String execute(){

    setMssage("hello from default package" + getUserName());
    return"SUCCESSOne";

  }

  public String show(){
    setMssage("Hello from default package with show" + getUserName());
    return"SUCCESSOne";

  }

  public String getMssage(){
    return mssage;
  }

  public String getUserName(){
    return userName;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public void setMssage(String mssage){
    this.mssage = mssage;
  }
}
