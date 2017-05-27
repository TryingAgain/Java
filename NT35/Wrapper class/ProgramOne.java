// Wrapper Class Primitive datatypes -> object (java.lang- all wrapper classes)
//Wrapper classes are blank final and immutable
//void wrapper class only denotes class object representing keyword void

//Common Constructors ->
//    Char -> 1 => char value as parameter
//    Rest -. 2 => One takes Primitive data and other string

// COnverting String to Wrapper object
//  static method valueOf(String). eg
//    Integer z = Integer.valueOf("10"); // What if tried to pass hello here what happens?

//COnverting Wrapper object to String
//Every wrapper class overrides toString()



// ------- Theory Ends Here ----------//

//CompareTo Program

class ProgramOne{

  public static void main(String... a){

    //Wrapping p.datatypes to Objects
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(20);

    // Comparison
    int r = i2.compareTo(i1);
    //above Comparison returns value as -1, 1, 0
    // 0 -> same, -1 -> inside value is greater, 1-> outside value is greater// where inside depicts value as parameter

    System.out.println(r);

    //Wrapping char to Object
    Character c1 = new Character('a');
    Character c2 = new Character('A');

    //Comparison
    r = c2.compareTo(c1);
    // above Comparison returns difference in Ascii value of both char
    System.out.println(r);
  }
}
