import java.util.*;

public class ProgramOne{

  public static void main(String []s){

    ArrayList <String> arList = new ArrayList<String>();
    System.out.println(arList.size());
    arList.add("Add One");
    arList.add("Test that");
    arList.add("Check Again");
    arList.add("Add One");
    arList.add("Test that");

    //arList.add(10);
    System.out.println(arList.size());

    arList.remove("Add One");
    arList.remove(2);
    System.out.println(arList.size());
    System.out.println(arList);
  }
}
