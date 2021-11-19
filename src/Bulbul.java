public class Bulbul extends Bird{

    private int noOfInsects;

    public Bulbul(String name, double age, int caloriesPerMeal, double wingSpan, double flightHeight, int noOfInsects){
        super(name, age, false, caloriesPerMeal, wingSpan, flightHeight);
        setNoOfInsects(noOfInsects);
    }
    public Bulbul(String name){
        this(    name,
                Math.random()*3.0+1.0,
                (int)(Math.random()*600)+100,
                (Math.random()*1)+0.15,
                (Math.random()*50)+2.0,
                (int)(Math.random()*20));
    }
    public int getNoOfInsects() {
        return noOfInsects;
    }

    public void setNoOfInsects(int noOfInsects) {
        this.noOfInsects = noOfInsects;
    }

    public void sing(){
        super.sing("sounds/Bulbul.mp3");
    }

    public String toString(){
        return super.toString() + " | Specie: Bulbul | Insects#: " + noOfInsects;
    }
}
