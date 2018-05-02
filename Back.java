public class Back{

   private double time;
   private boolean chosen = false;
   
   public void setTime(double time){
      this.time = time;
   }
   
   public void setBackChosen(boolean chosen){
      this.chosen = chosen;
   }
   
   public double getTime(){
      return time;
   }
   
   public void setChosen(){
      this.chosen = true;
   }
   
   public void setUnChosen(){
      this.chosen = false;
   }
   
   public Back(double time){
      this.time = time;
   }

}