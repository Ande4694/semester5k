import java.io.*;
import java.util.*;

public class FillList{

   public static ArrayList<String> LoginList = new ArrayList<String>();

   public static void fillList(){
   System.out.println();
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

}
   
   
   

   
   
   
   
   
   
   
   
