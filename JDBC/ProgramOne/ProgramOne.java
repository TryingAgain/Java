import java.sql.*;

class ProgramOne {

  public static void main(String... S){
    try{

      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345678");
      String t1 = "hello1";
      String t2 = "1001";
      Statement s= c.createStatement();
      s.executeUpdate("create table emp101(name varchar2 (10), id number (5))");
      int x = s.executeUpdate("insert into emp101 values ('"+t1+"','"+t2+"')");
      System.out.println(x);

      ResultSet result1 = s.executeQuery("select * from emp101");
      while(result1.next()){

        System.out.println(result1.getString(2));
        System.out.println(result1.getString("name"));
      }
    }
    catch(SQLException e){

      System.out.println(e);
    }

    catch(Exception i){

      System.out.println(i);
    }
  }
}
