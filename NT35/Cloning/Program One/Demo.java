class Demo implements Cloneable{

  int x = 10;
  int y = 20;

  Temp t = new Temp();

  public Demo clone(){

    Demo z = null;
    try{
      z = (Demo) super.clone();
    }

    catch (CloneNotSupportedException e){
      System.out.println(e);
    }
    return z;
  }

  public static void main(String... a){

    Demo c = new Demo();
    Demo b = c.clone(); // Shallow cloning


    //Shallow cloning will be used to clone non primitive data types of same class

    b.t = c.t.clone(); // Deep cloning
    System.out.println(b.x);
    System.out.println(b.t.z);
    // Deep cloning will also clone non primitive data types of other class
  }
}


// Another class
// This code will be used when above program uses shallow cloning
// class Temp{
//
//   int z = 40;
// }

// This code will be used when above program uses deep cloning

class Temp implements Cloneable{

  int z = 80;

  public Temp clone(){

    Temp t1 =null;
    try{
      t1 = (Temp) super.clone();
    }
    catch (CloneNotSupportedException e){
      System.out.println(e);
    }
    return t1;
  }
}
