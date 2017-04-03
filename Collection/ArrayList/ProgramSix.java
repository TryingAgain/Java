// This program is to implement Serialization in ArrayList

import java.util.*;
import java.io.*;

public class ProgramSix{

  public static void main(String... S){

    ArrayList<String> arList = new ArrayList<String>();
    arList.add("String One");
    arList.add("String Two");
    arList.add("String Three");

    try{

      FileOutputStream fos = new FileOutputStream("myfile.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(arList);
      oos.close();
      fos.close();

      System.out.println("After we deserialize");

      FileInputStream fin = new FileInputStream("myfile.txt");
      ObjectInputStream ois = new ObjectInputStream(fin);

      ArrayList arList1 = (ArrayList) ois.readObject();

      System.out.println(arList1);
    }

    catch(Exception ex){
      ex.printStackTrace();
    }
  }
}
