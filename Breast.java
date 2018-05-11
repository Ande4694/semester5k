import java.io.*;
import java.util.*;

public class Breast implements Disciplin, Serializable{

   private ArrayList<Double> time = new ArrayList<>();
   private boolean chosen;
   
   public void addTime(double tid){
      time.add(tid);
   }
   
   public void setChosen(){
      chosen = true;
   }  
   
   public void setUnChosen(){
      chosen = false;
   }
   
   public ArrayList<Double> getTime(){
      return time;
   }
   
   public boolean getChosen(){
      return chosen;
   }
   
   public Breast(boolean chosen){
      this.chosen = chosen;
   }
   
   public Breast(){
   }

}