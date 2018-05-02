import java.io.*;
import java.util.*;

public class Member{
 
   private int age;
   private String name;
   private boolean active;
   private boolean junior = age>18; 
   private boolean competetive;
   private Disciplin disciplin;
   private boolean payed;
   private ArrayList<Double> swimTimes = new ArrayList<Double>();
   private int anualFee = 1600;
   
   public void setAge(int age){
      this.age = age;
   }
   
   public int getAge(){
      return age;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public String getName(){
      return name;
   }
   
   public void setActive(){
      active = true;
   }
   
   public void setPassive(){
      active = false;
   }
   
   public void setCompetetive(){
      competetive = true;
   }
   
   public void setRecreation(){
      competetive = false;
   }
   
   public void setDisciplinCrawl(){
      disciplin.setCrawlChosen();
   }
   
   public void setDisciplinBack(){
      disciplin.setBackChosen();
   }
   
   public void setDisciplinBreast(){
      disciplin.setBreastChosen();
   }
   
   public Member(int age, String name, boolean active, boolean competetive, boolean crawl, boolean back, boolean breast){
      this.age = age;
      this.name= name;
      this.active = active;
      this.competetive = competetive;
      if(crawl){
         disciplin.setCrawlChosen();
      } 
      if(back){
         disciplin.setBackChosen();
      }
      if(breast){
         disciplin.setBreastChosen();
      }
   }
}