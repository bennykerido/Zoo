public class Crocodile extends Reptile{

    private boolean isTeethTreated;

    public Crocodile(String name, double age, int caloriesPerMeal, double tailLength, boolean isTeethTreated){
        super(name, age, true, caloriesPerMeal, tailLength);
        setTeethTreated(isTeethTreated);
    }

    public Crocodile(String name){
        this(name,
                Math.random()*3.0+1.0,
                (int)(Math.random()*600)+100,
                (Math.random()*300)+50,
                (int)(Math.random()) == 1);
    }

    public boolean isTeethTreated() {
        return isTeethTreated;
    }

    public void setTeethTreated(boolean teethTreated) {
        isTeethTreated = teethTreated;
    }

    public int eat(){
        return isTeethTreated ? super.eat():super.eat()/3;
    }
}
