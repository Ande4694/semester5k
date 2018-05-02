import java.io.*;
import java.util.*;

public class User{

   private String username;
   private String password;
   private static boolean trainer = false;
   private static boolean admin = false;
   private static boolean cashier = false;
   
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
   
   public static boolean getTrainer(){
      return trainer;
   }
   
   public static boolean getAdmin(){
      return admin;
   }
   
   public static boolean getCashier(){
      return cashier;
   }
   
   public static void SetTrainer(boolean trainer1){
      trainer = trainer1;
   }
   
   public static void SetAdmin(boolean admin1){
      admin = admin1;
   }
   
   public static void SetCashier(boolean cashier1){
      cashier = cashier1;
   }


}