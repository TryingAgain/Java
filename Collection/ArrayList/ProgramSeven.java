// This program is to implement Serialization in self made class
// For this to work self made class needs to implements Serializable interface

import java.util.*;
import java.io.*;

public class ProgramSeven{

  public static void main(String... S){

    ArrayList<Test> arList = new ArrayList<Test>();
    arList.add(new Test(1001, "Value1"));
    arList.add(new Test(1002, "Value2"));
    arList.add(new Test(1003, "value3"));

    try{
      FileOutputStream fos = new FileOutputStream("Doosra.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(arList);
      oos.close();
      fos.close();


      // Now time to deserialize ObjectInputStream

      System.out.println("After Deserialization here is the output :");

      FileInputStream fis = new FileInputStream("Doosra.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      ArrayList arList1 = (ArrayList) ois.readObject();

      System.out.println(arList1);
    }
  catch(Exception ex){

    ex.printStackTrace();
  }
  }
}

class Test implements Serializable{

  int id;
  String Value;

  Test(int id1, String value1){

    this.id = id;
    this.Value = value1;
  }

  // To print values after Deserialization you also need to iverride toString Method
}
