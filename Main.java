public class Main {

   public static void main(String []args) {
      // One = sign ASSIGNS a value to a variable
      int age = 15;
      int year = 14;

      // Two == sign is checking for EQUALITY
      boolean match = (age == year); // returns a BOOLEAN
      System.out.println("Does age match year? " + match);

      year = 15; // RE-ASSIGNING
      System.out.println(age == year); // true 

      // != means "is NOT equal to"
      System.out.println(age != year);

      // RELATIONAL OPERATORS
      // used in boolean expressions 
      double pi = 3.14159;
      System.out.println(pi > 0); // checking if positive
      System.out.println(pi < 0); // checking if negative 
      System.out.println(pi >= 3.14); // true 
      System.out.println(pi <= 10); // true 
   }
}
