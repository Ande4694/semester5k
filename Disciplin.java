import java.util.ArrayList;

public interface Disciplin{
   
   public void addTime(double tid);
   public void setChosen();
   public void setUnChosen();
   public ArrayList<Double> getTime();
   public boolean getChosen();


}