import javazoom.jl.player.*;
import java.io.FileInputStream;

public class Kestrel extends Bird{

    private int noOfKills;

    public Kestrel(String name, double age, int caloriesPerMeal, double wingSpan, double flightHeight, int noOfKills){
        super(name, age, true, caloriesPerMeal, wingSpan, flightHeight);
        setNoOfKills(noOfKills);
    }

    public Kestrel(String name){
        this(    name,
                Math.random()*3.0+1.0,
                (int)(Math.random()*600)+100,
                (Math.random()*1)+1.0,
                (Math.random()*100)+2.0,
                (int)(Math.random()*20));
    }

    public int getNoOfKills() {
        return noOfKills;
    }

    public void setNoOfKills(int noOfKills) {
        this.noOfKills = noOfKills;
    }

    public void sing(){
        super.sing("sounds/Kestrel.mp3");
    }

    public String toString(){
        return super.toString() + " | Specie: Kestrel | Kills#: " + noOfKills;
    }
}
