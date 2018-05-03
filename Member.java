import java.io.*;
import java.util.*;

public class Member{
 
   private static int age;
   private static String name;
   private static boolean active;
   private static boolean junior = age<18; 
   private static boolean competetive;
   private static boolean olding = age>60;
   private static Disciplin disciplin;
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
   
   public boolean getCrawl(){
      return disciplin.getCrawlChosen();
   }
   
   public boolean getBack(){
      return disciplin.getBackChosen();
   }
   
   public boolean getBreast(){
      return disciplin.getBreastChosen();
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
            
         }
      }
      Member member = new Member(tempAge, tempName, tempAct, tempComp, tempCrawl, tempBack, tempBreast, tempPayed);
      listOfMembers.add(member);
      
      
   }
   
   public static ArrayList<Member> viewAll(){
      return listOfMembers;
   } 
   // work in progress
   public static void viewAge(){
      String text = "";
      for(int i = 0; i<listOfMembers.size();i++){
         //text =
      }
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
         if(member.disciplin.getBreastChosen()){
            breastSwimmers.add(member);
         }
      }
      return breastSwimmers;
   }
   
   public static ArrayList<Member> viewBack(){
      for (Member member : listOfMembers){
         if(member.getBack()){
            backSwimmers.add(member);
         }
      }
      return backSwimmers;
   }
   
   public static ArrayList<Member> viewCrawl(){
      for (Member member : listOfMembers){
         if(member.getCrawl()){
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
      String text = "["+getName()+", "+getAge()+", ";
      if(active){
         text = text + "Active, ";
      } else {
         text = text + "Passive, ";
      }
      if(competetive){
         text = text + "Competetive, ";
      } else {
         text = text + "Recreation, ";
      }
      if (disciplin.getCrawlChosen()){
         text = text + "Crawl - active, ";
      } else {
         text = text +"Crawl - inactive; ";
      }
      if (disciplin.getBackChosen()){
         text = text +"Back - active, ";
      } else {
         text = text +"Back - inactive, ";
      }
      if (disciplin.getBreastChosen()){
         text = text +"Breast - active]";
      } else {
         text = text +"Breast - inactive]";
      }
      return text;
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
   

}