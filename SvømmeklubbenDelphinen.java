import java.io.*;
import java.util.*;

public class SvømmeklubbenDelphinen{

   private static User[] listOfAdmins = new User[3];
   private static File f = new File("Logins.txt"); 
   public static void main (String[] args)throws IOException{
   
   
      Run();
      
   }
   
 
   public static void Run() throws IOException{
      String username;
      String password; 
      
      BufferedReader bs = new BufferedReader(new FileReader(f));
      
      Member member = new Member();
      boolean trainer = false;
      boolean admin = false;
      boolean cashier = false;
      member.fillMembers();
   
   
      User loggedInUser = null;
       
   
      if (bs.readLine() != null){
         System.out.println("File");
         int count = 0;
         Scanner go = new Scanner(f);
         while(go.hasNext() && count <3){
            String name;
            String pass;
            name = go.next();
            pass = go.next();
            listOfAdmins[count] = new User (name,pass); 
            count++;    
         }
      }else{
         System.out.println("Hardcoded");
         listOfAdmins[0] = new User("Trainer","1234");
         listOfAdmins[1] = new User("Admin","7894");
         listOfAdmins[2] = new User("Cashier","1337");  
      }
        
   
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
               System.out.println("Please chose 1 or 0.");
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
                     User.SetTrainer(true);
                  }
                  else if (loggedInUser == listOfAdmins[1]){
                     User.SetAdmin(true);
                  }
                  else if (loggedInUser == listOfAdmins[2]){
                     User.SetCashier(true);
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
   
   
   
   
   
   
   
   
   
   
   public static void ChangedPassword()throws IOException{
      int UserCount = 0;
      if(User.getTrainer() == true){
         UserCount = 0;
      }else if (User.getAdmin() == true){
         UserCount = 1;
      }else if (User.getCashier() == true){
         UserCount = 2;
      }
      Scanner Ps = new Scanner(System.in);
      boolean go = true;
      FileWriter fw = new FileWriter(f);
      while(go){
         System.out.print("Please Enter your Password: ");
         String pass = Ps.next();
         if( pass.equals(listOfAdmins[UserCount].getPassword())){
            System.out.print("Type new Password: ");
            pass = Ps.next();
            System.out.print("Please type Password again: ");
            
            if(pass.equals(Ps.next())){
               if(User.getTrainer() == true){
                  fw.write(listOfAdmins[0].getUsername()+"   "+pass);
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[1].getUsername()+"   "+listOfAdmins[1].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[2].getUsername()+"   "+listOfAdmins[2].getPassword());
                  fw.close();
               }else if(User.getAdmin() == true){
                  fw.write(listOfAdmins[0].getUsername()+"   "+listOfAdmins[0].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[1].getUsername()+"   "+pass);
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[2].getUsername()+"   "+listOfAdmins[2].getPassword());
                  fw.close();
               }else if (User.getCashier() == true){
                  fw.write(listOfAdmins[0].getUsername()+"   "+listOfAdmins[0].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[1].getUsername()+"   "+listOfAdmins[1].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[2].getUsername()+"   "+pass);
                  fw.close();
               }
               System.out.println("Your new password is: "+pass+"\n");
            
               go = false;
            }else{
               System.out.println("Your password did not match");
            }
         }else{
            System.out.println("Worng Password");
         }
      }
   }
}
