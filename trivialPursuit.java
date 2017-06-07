class trivialPursuit
{
// quit code 
  public static void proQuit(String getMenu)
  {
      if (getMenu.equals ("0"))

        
        System.exit(0);
}
  
// Print rules method
  public static void rulesPrint()
  {
    
  }
  
// Main method    
  public static void main (String[] args)
  {
    // Main menu
    System.out.println("Welcome to Trivial Pursuit");
    System.out.println("");  
    System.out.println("PLAY(To play the game enter Play)");
    System.out.println("RULES(To see rules enter Rules)");
    System.out.println("QUIT(To quit enter 0)");
    System.out.println("");
    String getMenu = "";
    getMenu = In.getString();
    proQuit(getMenu);
  }
}