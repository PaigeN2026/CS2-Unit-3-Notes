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
         System.out.println("You can get your license in NY!");
      }
      // else is coupled with the if statement above
      // so you do NOT need to specificy a CONDITION/EXPRESSION
      else {
         System.out.println("You're too young to drive in NY");
      }

      // MULTI-WAY SELECTION
      System.out.println("What type of costume are you thinking of? (scary, cute, funny, other)");
      String choice = "scary";

      // Always start a "decision" awith an IF statement
      if (choice.equals ("scary")) {
         System.out.println("You should be a clown!");
      }

      // You can include as many ELSE IF statements as you want
      // but they must follow an initial IF statement
      else if (choice.equals("cute")) {
         System.out.println("You should be a bunny!");
      }

      else if (choice.equals("funny")) {
         System.out.println("You should be an inflatable cow!");
      }

      // Provide a "catch-all" choice in case earlier conditions are not met
      else {
         System.out.println("I have no idea how to help you. Look on Pinterest?");
      }

      // AND && Operator
      // Both conditions need to be true for the conditional body to be executed 
      boolean didHomework = false;
      boolean cleanedRoom = true;

      // can write the conditions either way below,
      // both are valid because we're using boolean variables already 
      if ((didHomework == true) && (cleanedRoom)) {
         System.out.println("You can go out");
      }
      else {
         System.out.println("You're grounded");
      }
      
      // OR || Operator
      // Evaluates to TRUE if AT LEAST one expression is true
      if ( (didHomework) || (cleanedRoom) ) {
         System.out.println("The more permissive parents say sure, go out and finish anything else later!");
      }
      else {
         System.out.println("No, you need to do at least one of your tasks first.");
      }

      // NOT ! Operator
      // Use this on just ONE condition to flip the boolean result
      boolean walkSignOn = false;
      // Condition body will execute only if condition is FALSE
      if (!walkSignOn) {
         System.out.println("STOP CROSSING THE STREET!!");
      }
   }
}
