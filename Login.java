import java.io.*;
import java.util.*;

public class Login{

   

   public static void login1() throws IOException{
      String username;
      String password; 
   
      User loggedInUser = null;
       
      User[] listOfAdmins = new User[4];       
        
      listOfAdmins[0] = new User("Trainer","1234");
      listOfAdmins[1] = new User("Admin","7894");
      listOfAdmins[2] = new User("Cashier","1337");
        
   
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
      Scanner input = new Scanner(System.in);
        
       
      System.out.println("*** Grp 5000 Delphinen - Admin.System ***\n");
        
      Menu.menuPromptStart();
   
      while (!input.hasNextInt()) {
         input.next();
         System.out.println("Not an integer; try again.\nNice try Jarl...");
      }
   
      int choice1; 
      do{
         choice1 = Login.antiJarl();
         switch(choice1){
         
            case 1:
               break;     
            case 0:
               System.out.println("Have a nice day!");
               System.exit(0);
               break;
         
            default:
               System.out.println("Not an integer; try again.");
               break;
         
         }
      }while(choice1 !=1);
         
         
   
      System.out.print("Please type your Username* : ");
      username = br.readLine();   
      System.out.print("Please type your Password* : ");
      password = br.readLine();
   
      try{
         for (User user : listOfAdmins)
         {
         
            if (user.getUsername().equals(username))
            {
               
               if (user.getPassword().equals(password))
               {
                    
                  loggedInUser = user;
                  if (loggedInUser == listOfAdmins[1]){
                     user.SetTrainer(true);
                     if (loggedInUser == listOfAdmins[2]){
                        user.SetAdmin(true);
                        if (loggedInUser == listOfAdmins[3]){
                           user.SetCashier(true);
                        }
                     }
                  }
               
                  break;
               }
            }
         }
      }catch(Exception e){
         System.out.println("Password did not match, try again.");
      }
   
      if (loggedInUser != null)
      {
         System.out.println("\nUser successfully logged in: "+loggedInUser.getUsername()+"\n");
      }
        
      else
      {
         System.out.println("Invalid username or password");
         SvømmeklubbenDelphinen.restart();
      }
      
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      Menu.AdminMenu();
     
      while (choice){
      
         option = Login.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("");
               Menu.AdminMenu();
               break;
            
            case 2:
               System.out.println("");
               Menu.AdminMenu();
               break;
            
            case 3:
               System.out.println("");
               Menu.AdminMenu();
               break;
               
            case 4:
               System.out.println("");
               Menu.AdminMenu();
               break;
            
            case 5:
               System.out.println("");
               Menu.AdminMenu();
               break;
               
            case 6:
               System.out.println(loggedInUser.getUsername()+" has logged off");
               SvømmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("");
               choice = false;
               break;
                  
         
         }
      }
   }


   
   
   /*public static void menuPromptStart(){
      System.out.println("1: Login");
      System.out.println("2: Create Account");
      System.out.println();
      System.out.println("0: Exit");
   }*/
   
   public static int antiJarl(){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println("Not an integer, try again Jarl..");
      }
      return input.nextInt();
      
   }
   
   public static void antiJarlCustom(String text){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println(text);
      }
      
   }
   
}