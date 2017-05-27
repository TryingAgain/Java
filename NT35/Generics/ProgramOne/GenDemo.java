// Class level variables

class Gen<T>{

  T obj;

  Gen(T o){

    this.obj = o;
  }

  T getOb(){

    return this.obj;
  }

  void showType(){

    //System.out.println();
    //Using reflection trying to find Class class object and then perform methods on it
    Class c = obj.getClass();
    System.out.println("Type of T is : " +c.getName());
  }

}

// Main demo class starts here

public class GenDemo{

  public static void main(String... S){

    Gen <Integer> iob = new Gen<Integer>(98);
    iob.showType();

    int v = iob.getOb();

    System.out.println("value:" + v);
    System.out.println();

    Gen<String> strOb = new Gen<String>("Generic Test");
    strOb.showType();

    String str = strOb.getOb();
    System.out.println("Value : "+ str);

    Emp e1 = new Emp();
    Gen <Emp> eOb = new Gen<Emp>(e1);
    eOb.showType();

    // iob = eOb  cannot be done in generic

  }
}


// Employe class

class Emp{

  int x = 200;

}
