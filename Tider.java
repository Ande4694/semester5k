public class Tider{

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
   //// TID SKAL HELST V�RE DOUBLE!!!!!
   public Tider(double tid, String navn){
      name = navn;
      time = tid;
   }
   
   /// potentielt sort metode?
}