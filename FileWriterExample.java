import java.io.*;

public class FileWriterExample{
   public static void main (String[]args)throws IOException{
   
   File f = new File("data/tester.txt");
   FileWriter fw = new FileWriter("data/tester.txt", true);
   PrintWriter pw = new PrintWriter(fw);
 //FileWrtier fw = new FileWriter("data/tester.txt", boolean append);
 // https://stackoverflow.com/questions/12350248/java-difference-between-filewriter-and-bufferedwriter
  
   
   
   fw.write("BLA BLA");
   fw.write(System.lineSeparator());
   fw.close();
   
   pw.print("BLA BLA");
   
   ///////////
   BufferedWriter bf = new BufferedWriter(fw);
   bf.close();
   bf.write("BLA BLA");
   
   }


}