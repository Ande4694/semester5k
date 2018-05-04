import java.util.*;
import java.io.*;

public class Back implements Serializable{

   private double time;
   private boolean chosen = false;
   
   private ArrayList<Double> backTimes = new ArrayList<>();
   
   public void setBackTime(double time){
      backTimes.add(time);
   }
   
   public ArrayList<Double> getBackTimes(){
      return backTimes;
   }
   
   public Back(boolean lol){
      chosen = lol;      
   }
   
   public void setTime(double time){
      this.time = time;
   }
   
   public void setBackChosen(boolean chosen){
      this.chosen = chosen;
   }
   
   public double getTime(){
      return time;
   }
   
   public boolean getChosen(){
      return chosen;
   }
   
   public void setChosen(){
      chosen = true;
   }
   
   public void setUnChosen(){
      this.chosen = false;
   }
   
   public Back(double time){
      this.time = time;
   }

}