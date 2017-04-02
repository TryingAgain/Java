import java.util.*;

public class ProgramThree{

  public static void main(String... S){

    //This program is way for substitute of iterator
    ArrayList <Integer> arList = new ArrayList<Integer> ();
    int list[] = {1, -1, 2, -2, 3, -3, 4, -4};

    for (int i = 0; i< list.length; i++){

      arList.add(list[i]);
    }

    //normal for loop to take out values
    Object o[] = arList.toArray();
    for (int i=0; i<o.length; i++){

      Integer z = (Integer) o[i];
      System.out.println(z.intValue()+ "  ");

    }

    System.out.println("  ");

    //adavnced loop to take out values
    for(Integer i : arList){

      System.out.println(i.intValue() + "");
    }
  }
}
