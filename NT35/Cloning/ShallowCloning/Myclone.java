class Temp{

  int g;

  Temp (int g){

    this.g = g;
  }
}

// Main class starts from here

class Myclone implements Cloneable{

  int x = 10;
  Temp t;

  Myclone(int a){

    t = new Temp(a);
  }

  public Myclone clone(){

    // Shallow Copy
    Myclone ss = null;
    try{

      return (Myclone)super.clone();
    }
    catch(Exception e){

    }
    return ss;
  }

  public static void main(String... a){

    Myclone c = null;
    Myclone m = new Myclone(100);
    System.out.println("m.t.g" + m.t.g);
    System.out.println("m.x" + m.x);

    try{

      c = m.clone();
    }
    catch(Exception e){

    }
    System.out.println("c" + c.t.g);
    System.out.println("c.x" + c.x);

    // Note this is important to understand difference between deep and shallow cloning
    c.t.g = 3000;
    c.x=30;

    //This would change value of m objects as both m and c share same refernce id for t
    // where as in case of deep cloning it will make clone for t also
    System.out.println("m.t.g after change" + m.t.g);
    System.out.println("m.x after change" + m.x);
  }
}
