import java.io.*;
import java.util.*;

public class Member implements Serializable{
 
   private static int age;
   private static String name;
   private static boolean active;
   private static boolean junior = age<18; 
   private static boolean competetive;
   private static boolean olding = age>60;
   private static Back back;
   private static Breast breast;
   private static Crawl crawl;
   private static boolean payed;
   private static ArrayList<Double> swimTimes = new ArrayList<Double>();
   private static ArrayList<Member> listOfMembers = new ArrayList<Member>();
   private static ArrayList<Member> breastSwimmers = new ArrayList<>();
   private static ArrayList<Member> backSwimmers = new ArrayList<>();
   private static ArrayList<Member> crawlSwimmers = new ArrayList<>();
   private static ArrayList<Member> membersInArrear = new ArrayList<>();
   private static ArrayList<Member> competetiveMembers = new ArrayList<>();
   private static ArrayList<Member> activeMembers = new ArrayList<>();
   private static int anualFee = 1600;
   
   public static void addCrawlTime(){
      if(crawl.getChosen() == true){
         System.out.print("Enter time: ");
         double time = antiJarlDouble();
         crawl.setCrawlTime(time);
         System.out.println("Time registered");
      } else {
         System.out.println("this member is not active in Crawl");
      }
   }
   
   public static void addBackTime(){
      if(back.getChosen() == true){
         System.out.print("Enter time: ");
         double time = antiJarlDouble();
         back.setBackTime(time);
         System.out.println("Time registered");
      } else {
         System.out.println("this member is not active in Back");
      }
   }
   
   public static void addBreastTime(){
      if(breast.getChosen() == true){
         System.out.print("Enter time: ");
         double time = antiJarlDouble();
         breast.setBreastTime(time);
         System.out.println("Time registered");
      } else {
         System.out.println("this member is not active in Breast");
      }
   }
   
   public static void addTimeMenu(){
      System.out.println("1: Crawl");
      System.out.println("2: Back");
      System.out.println("3: Breast");
      System.out.println("0: Go back");
   }
   
   public static void addTime()throws IOException{
      // loops til at vælge hvilken disc man vil reg tid i
      System.out.println("Now you need to select which disciplin you wish to register a swim time to.");
      addTimeMenu();
      boolean choice = true;
      int option;
      while (choice){
         option = antiJarl();
         switch(option){
            
               case 1:
                  addCrawlTime();
                  choice = false;   
                  break;
                  
               case 2:
                  addBackTime();
                  choice = false;
                  break;
                  
               case 3:
                  addBreastTime();
                  choice = false;
                  break;
                  
               case 0 :
                  regTime();
                  choice = false;
                  break;
                  
               default:
                  System.out.println("It was pretty clear that you only had 3 options...");
                  break;
         }
      }
   }
   
   public static void regTime()throws IOException{
      //File f = new File("");
      //Scanner sc = new Scanner(f);
      Scanner input = new Scanner(System.in);
      boolean choice;
      int option;
      int whichMember;
      System.out.println("To register a swim time please select a member.");
      for(int i = 0; i<listOfMembers.size();i++){
         System.out.println("Member :"+i+" - "+listOfMembers.get(i).getName());
      }
      whichMember = antiJarl();
      if(whichMember<0 || whichMember>listOfMembers.size()){
         System.out.println("Are you trying to provoke an Index.OutOfBounds.Exception?... naughty naughty");
      } else {
         listOfMembers.get(whichMember).addTime();
      }
      // gem lortet
      // load lortet
      // view lortet
      // view (top) af lortet
   }
   
