public class Hipo extends Mammal {

    private int fatPrecentage;

    public Hipo(String name, double age, boolean isApexPredator, int caloriesPerMeal, int caloriesInMilk, int pregnancyMonths, int fatPrecentage){
        super(name, age, isApexPredator, caloriesPerMeal, caloriesInMilk, pregnancyMonths);
        setFatPrecentage(fatPrecentage);
    }

    public Hipo(String name){
        this(name,
                Math.random()*3.0+1.0,
                false,
                (int)(Math.random()*600)+100,
                (int)(Math.random()*300)+50,
                (int)(Math.random()*12)+3,
                (int)(Math.random()*70)+1);
    }

    public int getFatPrecentage() {
        return fatPrecentage;
    }

    public void setFatPrecentage(int fatPrecentage) {
        this.fatPrecentage = fatPrecentage;
    }
}
