class ThreeGen<T, V, Lala>{

    T ob1;
    V ob2;
    Lala ob3;

  ThreeGen(T o1, V o2, Lala o3){

    this.ob1 = o1;
    this.ob2 = o2;
    this.ob3= o3;

  }

  void showTypes(){

    System.out.println("Type of T is : " + ob1.getClass().getName());
    System.out.println("Type of V is : " + ob2.getClass().getName());
    System.out.println("Type of Lala is : " + ob3.getClass().getName());
  }

  T getOb1(){

    return this.ob1;
  }

  V getOb2(){

    return this.ob2;
  }

  Lala getOb3(){

    return this.ob3;
  }

public static void main(String... S){

  ThreeGen<Integer, String, Double> tgObj = new ThreeGen<Integer, String, Double>(88, "Generics", 2.4);
  tgObj.showTypes();
  int v = tgObj.getOb1();
  String str = tgObj.getOb2();
  double d = tgObj.getOb3();

  System.out.println(v + "   " + str +"   "+d);
}
}
