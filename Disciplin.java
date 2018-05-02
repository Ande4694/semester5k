public class Disciplin{

   private Crawl crawl;
   private Back back;
   private Breast breast;
   
   public Crawl getCrawl(){
      return crawl;
   }
   
   public Back getBack(){
      return back;
   }
   
   public boolean getBackChosen(){
      return back.getChosen();
   }
   
   public boolean getBreastChosen(){
      return breast.getChosen();
   }
   
   public boolean getCrawlChosen(){
      return crawl.getChosen();
   }
   
   public Breast getBreast(){
      return breast;
   }
   
   public void setCrawlTime(double time){
      crawl.setTime(time);
   }
   
   public void setBackTime(double time){
      back.setTime(time);
   }
   
   public void setBreastTime(double time){
      breast.setTime(time);
   }
   
   public void setCrawlChosen(){
      crawl.setChosen();
   }
   
   public void setCrawlUnChosen(){
      crawl.setUnChosen();
   }
   
   public void setBackChosen(){
      back.setChosen();
   }
   
   public void setBackUnChosen(){
      back.setUnChosen();
   }
   
   public void setBreastChosen(){
      breast.setChosen();
   }
   
   public void setBreastUnChosen(){
      breast.setUnChosen();
   }


}