public class Breast{

   private double time;
   private boolean chosen = false;
   
   public void setTime(double time){
      this.time = time;
   }
   
   public void setBreastChosen(boolean chosen){
      this.chosen = chosen;
   }
   
   public double getTime(){
      return time;
   }
   
   public boolean getChosen(){
      return chosen;
   }
   
   public void setChosen(){
      this.chosen = true;
   }
   
   public void setUnChosen(){
      this.chosen = false;
   }
   
   public Breast(double time){
      this.time = time;
   }

}