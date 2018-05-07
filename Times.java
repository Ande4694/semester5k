public class Times{

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
   public Times(double tid, String navn){
      name = navn;
      time = tid;
   }
   
   /// potentielt sort metode?
}