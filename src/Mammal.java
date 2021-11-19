public abstract class Mammal extends Animal{
    private int caloriesInMilk, pregnancyMonths;

    public Mammal(String name, double age, boolean isApexPredator, int caloriesPerMeal, int caloriesInMilk, int pregnancyMonths){
        super(name, age, isApexPredator,caloriesPerMeal);
        setCaloriesInMilk(caloriesInMilk);
        setPregnancyMonths(pregnancyMonths);
    }

    public int getCaloriesInMilk() {
        return caloriesInMilk;
    }

    public void setCaloriesInMilk(int caloriesInMilk) {
        this.caloriesInMilk = caloriesInMilk;
    }

    public int getPregnancyMonths() {
        return pregnancyMonths;
    }

    public void setPregnancyMonths(int pregnancyMonths) {
        this.pregnancyMonths = pregnancyMonths;
    }

    public int eat(){
        return super.eat() + this.caloriesInMilk;
    }

    public String toString(){
        return super.toString() + " | CIM: "+caloriesInMilk + " | Pregnancy Months: " + pregnancyMonths;
    }

}
