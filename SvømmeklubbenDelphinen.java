import java.io.*;
import java.util.*;

public class SvømmeklubbenDelphinen{

   public static void main (String[] args)throws IOException{
   
   
      Run();
      
   }
   
 
   public static void Run() throws IOException{
      String username;
      String password; 
      Member member = new Member();
      boolean trainer = false;
      boolean admin = false;
      boolean cashier = false;

   
      User loggedInUser = null;
       
      User[] listOfAdmins = new User[4];       
        
      listOfAdmins[0] = new User("Trainer","1234");
      listOfAdmins[1] = new User("Admin","7894");
      listOfAdmins[2] = new User("Cashier","1337");
        
   
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
      Scanner input = new Scanner(br);
        
       
      System.out.println("*** Grp 5000 Delphinen - Admin.System ***\n");
        
      Menu.menuPromptStart();
   
      int choice1; 
      do{
         choice1 = antiJarl();
         switch(choice1){
         
            case 1:
               break;     
            case 0:
               System.out.println("Have a nice day!");
               System.exit(0);
               break;
         
            default:
               System.out.println("Please chose 1 or 2.");6
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
                  if (loggedInUser == listOfAdmins[0]){
                     trainer = true;
                  }
                  else if (loggedInUser == listOfAdmins[1]){
                     admin = true;
                  }
                  else if (loggedInUser == listOfAdmins[2]){
                     cashier = true;
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
         
         if (trainer == true){
            Menu.TrainerCase();
         }
         else if (admin == true){
            Menu.AdminCase();
         }
         else if (cashier == true){
            Menu.CashierCase();
         }else{
            System.out.println("Not working");
         }
      
      }
        
      else
      {
         System.out.println("Invalid username or password");
         restart();
      }
   
   
           
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      Menu.AdminMenu();
     
      while (choice){
      
         option = antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("List");
               Menu.AdminMenu();
               break;
            
            case 2:
               member.addMember();
               Menu.AdminMenu();
               break;
            
            case 3:
               System.out.println("Edit");
               Menu.AdminMenu();
               break;
               
            case 4:
               System.out.println("Remove");
               Menu.AdminMenu();
               break;
            
            case 5:
               System.out.println("Team list");
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
   public static void restart()throws IOException{
      main(new String[0]);
   }
}
