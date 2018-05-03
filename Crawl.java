public class Crawl{

   private double time;
   private boolean chosen = false;
   
   public Crawl(boolean lol){
      chosen = lol;
   }
   
   public void setTime(double time){
      this.time = time;
   }
   
   public double getTime(){
      return time;
   }
   
   public void setChosen(){
      chosen = true;
   }
   
   public boolean getChosen(){
      return chosen;
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