//program to enter an ArrayList inside ArrayList

import java.util.*;

public class ProgramFour{

  public static void main(String... S){

    ArrayList <String> out = new ArrayList <String>();
    ArrayList <ArrayList> out1 = new ArrayList <ArrayList>();

    out.add("hello");
    out.add("hi");
    //out1.add(out);
    out1.add(out);
    out1.add(out1);

    System.out.println(out);
    System.out.println(out1);
  }
}