   public static void saveMembers()throws IOException, ClassNotFoundException, NotSerializableException{
      FileOutputStream fos = new FileOutputStream("members.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(listOfMembers);
      oos.close();
      fos.close();
      
   }
   
   public static void fillMembers()throws IOException, ClassNotFoundException{
      FileInputStream fis = new FileInputStream("members.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      listOfMembers = (ArrayList<Member>)ois.readObject();////////////////////////////////////////
      ois.close();
      fis.close();
      
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public static int getAge(){
      return age;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public static boolean getArrear(){
      return payed;
   }
   
   public static String getName(){
      return name;
   }
   
   public static boolean getPayed(){
      return payed;
   }
   
   public boolean getJunior(){
      return junior;
   }
   
   public boolean getActive(){
      return active;
   }
   
   public boolean getComp(){
      return competetive;
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
   
   public static void addMember(){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner scan = new Scanner(br);
      boolean choice = true;
      int option;
      boolean tempAct = false;
      boolean tempComp = false;
      boolean tempCrawl = false;
      boolean tempBack = false;
      boolean tempBreast = false;
      boolean tempPayed = false;
      System.out.print("Please enter the age of new member: ");
      int tempAge = SvømmeklubbenDelphinen.antiJarl();
      System.out.println();
      System.out.print("Please enter the name of the new member: ");
      String tempName = scan.nextLine();
      System.out.println("Is the member status competetiv or recreation?");
      System.out.println("1: competetiv\n2: recreation");
      while(choice){
         option = SvømmeklubbenDelphinen.antiJarl();
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
               System.out.println("please choice either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to be active or passive\n1: Active\n2: passive");
      while (choice){
         option = SvømmeklubbenDelphinen.antiJarl();
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
               System.out.println("please choice either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the crawl team?\n1: yes\n2: no");
      while (choice){
         option = SvømmeklubbenDelphinen.antiJarl();
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
               System.out.println("please choice either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the breast team?\n1: yes\n2: no");
      while (choice){
         option = SvømmeklubbenDelphinen.antiJarl();
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
               System.out.println("please choice either 1 or 2.");
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the back team?\n1: yes\n2: no");
      while (choice){
         option = SvømmeklubbenDelphinen.antiJarl();
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
               System.out.println("please choice either 1 or 2.");
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
      System.out.println("The anual fee for the new member is "+anualFee+"\nDoes "+tempName+" wish to pay now?\n1: pay now\n2: pay later");
      choice = true;
      while (choice){
         option = SvømmeklubbenDelphinen.antiJarl();
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
               System.out.println("please choice either 1 or 2.");
         }
      }
      Member member = new Member(tempAge, tempName, tempAct, tempComp, tempCrawl, tempBack, tempBreast, tempPayed);
      listOfMembers.add(member);
      System.out.println("Member created");
      
      
   }
   
   public static ArrayList<Member> viewAll(){
      return listOfMembers;
   } 

   public static String viewAge(){
      String text = "";
      for(int i = 0; i<listOfMembers.size();i++){
         text = text + listOfMembers.get(i).getName() +" - age: "+ listOfMembers.get(i).getAge();
      }
      return text;
   }
   
   public static ArrayList<Member> viewCompetetive(){
      for (Member member : listOfMembers){
         if(member.getComp()){
            competetiveMembers.add(member);
         }
      }
      return competetiveMembers;
   }
   
   public static ArrayList<Member> viewActive(){
      for (Member member : listOfMembers){
         if(member.getActive()){
            activeMembers.add(member);
         }
      }
      return activeMembers;
   }
   
   public static ArrayList<Member> viewBreast(){
      for (Member member : listOfMembers){
         if(member.breast.getChosen()){
            breastSwimmers.add(member);
         }
      }
      return breastSwimmers;
   }
   
   public static ArrayList<Member> viewBack(){
      for (Member member : listOfMembers){
         if(member.back.getChosen()){
            backSwimmers.add(member);
         }
      }
      return backSwimmers;
   }
   
   public static ArrayList<Member> viewCrawl(){
      for (Member member : listOfMembers){
         if(member.crawl.getChosen()){
            crawlSwimmers.add(member);
         }
      }
      return crawlSwimmers;
   }
   
   public static ArrayList<Member> viewArrears(){
      for (Member member : listOfMembers){
         if(member.getArrear()){
            membersInArrear.add(member);
         }
      }
      return membersInArrear;
   }

   

   public static String viewMember(){
      for (int i = 0;i<listOfMembers.size();i++){
      
      
      String text = "["+listOfMembers.get(i).getName()+", "+listOfMembers.get(i).getAge()+", ";
      if(listOfMembers.get(i).active){
         text = text + "Active, ";
      } else {
         text = text + "Passive, ";
      }
      if(listOfMembers.get(i).competetive){
         text = text + "Competetive, ";
      } else {
         text = text + "Recreation, ";
      }
      if (listOfMembers.get(i).crawl.getChosen()){
         text = text + "Crawl - active, ";
      } else {
         text = text +"Crawl - inactive; ";
      }
      if (listOfMembers.get(i).back.getChosen()){
         text = text +"Back - active, ";
      } else {
         text = text +"Back - inactive, ";
      }
      if (listOfMembers.get(i).breast.getChosen()){
         text = text +"Breast - active]";
      } else {
         text = text +"Breast - inactive]\n";
      }
      return text;
      }
      return "No members.";
   }
   

   public Member(int age, String name, boolean active, boolean competetive, boolean crawl, boolean back, boolean breast, boolean payed){
      this.age = age;
      this.name= name;
      this.active = active;
      this.competetive = competetive;
      if(back){
         this.back = new Back(true);
      } else {
         this.back = new Back(false);
      }
      if(crawl){
         this.crawl = new Crawl(true);
      } else {
         this.crawl = new Crawl(false);
      }
      if(breast){
         this.breast = new Breast(true);
      } else {
         this.breast = new Breast(false);
      }
      this.payed = payed;
   }
   
   public Member(){
   }
   
   public static int antiJarl(){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println("Not an integer, try again Jarl..");
      }
      return input.nextInt();
      
   }
   
   public static int antiJarlDouble(){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextDouble()) {
         input.next();
         System.out.println("Not an integer, try again Jarl..");
      }
      return input.nextInt();
      
   }
   

}