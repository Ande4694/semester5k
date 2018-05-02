public class Crawl{

   private double time;
   private boolean chosen = false;
   
   public void setTime(double time){
      this.time = time;
   }
   
   public double getTime(){
      return time;
   }
   
   public void setChosen(){
      this.chosen = true;
   }
   
   public void setCrawlChosen(boolean chosen){
      this.chosen = chosen;
   }
   
   public void setUnChosen(){
      this.chosen = false;
   }
   
   public Crawl(double time){
      this.time = time;
   }

}