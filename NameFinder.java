/*
      Bennett Yardley
      Programming I Section 1
      Find Name
*/
import java.util.Scanner;


public class NameFinder
{
   public static void main (String[] args)
   {
   
      Scanner console = new Scanner(System.in);
      System.out.print("Enter your name (Last, First Middle Ex. Smith, John Bob): ");
   
      String name = console.nextLine();
      int post = name.indexOf(',');
   
      String firstName = name.substring(post+2);
      String lastName = name.substring(0,post);
           
      System.out.println(firstName + " " + lastName);   
   }
}
