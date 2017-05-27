class Gen<T extends Number>{

  T ob;
  T vals [];

  Gen (T o, T[] nums){

    ob = o;
    vals = nums;
  }
}

//  Writing main class to perform operation

public class GenArrays{

  public static void main(String... S){

    Integer n[] ={1,2,3,4,5};

    Gen<Integer> iob = new Gen<Integer> (50, n);

    // Can't create an array of type specific generic references

    // ie

    //Gen <Integer> gens[] = new Gen<Integer>[10];
    // Above statement is wrong

    Gen<?> gens[] = new Gen<?>[2];
    //Above statment is ok

    gens[0]= new Gen <Integer>(10, n);

    gens[1] = new Gen <Float> (2.3f, new Float[]{1.2f, 2.2f});

    for (int i = 0; i<gens[0].vals.length; i++){

      System.out.println(gens[0].vals[i]);
    }

    for(int i = 0; i<gens[1].vals.length; i++){

      System.out.println(gens[1].vals[i]);
    }
  }
}
