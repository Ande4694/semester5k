import java.io.*;
import java.util.*;

public class Member{
 
   private static int age;
   private static String name;
   private static boolean active;
   private static boolean junior = age<18; 
   private static boolean competetive;
   private static boolean olding = age>60;
   private Disciplin disciplin;
   private static boolean payed;
   private ArrayList<Double> swimTimes = new ArrayList<Double>();
   private static ArrayList<Member> listOfMembers = new ArrayList<Member>();
   private static int anualFee = 1600;
   
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
   
   public boolean getPayed(){
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
   
   public void setDisciplinCrawl(){
      disciplin.setCrawlChosen();
   }
   
   public void setDisciplinBack(){
      disciplin.setBackChosen();
   }
   
   public void setDisciplinBreast(){
      disciplin.setBreastChosen();
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
      int tempAge = antiJarl();
      System.out.println();
      System.out.print("Please enter the name of the new member: ");
      String tempName = scan.nextLine();
      System.out.println("Is the member status competetiv or recreation?");
      System.out.println("1: competetiv\n2: recreation");
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
         }
      }
      choice = true;
      System.out.println("Does the member wish to be active or passive\n1: Active\n2: passive");
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
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the crawl team?\n1: yes\n2: no");
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
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the breast team?\n1: yes\n2: no");
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
         }
      }
      choice = true;
      System.out.println("Does the member wish to join the back team?\n1: yes\n2: no");
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
            
         }
      }
      Member member = new Member(tempAge, tempName, tempAct, tempComp, tempCrawl, tempBack, tempBreast, tempPayed);
      listOfMembers.add(member);
      
      
   }
   
   // work in progress

   public static void viewMember(){
      String text = "["+name+", "+age+", ";
   }
   

   public Member(int age, String name, boolean active, boolean competetive, boolean crawl, boolean back, boolean breast, boolean payed){
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
   
   public static void antiJarlCustom(String text){
      Scanner input = new Scanner(System.in);      
      while (!input.hasNextInt()) {
         input.next();
         System.out.println(text);
      }
      
   }
}