import java.util.Scanner; 

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

      // IF STATEMENTS
      boolean isCold = false;
      if (isCold == true) {
         System.out.println("Bring a jacket!");
      }
      System.out.println("Enjoy your walk!");

      System.out.println(" ");

      // Magic 8-Ball Mini Program
      Scanner scan = new Scanner(System.in);
      System.out.println("Ask a question!");
      String question = scan.nextLine();

      // 1. Generate random integer between 1-8
      int numb = (int) (Math.random() * 8 + 1); 

      // 2. Use that number in 8 if statements to print a different response 
      if (numb == 1) {
         System.out.println("Def not");
      }
      if (numb == 2) {
         System.out.println("Probably not");
      }
      if (numb == 3) {
         System.out.println("No");
      }
      if (numb == 4) {
         System.out.println("Eh");
      }
      if (numb == 5) {
         System.out.println("lol");
      }
      if (numb == 6) {
         System.out.println("Not happening");
      }
      if (numb == 7) {
         System.out.println("No, ask something else");
      }
      if (numb == 8) {
         System.out.println("...");
      }
      // every "if" block is like starting a new line of questioning 

      // TWO-WAY SELECTION: IF block coupled with an ELSE block 
      // is like "if this is true, do something" OTHERWISE, "do something else"
      int myAge = 16;
      // BOOLEAN EXPRESSION here is "myAge >= 17"
      if (myAge >= 17) { 
         Sytem.out.println("You can get your license in NY!");
      }
      // else is coupled with the if statement above
      // so you do NOT need to specificy a CONDITION/EXPRESSION
      else {
         System.out.println("You're too young to drive in NY");
      }
   }
}
