public abstract class Animal {

    private String name;
    private double age;
    private boolean isApexPredator;
    private int caloriesPerMeal;

    public Animal(String name, double age, boolean isApexPredator, int caloriesPerMeal) {
        setName(name);
        setAge(age);
        setApexPredator(isApexPredator);
        setCaloriesPerMeal(caloriesPerMeal);
    }

    public int eat() {
        return caloriesPerMeal * 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean getApexPredator() {
        return isApexPredator;
    }

    public void setApexPredator(boolean predator) {
        isApexPredator = predator;
    }

    public int getCaloriesPerMeal() {
        return caloriesPerMeal;
    }

    public void setCaloriesPerMeal(int caloriesPerMeal) {
        this.caloriesPerMeal = caloriesPerMeal;
    }

    public String toString(){
        return name + " | Age: " + age + " | CPM: "+ caloriesPerMeal +" | CPD: "+eat()+" | " + (isApexPredator ? "Apex Predator":"Not a Predator");
    }

}
