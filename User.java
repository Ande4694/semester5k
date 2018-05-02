import java.io.*;
import java.util.*;

public class User{

   private String username;
   private String password;
   private boolean trainer = false;
   private boolean admin = false;
   private boolean cashier = false;
   
   public User(String username, String password){
      this.username = username;
      this.password = password;
   }
   
   public void setPassword(String password){
      this.password = password;
   }
   
   public void setUsername(String username){
      this.username = username;
   }
   
   public String getUsername(){
      return username;
   }
   
   public String getPassword(){
      return password;
   }
   
   public boolean getTrainer(){
      return trainer;
   }
   
   public boolean getAdmin(){
      return admin;
   }
   
   public boolean getCashier(){
      return cashier;
   }
   
   public void SetTrainer(boolean trainer){
      this.trainer = trainer;
   }
   
   public void SetAdmin(boolean admin){
      this.admin = admin;
   }
   
   public void SetCashier(boolean cashier){
      this.cashier = cashier;
   }


}