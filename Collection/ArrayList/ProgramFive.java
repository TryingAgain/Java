import java.util.*;

public class ProgramFive{

  public static void main(String... S){

    ArrayList<Emp> arList = new ArrayList<Emp>();
    arList.add(new Emp(1001, "Test"));
    arList.add(new Emp(1002, "String"));
    arList.add(new Emp(1003, "Setting"));

    Iterator <Emp> it = arList.iterator();
    while(it.hasNext()){

      Emp em = it.next();
      System.out.println(em.id); // Data Members of Emp Class
      System.out.println(em.name);// Data Members of Emp class
      if(em.id == 1003)
        it.remove();
    }

    System.out.println("After rmoving 1004 element");
    it = arList.iterator();
    while(it.hasNext()){

      Emp em = it.next();
      System.out.println("new val" + em.id); // Data Members of Emp Class
      System.out.println("new Val" + em.name);
    }
  }
}


class Emp{

  int id;
  String name;

  Emp(int id, String name){
    this.id = id;
    this.name = name;
  }

}
