import java.util.*;

class BurgerPalace{
  // instance variables
  private int myNumCheeseBurgers;
  private int myNumWorksBurgers; 
  private int myNumPlainBurgers; 
  private int myNumVeggieBurgers;
  private int myCheeseSupply;
  private int myTomatoSupply;
  private int myLettuceSupply; 
  private int myBurgerSupply; 
  private int myVeggieBurgerSupply;
  private int myNumFries;
  private int myFrySupply;
  private double myRevenue; 
  private double myOrigAcctBal;

  // constructor
  BurgerPalace(){
    myNumCheeseBurgers = 0;
    myNumWorksBurgers = 0;
    myNumPlainBurgers = 0;
    myNumVeggieBurgers = 0;
    myCheeseSupply = 0;  
    myTomatoSupply = 0;
    myLettuceSupply = 0;
    myBurgerSupply = 0;
    myNumFries = 0;
    myFrySupply = 0;
    myVeggieBurgerSupply = 0;
    myRevenue = 0; 
    myOrigAcctBal = 1000;
  }
   BurgerPalace(int cheese, int tomato, int lettuce, int burger, int fry, int veggie, double money){
    myNumCheeseBurgers = 0;
    myNumWorksBurgers = 0;
    myNumPlainBurgers = 0;
    myNumVeggieBurgers = 0;
    myCheeseSupply = cheese;  
    myTomatoSupply = tomato;
    myLettuceSupply = lettuce;
    myBurgerSupply = burger;
    myNumFries = 0;
    myFrySupply = fry;
    myVeggieBurgerSupply = veggie;
    myRevenue = 0; 
    myOrigAcctBal = money;
  }

  // methods
  void orderCheese(){
    myNumCheeseBurgers++;
    myRevenue += 6;
    myCheeseSupply -= 1;
    myBurgerSupply -= 1;
  }

  void orderWorks(){
    myNumWorksBurgers++;
    myRevenue += 7;
    myCheeseSupply -= 1;
    myTomatoSupply -= 1;
    myLettuceSupply -= 1;
    myBurgerSupply -= 1;
  }

  void orderVeggie(){
    myNumVeggieBurgers++;
    myRevenue += 3;
    myTomatoSupply -= 1;
    myLettuceSupply -= 1;
    myVeggieBurgerSupply -= 1;
  }
   
  void orderPlain(){
    myNumPlainBurgers++;
    myRevenue += 5;
    myBurgerSupply -= 1;
  }
  
  void orderFry(){
    myNumFries++;
    myRevenue += 2;
    myFrySupply -=1;
  }
  
  int getNumFries(){
    return myNumFries;
  }
  
  int getNumCheeseBurgers(){
    return myNumCheeseBurgers;
  }

  int getNumWorksBurgers(){
    return myNumWorksBurgers;
  }

  int getNumVeggieBurgers(){
    return myNumVeggieBurgers;
  }
  
  int getNumPlainBurgers(){
    return myNumPlainBurgers;
  }

  int getCheeseSupply(){
    return myCheeseSupply;
  }

  int getTomatoSupply(){
    return myTomatoSupply;
  }

  int getLettuceSupply(){
    return myLettuceSupply;
  }
  
  int getBurgerSupply(){
    return myBurgerSupply;
  }
  
  int getVeggieBurgerSupply(){
    return myVeggieBurgerSupply;
  }
  
  int getFrySupply(){
    return myFrySupply;
  }

  double getRevenueTotal(){
    return myRevenue;
  }

  double getBankAccountBalance(){
    return myOrigAcctBal + myRevenue;
  }
  /*
  public String toString(){
    return "myCheeseSupply: " + myCheeseSupply + "\nmyTomatoSupply: " + myTomatoSupply; 
  }
  */
}

//-------------------- End of BurgerPalace class --------------------//


