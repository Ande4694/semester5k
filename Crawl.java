import java.util.*;

public class Crawl{

   private double time;
   private boolean chosen = false;
   
   private ArrayList<Double> crawlTimes = new ArrayList<>();
   
   public ArrayList<Double> getCrawlTimes(){
      return crawlTimes;
   }
   // copy til de andre
   public void setCrawlTime(double time){
      crawlTimes.add(time);
   }
   
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