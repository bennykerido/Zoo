public class Cow extends Mammal{

    private int noOfBirths;

    public Cow(String name, double age, int caloriesPerMeal, int caloriesInMilk, int pregnancyMonths, int noOfBirths){
        super(name, age, false, caloriesPerMeal, caloriesInMilk, pregnancyMonths);
        setNoOfBirths(noOfBirths);
    }

    public Cow(String name){
        this(    name,
                Math.random()*3.0+1.0,
                (int)(Math.random()*600)+100,
                (int)(Math.random()*300)+50,
                (int)(Math.random()*12)+3,
                (int)(Math.random()*11)+0);
    }

    public int getNoOfBirths() {
        return noOfBirths;
    }

    public void setNoOfBirths(int noOfBirths) {
        this.noOfBirths = noOfBirths;
    }

    public int eat(){
        return super.eat()/4;
    }

}
