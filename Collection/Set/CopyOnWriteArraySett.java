import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteArraySett {

  public static void main(String... S){

    Set <String> myMap = new CopyOnWriteArraySet<String>();

    myMap.add("1");
    myMap.add("2");
    myMap.add("3");
    myMap.add("4");

    System.out.println("CopyOnWriteArraySet before iterator : " + myMap);

    Iterator<String> it = myMap.iterator();

    while(it.hasNext()){

      String Key = it.next();
      if(Key.equals("3"))
        myMap.add(Key + "new");
    }

    System.out.println("CopyOnWriteArraySet after iterator : " + myMap);
  }
}
