import java.io.*;
import java.util.*;

public class FillList{

public static ArrayList<String> list = new ArrayList<String>();

public static void fillList(){
   File f = new File("eksempel.txt");
   try{
      Scanner sc = new Scanner(f);  
      System.out.println("loading list");
      while(sc.hasNextLine()){
         String text = sc.nextLine();
         list.add(text);
      }
      } catch (Exception e){
         System.out.println("file not found");
      }
   System.out.println("list loaded");
}

   public static void main (String[]args)throws IOException{
      System.out.println(list);
      fillList();
      System.out.println(list);

   }
}