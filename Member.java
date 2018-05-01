import java.io.*;
import java.util.*;

public class Member{
   
   private String name;
   private int age;
   private Disciplin disc;
   private boolean payedFee;
   
   public void setPayFeeTrue(){
      payedFee = true;
   }
   
   public void setPayFeeFalse(){
      payedFee = false;
   }
   
   //public void setDisciplin(){
      //
   //}
   
   public void setName(String name){
      this.name = name;
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public int getAge(){
      return age;
   }
   
   public String getName(){
      return name;
   }
   
   //public Disciplin getDisc(){
     // return Disciplin;
   //}
   
   public boolean getPayStatus(){
      return payedFee;
   }

}