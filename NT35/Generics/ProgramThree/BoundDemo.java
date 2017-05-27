// Class having generic data type
class Stats<T extends Number>{

  T[] nums;

  Stats(T[] o){

    nums = o;
  }

  double average(){

    double sum = 0.0;

    for (int i=0; i<nums.length; i++){

      // To calculate sum of all elements after changing to double
      sum += nums[i].doubleValue();

    }

    return sum/nums.length;
  }
}

// Main class implemetation starts

public class BoundDemo{

  public static void main (String... S){

    Integer inums[] = {1,2,3,4,5};

    Stats <Integer> iob = new Stats <Integer> (inums);

    double v = iob.average();

    System.out.println("iob average is : " + v);

    Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};

    Stats <Double> dob = new Stats <Double>(dnums);

    double w = dob.average();

    System.out.println("dob average is : " + w);

    // String snums[] = {"hello", "again", "wassup"};
    //
    // Stats <String> sob = new Stats <String>(snums);

  }
}