public class BurgerTester{
  public static void main(String[] args){

    BurgerPalace diner = new BurgerPalace();
    Scanner console = new Scanner(System.in);
    
    System.out.print("Burger Palace in Towson or Baltimore (1. for Towson 2. for Baltimore): ");
    int z1 = console.nextInt();
    System.out.print("Welcome To Burger Palace, May I Take Your Order");
    
    //System.out.println("\n" + diner);
    
    System.out.println("\n--Taking Inventory--");
    
    System.out.print("How many cheese slices: ");
    int a1 = console.nextInt();
    System.out.print("How many lettuce slices: ");
    int a2 = console.nextInt();
    System.out.print("How many tomato slices: ");
    int a3 = console.nextInt();
    System.out.print("How many burger patties: ");
    int a4 = console.nextInt();
    System.out.print("How many veggie patties: ");
    int a5 = console.nextInt();
    System.out.print("How many Fries: ");
    int a6 = console.nextInt();
    
    int thing = 0;
    
    while (thing != -1)
    {
    System.out.println("\n--Ordering Food--");
    System.out.print("What is the name for the order: ");
    String orderName = console.nextLine();
    orderName = console.nextLine();
    System.out.print("How many Plain Burgers: ");
    int x = console.nextInt();
    System.out.print("How many Cheese Burgers: ");
    int x1 = console.nextInt();
    System.out.print("How many Veggie Burgers: ");
    int x2 = console.nextInt();
    System.out.print("How many 'The Works' Burgers: ");
    int x3 = console.nextInt();
    System.out.print("How many Fries: ");
    int x4 = console.nextInt();
    
    for(int i = 1; i <= x; i++)
    {
      diner.orderPlain();
      a4 += diner.getBurgerSupply();
    }
    
    for(int i = 1; i <= x1; i++)
    {
      diner.orderCheese();
      a4 += diner.getBurgerSupply();
      a1 += diner.getCheeseSupply();
    }
    
    for(int i = 1; i <= x2; i++)
    {
      diner.orderVeggie();
      a2 += diner.getLettuceSupply();
      a3 += diner.getTomatoSupply();
      a5 += diner.getVeggieBurgerSupply();
      
    } 
    
    for(int i = 1; i <= x3; i++)
    {
      diner.orderWorks();
      a2 += diner.getLettuceSupply();
      a3 += diner.getTomatoSupply();
      a4 += diner.getBurgerSupply();
      a1 += diner.getCheeseSupply();
    }
    
    for(int i = 1; i <= x4; i++)
    {
      diner.orderFry();
      a6 += diner.getFrySupply();
      
    }
    
    
    System.out.println("\n " + orderName + "'s Order Was:"); 
    System.out.println("# of Cheese Burgers ordered was: " 
+ diner.getNumCheeseBurgers() + " at $6");
    System.out.println("# of 'The Works' Burgers ordered was: " 
+ diner.getNumWorksBurgers() + " at $7");
    System.out.println("# of Veggie Burgers ordered was: " 
+ diner.getNumVeggieBurgers() + " at $3");
    System.out.println("# of Plain Burgers ordered was: " 
+ diner.getNumPlainBurgers() + " at $5");
    System.out.println("# of Fries ordered was: " 
+ diner.getNumFries() + " at $2");

    System.out.print("\nRemaining supply of Cheese slices is: ");
    System.out.println(a1);
    if (a1 < 50)
    {
      System.out.println("\tRunning Low!!!!");
    }
    System.out.print("Remaining supply of Lettuce slices is: ");
    System.out.println(a2);
    if (a2 < 50)
    {
      System.out.println("\tRunning Low!!!!");
    }
    System.out.print("Remaining supply of Tomato slices is: ");
    System.out.println(a3);
    if (a3 < 50)
    {
      System.out.println("\tRunning Low!!!!");
    }
    System.out.print("Remaining supply of Burgers is: ");
    System.out.println(a4);
    if (a4 < 50)
    {
      System.out.println("\tRunning Low!!!!");
    }
    System.out.print("Remaining supply of Veggie Burgers is: ");
    System.out.println(a5);
    if (a5 < 50)
    {
      System.out.print("\tRunning Low!!!!");
    }
    System.out.print("\nRemaining supply of Fries is: ");
    System.out.println(a6);
    if (a6 < 50)
    {
      System.out.println("\tRunning Low!!!!");
    }
    System.out.println("\nRevenue is $" + diner.getRevenueTotal());
    System.out.println("Bank balance is now $" 
+ diner.getBankAccountBalance());

    System.out.print("\nWould You Like To Add Supplies (1 to -1 not to): ");
    int thing2 = console.nextInt();
    if (thing2 == 1)
    {
      System.out.print("\nHow much more cheese slices: ");
      int a7 = console.nextInt();
      a1 += a7;
      System.out.print("How much more lettuce slices: ");
      int a8 = console.nextInt();
      a2 += a8;
      System.out.print("How much more tomato slices: ");
      int a9 = console.nextInt();
      a3 += a9;
      System.out.print("How much more burger patties: ");
      int a10 = console.nextInt();
      a4 += a10;
      System.out.print("How much more veggie patties: ");
      int a11 = console.nextInt();
      a5 += a11;
      System.out.print("How much more Fries: ");
      int a12 = console.nextInt();
      a6 += a12;
    }
    if (thing2 == -1)
    {
    
    }
    
    System.out.print("Order Again (1 to or -1 to not): ");
    thing = console.nextInt();
  }

    System.out.println("\n\nFinal bank balance is $" 
    + diner.getBankAccountBalance());
  }
}


