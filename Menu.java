import java.io.*;
import java.util.*;

public class Menu implements Serializable{

   private static ArrayList<Members> listOfMembers = new ArrayList<>();
   private static ArrayList<Members> competetiveMembers = new ArrayList<>();
   private static ArrayList<Members> activeMembers = new ArrayList<>();
   private static ArrayList<Members> membersInArrear = new ArrayList<>();
   private static ArrayList<Members> breastSwimmers = new ArrayList<>();
   private static ArrayList<Members> backSwimmers = new ArrayList<>();
   private static ArrayList<Members> crawlSwimmers = new ArrayList<>();
   private static User[] listOfAdmins = new User[3];
   private static ArrayList<Tider> crawlTider = new ArrayList<>();
   private static ArrayList<Tider> backTider = new ArrayList<>();
   private static ArrayList<Tider> breastTider = new ArrayList<>();
      
   public static void main (String[] args)throws IOException, ClassNotFoundException{
   
      fillMembers();
      fillDivList();
      login();
   }
   
   public static void addMember(){
      Scanner scan = new Scanner(System.in);
      boolean choice = true;
      int option;
      boolean tempAct = false;
      boolean tempComp = false;
      boolean tempCrawl = false;
      boolean tempBack = false;
      boolean tempBreast = false;
      boolean tempPayed = false;
      int anualFee = 1600;
      System.out.print("Please enter the age of new member: ");
      int tempAge = antiJarl();
      System.out.println();
      System.out.print("Please enter the name of the new member: ");
      String tempName = scan.nextLine();
      System.out.println("Is the member status competetiv or recreation?");
      System.out.println("1: Competetiv\n2: Recreation");
      while(choice){
         option = antiJarl();
         switch(option){
            case 1:
               tempComp = true;
               choice = false;
               break;
               
            case 2:
               tempComp = false;
               choice = false;
               break;
               
            default : 
               System.out.println("Please choose either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to be active or passive\n1: Active\n2: Passive");
      while (choice){
         option = antiJarl();
         switch(option){
            case 1:
               tempAct = true;
               choice = false;
               break;
               
            case 2:
               tempAct = false;
               choice = false;
               break;
               
            default : 
               System.out.println("Please choose either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the crawl team?\n1: Yes\n2: No");
      while (choice){
         option = antiJarl();
         switch(option){
            case 1:
               tempCrawl = true;
               choice = false;
               break;
               
            case 2:
               tempCrawl = false;
               choice = false;
               break;
            
            default : 
               System.out.println("Please choose either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the breast team?\n1: Yes\n2: No");
      while (choice){
         option = antiJarl();
         switch(option){
            case 1:
               tempBreast = true;
               choice = false;
               break;
               
            case 2:
               tempBreast = false;
               choice = false;
               break;
            
            default : 
               System.out.println("Please choose either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the back team?\n1: Yes\n2: No");
      while (choice){
         option = antiJarl();
         switch(option){
            case 1:
               tempBack = true;
               choice = false;
               break;
            case 2:
               tempBack = false;
               choice = false;
               break;
            
            default : 
               System.out.println("Please choose either 1 or 2.");
         }
      }
      if (!tempAct){
         anualFee = 500;
      }
      if (tempAge<18){
         anualFee = 1000;
      }
      if (tempAge>60){
         anualFee -= (anualFee*0.75);
      }
      System.out.println("The anual fee for the new member is "+anualFee+"\nDoes "+tempName+" wish to pay now?\n1: Pay now\n2: Pay later");
      choice = true;
      while (choice){
         option = antiJarl();
         switch(option){
            case 1:
               tempPayed = true;
               choice = false;
               break;
            
            case 2:
               tempPayed = false;
               choice = false;
               break;
            
            default : 
               System.out.println("Please choose either 1 or 2.");
         }
      }
      
      Members member = new Members(tempAge, tempName, tempAct, tempComp, tempPayed);
      if(tempBack){
         member.setBackChosen();
      } else {
         member.setBackUnChosen();
      }
      if(tempCrawl){
         member.setCrawlChosen();
      } else {
         member.setCrawlUnChosen();
      }
      if(tempBreast){
         member.setBreastChosen();
      } else {
         member.setBreastUnChosen();
      }
      
      listOfMembers.add(member);
      if(tempAct){
         activeMembers.add(member);
      }
      if(tempComp){
         competetiveMembers.add(member);
      }
      if(tempCrawl){
         crawlSwimmers.add(member);
      }
      if(tempBack){
         backSwimmers.add(member);
      }
      if(tempBreast){
         breastSwimmers.add(member);
      }
      if(!tempPayed){
         membersInArrear.add(member);
      }
      System.out.println("Member created");
   }
   
   public static void adminMemberMenu(){
      System.out.println("1: Delete member");
      System.out.println("2: Register member payment");
      System.out.println("3: Set member to active");
      System.out.println("4: Set member to competetive");
      System.out.println("5: Set breast active");
      System.out.println("6: Set crawl active");
      System.out.println("7: Set back active");
      System.out.println("0: Back");
   }

   public static void menuPromptStart(){
      System.out.println("1: Login");
      System.out.println("0: Exit");
   }
   
   public static void memberListMenu(){
      System.out.println("1: View all member");
      System.out.println("2: View competetiv");
      System.out.println("3: View active");
      System.out.println("4: View back");
      System.out.println("5: View crawl");
      System.out.println("6: View breast");
      System.out.println();
      System.out.println("0: Back");
   }
   
   public static void timeMenu(){
      System.out.println("1: View back time");
      System.out.println("2: View crawl time");
      System.out.println("3: View breast time");
      System.out.println();
      System.out.println("0: Back");
   }
   
   public static void menuCase(){
      if(User.getTrainer()){
         System.out.println("1: Change password");
         System.out.println("2: Register Time");
         System.out.println("3: Times");
         System.out.println("4: Members");
         System.out.println();
         System.out.println("5: Log off");
         System.out.println("0: Close System");
      }
      else if (User.getAdmin()){
         System.out.println("1: Change password");
         System.out.println("2: Create new Member");
         System.out.println("3: View restance");
         System.out.println("4: Members");
         System.out.println("5: Administrate member");
         System.out.println();
         System.out.println("6: Log off");
         System.out.println("0: Close System");
      }
      else if (User.getCashier()){
         System.out.println("1: Change password");
         System.out.println("2: Members");
         System.out.println();
         System.out.println("3: Log off");
         System.out.println("0: Close System");
      }
   }

   public static void trainerCase()throws IOException, ClassNotFoundException{
      boolean choice = true;
      int option;
      Scanner scan = new Scanner(System.in);
      
      menuCase();
      while (choice){
      
         option = antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               changedPassword();
               menuCase();
               break;
         
            case 2:
               System.out.println("Register Time");
               regTime();
               menuCase();
               break;
         
            case 3:
               System.out.println("Times");
               timeCase();
               break;
               
            case 4:
               System.out.println("Members\n");
               memberCase();
               break;
         
            case 5:
               System.out.println("Trainer is now logged off");
               User.setTrainer(false);
               restart();
               break;
            
            case 0:
               System.out.println("Closing System");               
               saveMembers();
               System.exit(0);
               break;
               
            default:
               System.out.println("Wrong input, try again");
               memberCase();
               break;
         }
      }
   
   }
   
   //Admin
   public static void adminCase()throws IOException, ClassNotFoundException{
      boolean choice = true;
      int option;

      menuCase();
      while (choice){
      
         option = antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               changedPassword();
               menuCase();
               break;
         
            case 2:
               System.out.println("Create new Member");
               addMember();
               menuCase();
               break;
         
            case 3:
               System.out.println("View restance:");
               viewArrears();
               menuCase();
               break;
               
            case 4:
            
               System.out.println("Members\n");
               memberCase();
               break;
         
            case 5:
               System.out.println(" Administrate member");
               adminMember();
               menuCase();
               break;
               
            case 6:
               System.out.println("Admin is now logged off");
               User.setAdmin(false);
               restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               saveMembers();
               System.exit(0);
               break;
               
            default:
               System.out.println("Wrong input, try again");
               memberCase();
               break;
         }
      }
   
   } 
   
   //Cashier
   public static void cashierCase()throws IOException, ClassNotFoundException{
      boolean choice = true;
      int option;
      
      menuCase();
      while (choice){
      
         option = antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("Change password");
               changedPassword();
               menuCase();
               break;
            
            case 2:
               System.out.println("Members\n");
               memberCase();
               break;
         
            case 3:
               System.out.println("Cashier is now logged off");
               User.setCashier(false);
               restart();
               break;
            
            case 0:
               System.out.println("Closing System");
               saveMembers();
               System.exit(0);
               break;
               
            default:
               System.out.println("Wrong input, try again");
               memberCase();
               break;
         }
      }
   
   }
   
   public static void timeCase()throws IOException{
     
      boolean choice = true;
      int option;
      timeMenu();
      while (choice){
      
         option = antiJarl();
             
         switch(option){
                       
            case 1:
               System.out.println("View back times");
               viewBackTimes();
               timeMenu();
               break;
            
            case 2:
               System.out.println("View crawl times");
               viewCrawlTimes();
               timeMenu();
               break;
         
            case 3:
               System.out.println("View breast times");
               viewBreastTimes();
               timeMenu();
               break;
               
            case 0:
               System.out.println("Going back");
               choice = false;
               menuCase();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               timeMenu();
               break;
         }
      }
   
   }
   
   public static void memberCase()throws IOException{
     
      boolean choice = true;
      int option;
      memberListMenu();
      while (choice){
      
         option = antiJarl();
             
         switch(option){
                       
            case 1:
               viewAllMembers();
               memberListMenu();
               break;
            
            case 2:
               viewCompetetive();
               memberListMenu();
               break;
         
            case 3:
               viewActive();
               memberListMenu();
               break;
            
            case 4:
               viewBackSwimmers();
               memberListMenu();
               break;
               
            case 5:
               viewCrawlSwimmers();
               memberListMenu();
               break;
               
            case 6:
               viewBreastSwimmers();
               memberListMenu();
               break;
               
            case 0:
               System.out.println("Going back");
               choice = false;
               menuCase();
               break;
               
            default:
               System.out.println("Wrong input, try again");
               memberCase();
               break;
         }
      }
   }
   
   public static void addTimeMenu(){
      System.out.println("1: Crawl");
      System.out.println("2: Back");
      System.out.println("3: Breast");
   }
   
     
   public static void regTime()throws IOException{
      Scanner input = new Scanner(System.in);
      boolean choice = true;
      int whichMember;
      int option;
      System.out.println("To register a swim time please select a member.");
      for(int i = 0; i<listOfMembers.size();i++){
         System.out.println("Member :"+i+" - "+listOfMembers.get(i).getName());
      }
      whichMember = antiJarl();
      if(whichMember<0 || whichMember>listOfMembers.size()){
         System.out.println("Are you trying to provoke an Index.OutOfBounds.Exception?... naughty naughty");
      } else {
         System.out.println("Now you need to select which disciplin you wish to register a swim time to.");
         addTimeMenu();
        // choice = true;
         while (choice){
            option = antiJarl();
            switch(option){
            
               case 1:
               
                  if(listOfMembers.get(whichMember).getCrawlChosen()){
                     System.out.print("Enter time: ");
                     double time = antiJarlDouble();
                     String temp = listOfMembers.get(whichMember).getName();
                     Tider tid = new Tider(time,temp);
                     crawlTider.add(tid);
                     Collections.sort(crawlTider);
                     System.out.println("Time registered\n");
                  } else {
                     System.out.println("This member is not active in Crawl");
                  }
                  choice = false;   
                  break;
                  
               case 2:
               
                  if(listOfMembers.get(whichMember).getBackChosen()){
                     System.out.print("Enter time: ");
                     double time = antiJarlDouble();
                    String temp2 = listOfMembers.get(whichMember).getName();
                     Tider tid2 = new Tider(time, temp2);
                     backTider.add(tid2);
                     Collections.sort(backTider);
                     System.out.println("Time registered\n");
                  } else {
                     System.out.println("This member is not active in Back");
                  }
                  choice = false;
                  break;
                  
               case 3:
               
                  if(listOfMembers.get(whichMember).getBreastChosen()){
                     System.out.print("Enter time: ");
                     double time = antiJarlDouble();
                     String temp3 = listOfMembers.get(whichMember).getName();
                     Tider tid3 = new Tider(time, temp3);
                     breastTider.add(tid3);
                     Collections.sort(breastTider);
                     System.out.println("Time registered\n");
                  } else {
                     System.out.println("This member is not active in Breast");
                  }
                  choice = false;
                  break;
                  
               default:
               
                  System.out.println("It was pretty clear that you only had 3 options...");
                  break;
            }
         }
      }
   }
   
   public static void saveMembers()throws IOException, ClassNotFoundException{
      FileOutputStream fos = new FileOutputStream("members.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(listOfMembers);
      oos.close();
      fos.close();
      saveBreast();
      saveBack();
      saveCrawl();
   }
   
   public static void saveBreast()throws IOException, ClassNotFoundException{
      FileOutputStream fos = new FileOutputStream("breast.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(breastTider);
      oos.close();
      fos.close();
   }
   
   public static void saveCrawl()throws IOException, ClassNotFoundException{
      FileOutputStream fos = new FileOutputStream("crawl.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(crawlTider);
      oos.close();
      fos.close();
   }
   
   public static void saveBack()throws IOException, ClassNotFoundException{
      FileOutputStream fos = new FileOutputStream("back.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(backTider);
      oos.close();
      fos.close();
   }
   
   public static void fillBack()throws IOException, ClassNotFoundException{
      FileInputStream fis = new FileInputStream("back.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      backTider = (ArrayList<Tider>) ois.readObject();
      ois.close();
      fis.close();      
   }
   
   public static void fillBreast()throws IOException, ClassNotFoundException{
      FileInputStream fis = new FileInputStream("breast.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      breastTider = (ArrayList<Tider>) ois.readObject();
      ois.close();
      fis.close();      
   }
   
   public static void fillCrawl()throws IOException, ClassNotFoundException{
      FileInputStream fis = new FileInputStream("crawl.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      crawlTider = (ArrayList<Tider>) ois.readObject();
      ois.close();
      fis.close();      
   }
   
   public static void fillMembers()throws IOException, ClassNotFoundException{
      File f = new File("members.ser");
      if(f.canRead()){
         FileInputStream fis = new FileInputStream("members.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);
         listOfMembers = (ArrayList<Members>) ois.readObject();
         ois.close();
         fis.close(); 
         fillCrawl();
         fillBack();
         fillBreast(); 
         System.out.println("Members loaded from file\n");
      } else {
         System.out.print("No members saved in file\n");
      }         
   }
   
   public static void fillDivList(){
      for(int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getBackChosen()){
            backSwimmers.add(listOfMembers.get(i));
         }
      }
      for(int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getCrawlChosen()){
            crawlSwimmers.add(listOfMembers.get(i));
         }
      }
      for(int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getBreastChosen()){
            breastSwimmers.add(listOfMembers.get(i));
         }
      }
      for(int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getPayed()){
            membersInArrear.add(listOfMembers.get(i));
         }
      }
      for(int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getActive()){
            activeMembers.add(listOfMembers.get(i));
         }
      }
      for(int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getCompetetive()){
            competetiveMembers.add(listOfMembers.get(i));
         }
      }
   }
   
   public static void viewBreastTimes(){
      int option;
      System.out.println("There are "+breastTider.size()+" registered times.\nHow many do you want to see?");
      option = antiJarl();
      if(option<0 || option>breastTider.size()){
         System.out.println("Are you trying to provoke an IndexOutOfBoundsException??");
      }
      for(int i = 0; i<breastTider.size();i++){
         breastTider.get(i).print();
      }
   }
   
   public static void viewBackTimes(){
      int option;
      System.out.println("There are "+backTider.size()+" registered times.\nHow many do you want to see?");
      option = antiJarl();
      if(option<0 || option>backTider.size()){
         System.out.println("Are you trying to provoke an IndexOutOfBoundsException??");
      }
      for(int i = 0; i<backTider.size();i++){
         backTider.get(i).print();
      }
   }
   
   public static void viewCrawlTimes(){
      int option;
      System.out.println("There are "+crawlTider.size()+" registered times.\nHow many do you want to see?");
      option = antiJarl();
      if(option<0 || option>crawlTider.size()){
         System.out.println("Are you trying to provoke an IndexOutOfBoundsException??");
      }
      for(int i = 0; i<option;i++){
         crawlTider.get(i).print();
      }
   }
   
   public static void viewCompetetive(){
      for (int i = 0;i<competetiveMembers.size();i++){
         System.out.println(competetiveMembers.get(i).getName());
      }
   }
   
   public static void viewActive(){
      for (int i = 0;i<activeMembers.size();i++){
         System.out.println(activeMembers.get(i).getName());
      }
   }
   
   public static void viewArrears(){
      for (int i = 0;i<listOfMembers.size();i++){
         if(listOfMembers.get(i).getPayed()==false){
            System.out.println(listOfMembers.get(i).getName());
         }
      }
   }
   
   public static void viewAllMembers(){
      for(int i = 0;i<listOfMembers.size();i++){
         String text = "["+listOfMembers.get(i).getName()+", "+listOfMembers.get(i).getAge()+", ";
         if(listOfMembers.get(i).getActive()){
            text = text + "Active, ";
         } else {
            text = text + "Passive, ";
         }
         if(listOfMembers.get(i).getCompetetive()){
            text = text + "Competetive, ";
         } else {
            text = text + "Recreation, ";
         }
         if (listOfMembers.get(i).getCrawlChosen()){
            text = text + "Crawl - active, ";
         } else {
            text = text +"Crawl - inactive; ";
         }
         if (listOfMembers.get(i).getBackChosen()){
            text = text +"Back - active, ";
         } else {
            text = text +"Back - inactive, ";
         }
         if (listOfMembers.get(i).getBreastChosen()){
            text = text +"Breast - active]";
         } else {
            text = text +"Breast - inactive]\n";
         }
         System.out.println(text);
      }
   }
   

   //// view all back swimmers
   public static void viewBackSwimmers(){
      for (int i = 0;i<backSwimmers.size();i++){
         System.out.println(backSwimmers.get(i).getName());
      } 
   }

   /// view all crawl swimmers
   public static void viewCrawlSwimmers(){
      for (int i = 0;i<crawlSwimmers.size();i++){
         System.out.println(crawlSwimmers.get(i).getName());
      } 
   }

   ///view all breast swimmer
   public static void viewBreastSwimmers(){
      for (int i = 0;i<breastSwimmers.size();i++){
         System.out.println(breastSwimmers.get(i).getName());
      } 
   }

   //////////////////administrate member////////////////////
   public static void adminMember()throws IOException{

     // Scanner input = new Scanner(System.in);


      // Scanner input = new Scanner(System.in);

      boolean choice;
      int option;
      System.out.println("Please select a member.");
      for(int i = 0; i<listOfMembers.size();i++){
         System.out.println("Member :"+i+" - "+listOfMembers.get(i).getName());
      }
      int whichMember2 = antiJarl();
      if(whichMember2<0 || whichMember2>listOfMembers.size()){
         System.out.println("Are you trying to provoke an Index.OutOfBounds.Exception?... naughty naughty");
      } else {
         adminMemberMenu();
         choice = true;
         while (choice){
            option = antiJarl();
            switch(option){
            
               case 1:
                  System.out.println(listOfMembers.get(whichMember2).getName()+" removed");
                  listOfMembers.remove(whichMember2);
                  choice = false;   
                  break;
                  
               case 2:
                  /// PAY
                  if(listOfMembers.get(whichMember2).getPayed()){
                     System.out.println(listOfMembers.get(whichMember2).getName()+" has already payed.");
                  } else {
                     listOfMembers.get(whichMember2).setPayed(true);
                     System.out.println(listOfMembers.get(whichMember2).getName()+" has now payed.");
                  }
                  choice = false;
                  break;
                  
               case 3:
                  /// ACTIVE / INACTIVE
                  if(listOfMembers.get(whichMember2).getActive()){
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is already active.");
                  } else {
                     listOfMembers.get(whichMember2).setActive(true);
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is now active.");
                  }
                  choice = false;
                  break;
                
               case 4:
                  // set competetiv / recreation
                  if(listOfMembers.get(whichMember2).getCompetetive()){
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is already competetive.");
                  } else {
                     listOfMembers.get(whichMember2).setCompetetive(true);
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is now competetiv.");
                  }
                  choice = false;
                  break;
                  
               case 5:
                  // set breast active/unactiv
                  if(listOfMembers.get(whichMember2).getBreastChosen()){
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is already active in breast.");
                  } else {
                     listOfMembers.get(whichMember2).setBreastChosen();
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is now active in breast.");
                  }
                  choice = false;
                  break;
               
               case 6:
                  // set crawl active/unactive
                  if(listOfMembers.get(whichMember2).getCrawlChosen()){
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is already active in crawl.");
                  } else {
                     listOfMembers.get(whichMember2).setCrawlChosen();
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is now active in crawl.");
                  }
                  choice = false;
                  break;
               
               case 7:
                  // set back active/unactive
                  if(listOfMembers.get(whichMember2).getBackChosen()){
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is already active in back.");
                  } else {
                     listOfMembers.get(whichMember2).setBackChosen();
                     System.out.println(listOfMembers.get(whichMember2).getName()+" is now active in back.");
                  }
                  choice = false;
                  break;    
                  
               case 0 :
                  choice = false;
                  break;
                  
               default:
                  System.out.println("It was pretty clear that you only had 3 options...");
                  break;
            }
         }
      }
   }

   public static void login() throws IOException, ClassNotFoundException{
      String username;
      String password; 
      File f = new File("Logins.txt");
      
      BufferedReader bs = new BufferedReader(new FileReader(f));
   
   
      boolean trainer = false;
      boolean admin = false;
      boolean cashier = false;
      
   
   
      User loggedInUser = null;
       
   
      if (bs.readLine() != null){
         System.out.println("Logins loaded from file\n");
         int count = 0;
         Scanner go = new Scanner(f);
         while(go.hasNext() && count < 3){
            String name;
            String pass;
            name = go.next();
            pass = go.next();
            listOfAdmins[count] = new User (name,pass); 
            count++;    
         }
      }else{
         System.out.println("Logins are hardcoded\n");
         listOfAdmins[0] = new User("Trainer","1234");
         listOfAdmins[1] = new User("Admin","7894");
         listOfAdmins[2] = new User("Cashier","1337");  
      }
        
   
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
      Scanner input = new Scanner(br);
        
       
      System.out.println("*** Grp 5000 Delphinen - Admin.System ***\n");
        
      menuPromptStart();
   
      int choice1; 
      do{
         choice1 = antiJarl();
         switch(choice1){
         
            case 1:
               break;     
            case 0:
               System.out.println("Have a nice day!");
               System.exit(0);
               break;
         
            default:
               System.out.println("Please chose 1 or 0.");
               break;
         
         }
      }while(choice1 !=1);
         
         
   
      System.out.print("Please type your Username* : ");
      username = br.readLine();   
      System.out.print("Please type your Password* : ");
      password = br.readLine();
   
      try{
         for (User user : listOfAdmins)
         {
         
            if (user.getUsername().equals(username))
            {
               
               if (user.getPassword().equals(password))
               {
                    
                  loggedInUser = user;
                  if (loggedInUser == listOfAdmins[0]){
                     trainer = true;
                     User.setTrainer(true);
                  }
                  else if (loggedInUser == listOfAdmins[1]){
                     User.setAdmin(true);
                  }
                  else if (loggedInUser == listOfAdmins[2]){
                     User.setCashier(true);
                  }
               
                  break;
               }
            }
         }
      }catch(Exception e){
         System.out.println("Password did not match, try again.");
      }
   
      if (loggedInUser != null)
      {
         System.out.println("\nUser successfully logged in: "+loggedInUser.getUsername()+"\n");
         
         if (User.getTrainer()){
            trainerCase();
         }
         else if (User.getAdmin()){
            adminCase();
         }
         else if (User.getCashier()){
            cashierCase();
         }else{
            System.out.println("Not working");
         }
      }
        
      else
      {
         System.out.println("Invalid username or password");
         restart();
      }
   }
   
   public static int antiJarl(){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println("Not an integer, try again Jarl..");
      }
      return input.nextInt();     
   }
   
   public static double antiJarlDouble(){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextDouble()) {
         input.next();
         System.out.println("Not an double, try again Jarl..");
      }
      return input.nextDouble();     
   }
   
   public static void changedPassword()throws IOException{
      File f = new File("Logins.txt");
      int UserCount = 0;
      if(User.getTrainer() == true){
         UserCount = 0;
      }else if (User.getAdmin() == true){
         UserCount = 1;
      }else if (User.getCashier() == true){
         UserCount = 2;
      }
      Scanner Ps = new Scanner(System.in);
      boolean go = true;
      FileWriter fw = new FileWriter(f);
      while(go){
         System.out.print("Please Enter your Password: ");
         String pass = Ps.next();
         if( pass.equals(listOfAdmins[UserCount].getPassword())){
            System.out.print("Type new Password: ");
            pass = Ps.next();
            System.out.print("Please type Password again: ");
            
            if(pass.equals(Ps.next())){
               if(User.getTrainer() == true){
                  fw.write(listOfAdmins[0].getUsername()+"   "+pass);
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[1].getUsername()+"   "+listOfAdmins[1].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[2].getUsername()+"   "+listOfAdmins[2].getPassword());
                  fw.close();
               }else if(User.getAdmin() == true){
                  fw.write(listOfAdmins[0].getUsername()+"   "+listOfAdmins[0].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[1].getUsername()+"   "+pass);
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[2].getUsername()+"   "+listOfAdmins[2].getPassword());
                  fw.close();
               }else if (User.getCashier() == true){
                  fw.write(listOfAdmins[0].getUsername()+"   "+listOfAdmins[0].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[1].getUsername()+"   "+listOfAdmins[1].getPassword());
                  fw.write(System.lineSeparator());
                  fw.write(listOfAdmins[2].getUsername()+"   "+pass);
                  fw.close();
               }
               System.out.println("Your new password is: "+pass+"\n");
            
               go = false;
            }else{
               System.out.println("Your password did not match");
            }
         }else{
            System.out.println("Wrong Password");
         }
      }
   }
   
   public static void restart()throws IOException, ClassNotFoundException{
      main(new String[0]);
   }

}