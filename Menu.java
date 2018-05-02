import java.io.*;
import java.util.*;

public class Menu{

   public static void menuPromptStart(){
      System.out.println("1: Login");
      System.out.println("0: Exit");
   }

   public static void MenuCase(){
      if(User.getTrainer() == true){
         System.out.println("1: Change password");
         System.out.println("2: Register Time");
         System.out.println("3: View Times");
         System.out.println("4: View member");
         System.out.println();
         System.out.println("5: log off");
         System.out.println("0: Close System");
      }
      else if (User.getAdmin() == true){
         System.out.println("1: Change password");
         System.out.println("2: Create new Member");
         System.out.println("3: View restance");
         System.out.println("4: View member");
         System.out.println("5: Administrate member");
         System.out.println();
         System.out.println("6: log off");
         System.out.println("0: Close System");
      }
      else if (User.getCashier() == true){
         System.out.println("1: Change password");
         System.out.println("2: View member");
         System.out.println();
         System.out.println("3: log off");
         System.out.println("0: Close System");
      }
   }
   
   public static void TrainerCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      MenuCase();
      while (choice){
      
         option = SvømmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               if(User.getTrainer() == true){
                  System.out.println("Change password");
                  MenuCase();
               }else{System.out.println("HEJ");
               }
               break;
         
            case 2:
               System.out.println("Register Time");
               MenuCase();
               break;
         
            case 3:
               System.out.println("View Times");
               MenuCase();
               break;
               
            case 4:
               System.out.println("View member");
               MenuCase();
               break;
         
            case 5:
               System.out.println("Trainer is now logged off");
               User.SetTrainer(false);
               SvømmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               choice = false;
               break;
         }
      }
   
   } 
   
   public static void AdminCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      MenuCase();
      while (choice){
      
         option = SvømmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               MenuCase();
               break;
         
            case 2:
               System.out.println("Create new Member");
               Member.addMember();
               MenuCase();
               break;
         
            case 3:
               System.out.println("View restance");
               MenuCase();
               break;
               
            case 4:
               System.out.println("View member");
               MenuCase();
               break;
         
            case 5:
               System.out.println(" Administrate member");
               MenuCase();
               break;
               
            case 6:
               System.out.println("Admin is now logged off");
               User.SetAdmin(false);
               SvømmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               choice = false;
               break;
         }
      }
   
   } 
   
   public static void CashierCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      MenuCase();
      while (choice){
      
         option = SvømmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               MenuCase();
               break;
            
            case 2:
               System.out.println("View member");
               MenuCase();
               break;
         
            case 3:
               System.out.println("Cashier is now logged off");
               User.SetCashier(false);
               SvømmeklubbenDelphinen.restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               choice = false;
               break;
         }
      }
   
   } 
 

}