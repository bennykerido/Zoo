import javazoom.jl.player.Player;

import javax.swing.*;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class Bird extends Animal {

    private double wingSpan, flightHeight;

    public Bird(String name, double age, boolean isApexPredator, int caloriesPerMeal, double wingSpan, double flightHeight){
        super(name, age, isApexPredator, caloriesPerMeal);
        setWingSpan(wingSpan);
        setFlightHeight(flightHeight);
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(double flightHeight) {
        this.flightHeight = flightHeight;
    }

    public int eat(){
        return super.eat()/10;
    }

    public void sing(String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            Player playMP3 = new Player(fis);
            playMP3.play();

        }  catch(Exception e){
            System.out.println(e);
        }
    }

    public String toString(){
        return super.toString() +" | Wingspan: " +wingSpan + " | Flight Height: "+flightHeight;
    }

    public void dance() {
        try {
            String path = String.valueOf(Bird.class.getClassLoader().getResource("Bird.class"));
            path = path.substring(0,path.length()-30)+"/gifs/bird.gif";
            URL url = new URL(path);
            Icon icon = new ImageIcon(url);
            JLabel label = new JLabel(icon);

            JFrame f = new JFrame("\uD83C\uDF7A Hold my beer... \uD83C\uDF7A");
            f.getContentPane().add(label);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
