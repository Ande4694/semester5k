import java.io.*;

public class Tider implements Serializable, Comparable<Tider>{

   private double time;
   private String name;
   
   /// getters
   public String getName(){
      return name;
   }
   
   public double getTime(){
      return time;
   }
   
   /// constructor
   public Tider(double tid, String navn){
      name = navn;
      time = tid;
   }
   
   // print metode
   public void print(){
      System.out.println("Time: "+time+"  -  "+name);
   }

   public int compareTo(Tider another){
      if(this.getTime()<another.getTime()){
         return -1;
      } else {
         return 1;
      }
   }
   
   
}
