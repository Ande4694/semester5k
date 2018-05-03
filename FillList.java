import java.io.*;
import java.util.*;

public class FillList{

   public static ArrayList<String> LoginList = new ArrayList<String>();

   public static void fillList(){
      File f = new File("Logins.txt");
      try{
         Scanner sc = new Scanner(f);  
         System.out.println("loading list");
         while(sc.hasNextLine()){
            String text = sc.nextLine();
            LoginList.add(text);
         }
      } catch (Exception e){
         System.out.println("file not found");
      }
      System.out.println("list loaded");
   }

      
   
   
   public static void ArrayLogin() throws IOException{
      String username;
      String password; 
      User loggedInUser = null;
      int Choise = 0;
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
      Scanner input = new Scanner(br);
      fillList();
   
      System.out.println("*** Grp 5000 Delphinen - Admin.System ***\n");
        
      Menu.menuPromptStart();
   
      System.out.print("Please type your Username* : ");
      username = br.readLine();   
      System.out.print("Please type your Password* : ");
      password = br.readLine();
   
      try{
         while (Choise != 1)
         {
         
            if (user.getUsername().equals(username))
            {
               
               if (user.getPassword().equals(password))
               {
                    
                  loggedInUser = user;
                  Choise = 1;
                  /*if (loggedInUser == listOfAdmins[0]){
                     trainer = true;
                     User.SetTrainer(true);
                 }
                  else if (loggedInUser == listOfAdmins[1]){
                     User.SetAdmin(true);
                  }
                  else if (loggedInUser == listOfAdmins[2]){
                     User.SetCashier(true);
                  }*/
               
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
         
         if (User.getTrainer() == true){
            Menu.TrainerCase();
         }
         else if (User.getAdmin() == true){
            Menu.AdminCase();
         }
         else if (User.getCashier() == true){
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
   
   
   }
   public static void main (String[]args)throws IOException{
      Scanner scan = new Scanner(System.in);
      System.out.println(LoginList);
      fillList();
      System.out.println(LoginList);
           
           

   
   
   
   
   }
}
   
   
   

   
   
   
   
   
   
   
   
