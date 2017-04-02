import java.util.*;

public class ProgramTwo{

  public static void main(String... S){

    ArrayList<Integer> arList= new ArrayList<Integer>();
    int listOfNumber[] = {-1, 4, 5, 33, 54, 23};

    for (int i=0; i<listOfNumber.length; i++){
      arList.add(listOfNumber[i]);
    }

    System.out.println(arList.size());
    Iterator <Integer> it = arList.iterator();
    while(it.hasNext()){

      Integer out = it.next();
      if(out.intValue()<0){
        it.remove();
      }

    }
    System.out.println(arList);
  }
}
