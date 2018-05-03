import java.util.*;
import java.io.*;

public class Dummyclass{

public static void gemLogins(){
File f = new File("Logins.txt");
FileWriter fw = new FileWriter(f);
String trainerName = listOfAdmins[0].getUsername();
String trainerPass = listOfAdmins[0].getPassword();
String adminName = listOfAdmins[1].getUsername();
String adminPass = listOfAdmins[1].getPassword();
String cashierName = listOfAdmins[2].getUSername();
String cashierPass = listOfAdmins[2].getPassword();
//String text = ("%s   %s\n%s   %s\n%s   %s",trainerName, trainerPass, adminName, adminPass, cashierName, cashierPass);
fw.open();
fw.write(trainerName+"   "+trainerPass);
fw.write(System.lineSeparator());
fw.write(adminName+"   "+adminPass);
fw.write(System.lineSeparator());
fw.write(cashierName+"   "+cashierPass);
//fw.write(text);
fw.close();
}


}