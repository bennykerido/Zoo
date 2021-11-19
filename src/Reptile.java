public abstract class Reptile extends Animal{

    private double tailLength;

    public Reptile(String name, double age, boolean isApexPredator, int caloriesPerMeal, double tailLength){
        super(name, age, isApexPredator, caloriesPerMeal);
        setTailLength(tailLength);
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public String toString(){
        return super.toString() + " | Length of Tail: " + tailLength;
    }
}
