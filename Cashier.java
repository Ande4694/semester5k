import java.io.*;
import java.util.*;

public class Cashier{
   
   private String username;
   private String password;
   private boolean cashier = true;
   
   public Cashier(){
      username = "Hubert";
      password = "risengrød12";
   }
   
   public Cashier(String username, String password){
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

}