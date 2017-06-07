class trivialPursuit
{
// quit code 
  public static void proQuit(String getMenu)
  {
      if (getMenu.equals ("0"))

        
        System.exit(0);
}
  
// Print rules method
  public static void rulesPrint(String getMenu, String goBack)
  {
    if(getMenu.equals  ("Play") || getMenu.equals  ("play"))
      System.out.println("To go back to Main menu please enter Main");
      System.out.println("This game is to be played with two players");
      System.out.println();
      System.out.println("Their are points given to player depending on the hardness of the question");
  }
  {
      goBack = In.getString();
      if (goBack.equals ("Main") || goBack.equals ("main"))
       
      
  }
  
// Main method    
  public static void main (String[] args)
  {
    String goBack = "";
    String getMenu = "";
    // Main menu
    System.out.println("Welcome to Trivial Pursuit");
    System.out.println("");  
    System.out.println("PLAY(To play the game enter Play)");
    System.out.println("RULES(To see rules enter Rules)");
    System.out.println("QUIT(To quit enter 0)");
    System.out.println("");

    getMenu = In.getString();
    proQuit(getMenu);
    rulesPrint(getMenu);
  }
}
