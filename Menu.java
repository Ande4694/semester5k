import java.io.*;
import java.util.*;

public class Menu{

   public static void menuPromptStart(){
      System.out.println("1: Login");
      System.out.println("0: Exit");
   }

   public static void TrainerMenu(){
   
      System.out.println("1: Change password");
      System.out.println("2: Register Time");
      System.out.println("3: View Times");
      System.out.println("4: View member");
      System.out.println();
      System.out.println("5: log off");
      System.out.println("0: Close System");
   }
   public static void AdminMenu(){
      System.out.println("1: Change password");
      System.out.println("2: Create new Member");
      System.out.println("3: View restance");
      System.out.println("4: View member");
      System.out.println("5: Administrate member");
      System.out.println();
      System.out.println("6: log off");
      System.out.println("0: Close System");
   }
   public static void CashierMenu(){
      System.out.println("1: Change password");
      System.out.println("2: View member");
      System.out.println();
      System.out.println("3: log off");
      System.out.println("0: Close System");
   }
   
   public static void TrainerCase()throws IOException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      TrainerMenu();
      while (choice){
      
         option = SvømmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               TrainerMenu();
               break;
         
            
            case 2:
               System.out.println("Register Time");
               TrainerMenu();
               break;
         
            
            case 3:
               System.out.println("View Times");
               TrainerMenu();
               break;
               
            case 4:
               System.out.println("View member");
               TrainerMenu();
               break;
         
            case 5:
               System.out.println("Trainer is now logged off");
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
      
      AdminMenu();
      while (choice){
      
         option = SvømmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               AdminMenu();
               break;
         
            
            case 2:
               System.out.println("Create new Member");
               AdminMenu();
               break;
         
            
            case 3:
               System.out.println("View restance");
               AdminMenu();
               break;
               
            case 4:
               System.out.println("View member");
               AdminMenu();
               break;
         
            case 5:
               System.out.println(" Administrate member");
               AdminMenu();
               break;
               
            case 6:
               System.out.println("Admin is now logged off");
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
      
      CashierMenu();
      while (choice){
      
         option = SvømmeklubbenDelphinen.antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               CashierMenu();
               break;
            
            case 2:
               System.out.println("View member");
               CashierMenu();
               break;
         
            case 3:
               System.out.println("Cashier is now logged off");
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