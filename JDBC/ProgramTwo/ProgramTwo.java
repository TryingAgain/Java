import java.sql.*;

class ProgramTwo{

  public static void main(String... S){

    String a = "Hello";
    String b = "There";
    try{

      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345678");
      Statement s = c.createStatement();
      int aq = s.executeUpdate("insert into artists values('"+a+"','"+b+"')");
      System.out.println(aq);
      ResultSet result = s.executeQuery("select * from artists");
      while (result.next()){

        System.out.println(result.getString(1));
        System.out.println(result.getString(2));
      }
    }
    catch(Exception i){

      System.out.println(i);
    }
  }
}