/*
___________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
___________¶¶¶¶¶¶¶¶¶¶¶¶¶_¶
___________¶¶____________¶
____________¶¶__________¶¶¶¶____________¶¶¶
_____________¶__________¶¶_¶¶¶______¶¶¶¶¶¶¶
_____________¶¶_________¶¶___¶¶_¶¶¶¶¶¶____¶¶
____________¶¶¶¶________¶___¶¶¶¶¶¶________¶¶
___________¶¶__¶________¶_¶¶¶¶____________¶¶
___________¶¶__¶¶______¶¶_¶_______________¶¶
___________¶____¶¶¶¶¶¶¶¶¶¶¶¶_______________¶
_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶__¶¶_______________¶
_¶_______________¶¶___¶____¶¶________¶¶¶¶¶¶¶
_¶¶______________¶¶¶_¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
_¶¶______________¶¶¶¶¶¶¶¶¶¶¶_______¶
_¶¶_____________¶¶¶_¶¶¶_¶__¶¶______¶¶
__¶________¶¶¶¶¶¶¶__¶¶_____¶¶______¶¶
__¶____¶¶¶¶¶¶_______¶_______¶¶______¶¶
__¶¶¶¶¶¶¶___________¶________¶¶_____¶¶
__¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶¶¶¶¶¶¶
__________¶¶_______¶¶_________¶¶_¶¶
__________¶________¶¶_________¶¶__¶¶
_________¶¶___¶¶___¶___________¶¶_¶¶
_________¶¶__¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶
_________¶¶_¶¶__¶¶__¶¶¶¶___________¶¶
_________¶__¶____¶_________________¶¶
________¶¶__¶____¶_______¶¶¶¶______¶¶
________¶¶__¶____¶_____¶¶¶__¶¶¶_____¶¶
________¶¶__¶¶¶¶¶¶____¶¶______¶¶____¶¶
_______¶¶___¶¶¶¶¶¶____¶________¶____¶¶
_______¶¶_____________¶________¶_____¶¶
_______¶¶_____________¶¶¶______¶_____¶¶
_¶¶¶¶¶_¶¶_____________¶_¶______¶_____¶¶
_¶¶¶¶¶_¶______________¶________¶______¶_¶¶¶¶
¶¶¶¶¶¶¶¶______________¶________¶______¶¶¶¶_¶
_¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶

_________________§§§§§§§§__________§§_____§§
_______________§§________§§_______§§§§___§§§§
_____________§§__§§§§§§§§__§§______§§_____§§
____________§§__§§______§§__§§______§§___§§
___________§§__§§___§§§__§§__§§_____§§§§§
___________§§__§§__§__§__§§__§§_____ §§§§§
___________§§__§§__§§___§§§__§§_____§§§§§
___________§§__§§___§§§§§§__§§_____§§§§§§
____________§§__§§_________§§_____§§§§§§
_______§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
___§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
___§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§

___________________$$$$$$$$
_________________$$$_$$$$$_$$
_______________$$$$$$$$$_$$$$$$
_____________$$$$$_$$$_$$$_$$$$$
__$$$$$$____$$$$_$$$_$$$_$$$_$$$$
_$¶_$¶_$$$_$$$_$$$_$$$_$$$_$$$_$$$
_$______$_$$_$$$_$$$_$$$_$$$_$$$_$$$__$$
__$_$__$__$$$$_$$$_$$$_$$$_$$$_$$$$$$_$$
___$$$_$$$$$$$$$$$$$$$$$_$$$$$$$$$$$$$
____________$$$$$$$_$$$$$$$_$_$$$$
__________$$_$___$$_$____$$_$___$_$
_________$$$$$__$$$$$___$$$$$__$$$$$
*/
