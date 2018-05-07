import java.io.*;

public class Tider implements Serializable{

   private static double time;
   private static String name;
   
   /// getters
   public static String getName(){
      return name;
   }
   
   public static double getTime(){
      return time;
   }
   
   /// constructor
   public Tider(double tid, String navn){
      name = navn;
      time = tid;
   }
   
   // print metode
   public static void print(){
      System.out.println("Time: "+time+"  -  "+name);
   }
   
   
}
