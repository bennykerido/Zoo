public class Calf extends Cow{
    public Calf(String name, double age, int caloriesPerMeal, int caloriesInMilk, int pregnancyMonths, int noOfBirths){
        super(name, age, caloriesPerMeal, caloriesInMilk, pregnancyMonths, noOfBirths);
    }

    public int eat(){
        return super.eat()/2;
    }

    public Calf(String name){
        this(    name,
                Math.random()*3.0+1.0,
                (int)(Math.random()*600)+100,
                (int)(Math.random()*300)+50,
                0,
                0);
    }

}
