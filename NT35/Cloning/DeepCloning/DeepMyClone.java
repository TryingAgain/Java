class Temp implements Cloneable{

  int g;

  Temp (int g){

    this.g = g;
  }

  public Temp clone(){

    Temp z= null;

    try{

      z = (Temp)super.clone();

    }

    catch(Exception e){

      //
    }

    return z;
  }
}

// Main class starts from here

class DeepMyClone implements Cloneable{

  int x = 10;
  Temp t;

  DeepMyClone (int a){

    t = new Temp(a);
  }

  public DeepMyClone clone(){

    DeepMyClone z = null;

    try {

      z = (DeepMyClone)super.clone();
    }

    catch(Exception e){

      //
    }

    return z;
  }

  public static void main(String... a){

    DeepMyClone c = null;
    DeepMyClone m = new DeepMyClone(100);
    System.out.println("m" + m.t.g);

    try{

      c=m.clone();
      c.t = m.t.clone();
    }

    catch(Exception e){

      //
    }

    System.out.println("c" + c.t.g);
    c.t.g = 300;
    System.out.println("m after changes" + m.t.g);
    System.out.println("c after changes" + c.t.g);
  }
}
