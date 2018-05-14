import java.io.*;
import java.util.*;

public class Crawl extends Back{

   private ArrayList<Double> time = new ArrayList<>();
   private boolean chosen;
   
   public void addTime(double tid){
      super.addTime(tid);
   }
   
   public void setChosen(){
      super.setChosen();
   }  
   
   public void setUnChosen(){
      super.setUnChosen();
   }
   
   public ArrayList<Double> getTime(){
      return time;
   }
   
   public boolean getChosen(){
      return chosen;
   }
   
   public Crawl(boolean chosen){
      this.chosen = chosen;
   }
   
   public Crawl(){
   }

}