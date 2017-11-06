/*    
      Bennett Yardley
      Programming I Section 1
      Three of a kind...
*/

import java.util.Scanner;

public class threeofakind
{
   public static void main(String[] args) 
   {
      boolean complete = false;
      int roll1 = 0;
      int roll2 = 0;
      int roll3 = 0;
      int rolls = 0;
      
      Scanner console = new Scanner(System.in);
      
      while(complete == false)
      {
         rolls = rolls + 1;
         roll1 = (int)(Math.random()*6 + 1);
         System.out.println("Roll " + rolls + ": " + roll1);
         roll2 = (int)(Math.random()*6 + 1);
         System.out.println("Roll " + rolls + ": " + roll2);
         roll3 = (int)(Math.random()*6 + 1);
         System.out.println("Roll " + rolls + ": " + roll3);
    
         if (roll1 == roll2 && roll2 == roll3)
         {
            if(rolls == 1)
            {
               System.out.println("You got three of a kind! " + "After " + rolls + " " + "try.");
               complete = true;
            }
            if(rolls >= 2)
            {
               System.out.println("You got three of a kind! " + "After " + rolls + " " + "tries.");
               complete = true;
            }
         }
      }   
   }
}