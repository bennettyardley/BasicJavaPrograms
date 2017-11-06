import java.util.Scanner;  
public class righttriangle
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      double hyp = 0;
      double e = 0;
      double d = 0;
      
      System.out.print("Enter A: ");  
      double a = console.nextDouble();  
      
      System.out.print("Enter B: ");   
      double b = console.nextDouble();  
      
      System.out.print("Enter C: ");   
      double c = console.nextDouble();
      
      if (a > b && a > c)
      {
         hyp = a;
         d = b;
         e = c;
      }
      else if (b > a && b > c)
      {
         hyp = b;
         d = a;
         e = c;
      }
      else if (c > a && c > b)
      {
         hyp = c;
         d = a;
         e = b;
      } 
      
      if (((d)*(d) + (e)*(e)) == ((hyp)*(hyp)))
      {
         System.out.print("\nIt is a right triangle");
      }
      else
      {
         System.out.print("\nNot a right triangle");
      }
   }
}
