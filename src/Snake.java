import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Snake extends Reptile{


    private boolean isVenomus;

    public Snake(String name, double age, boolean isApexPredator, int caloriesPerMeal, double tailLength, boolean isVenomus){
        super(name, age, isApexPredator, caloriesPerMeal, tailLength);
        setVenomus(isVenomus);
    }

    public Snake(String name){
        this(name,
                Math.random()*3.0+1.0,
                (int)(Math.random()) == 1,
                (int)(Math.random()*600)+100,
                (Math.random()*300)+50,
                (int)(Math.random()) == 1);
    }

    public boolean isVenomus() {
        return isVenomus;
    }

    public void setVenomus(boolean venomus) {
        isVenomus = venomus;
    }

    public void dance() {
        try {
            String path = String.valueOf(Bird.class.getClassLoader().getResource("Snake.class"));
            path = path.substring(0,path.length()-31)+"/gifs/snake.gif";
            URL url = new URL(path);
            Icon icon = new ImageIcon(url);
            JLabel label = new JLabel(icon);

            JFrame f = new JFrame("\uD83D\uDC83 SHAKE IT \uD83D\uDC83");
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
