import java.io.*;
import java.util.*;

public class Members implements Serializable{

   //Attributer
   private int age;
   private String name;
   private boolean active;
   private boolean competetive;
   private boolean payed;
  
   
   // disciplins
   private Back back = new Back();
   private Breast breast = new Breast();
   private Crawl crawl = new Crawl();
   
   // ArrayLists
   //private ArrayList<Double> swimTimes = new ArrayList<Double>();



   
   // getters
   public ArrayList<Double> getBackTime(){
      return back.getTime();
   }
   
   public ArrayList<Double> getBreastTime(){
      return breast.getTime();
   }
   
   public ArrayList<Double> getCrawlTime(){
      return crawl.getTime();
   }
   
   public int getAge(){
      return age;
   }
   
   public String getName(){
      return name;
   }
   
   public boolean getActive(){
      return active;
   }
   
   public boolean getCompetetive(){
      return competetive;
   }
   
   public boolean getPayed(){
      return payed;
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
   
   // setters
   public void setAge(int age){
      this.age = age;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public void setActive(boolean active){
      this.active = active;
   }
   
   public void setCompetetive(boolean competetive){
      this.competetive = competetive;
   }
   
   public void setPayed(boolean payed){
      this.payed = payed;
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
   
   public void setCrawlChosen(){
      crawl.setChosen();
   }
   
   public void setCrawlUnChosen(){
      crawl.setUnChosen();
   }
   
   public void addCrawlTime(double tid){
      crawl.addTime(tid);
   }
   
   public void addBackTime(double tid){
      back.addTime(tid);
   }
   
   public void addBreastTime(double tid){
      breast.addTime(tid);
   }
   
   // constructors
   public Members(int age, String name, boolean active, boolean competetive, boolean payed){
      this.age = age;
      this.name = name;
      this.active = active;
      this.competetive = competetive;
      this.payed = payed;
     
   }


}