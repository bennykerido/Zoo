import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Park {
    private Animal[] animals = new Animal[1000];
    private int noOfAnimals;

    public boolean addAnimal(String myClassName,String name){
        if(noOfAnimals < animals.length)
        {
            try {
                Class<?> myClass = Class.forName(myClassName);
                Constructor<?> ctr = myClass.getConstructor(String.class);
                Object object = ctr.newInstance(new Object[] { name });
                animals[noOfAnimals++] = (Animal) object;
                return true;
            } catch (ClassNotFoundException e) {
                return false;
            } catch (InvocationTargetException e) {
                return false;
            } catch (NoSuchMethodException e) {
                return false;
            } catch (InstantiationException e) {
                return false;
            } catch (IllegalAccessException e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public Animal[] getAnimals(){
        Animal[] allAnimals = new Animal[noOfAnimals];
        for(int i = 0; i < noOfAnimals; i++){
            allAnimals[i] = animals[i];
        }
        return allAnimals;
    }

    public void showAnimals(){
        for(int i = 0; i < noOfAnimals; i++){
            System.out.println(animals[i]);
        }
    }

    public Animal[] getAdultsPredators(){
        int counter = 0;
        for (int i = 0; i < noOfAnimals; i++){
            if(animals[i].getAge() >= 10.0 && animals[i].getApexPredator()){
                counter++;
            }
        }
        if(counter > 0){
            Animal[] sendBack = new Animal[counter];
            for(int i = 0, j = 0; i < noOfAnimals; i++){
                if(animals[i].getAge() >= 10.0 && animals[i].getApexPredator()){
                    sendBack[j++] = animals[i];
                }
            }
            return sendBack;
        }
        return null;
    }

    public int getReptilesAndBirdsPredators(){
        int counter = 0;
        for (int i = 0; i < noOfAnimals; i++) {
            if(animals[i] instanceof Reptile){
                if(((Reptile) animals[i]).getApexPredator()){
                    counter++;
                }
            } else if(animals[i] instanceof Bird){
                if(((Bird) animals[i]).getApexPredator()){
                    counter++;
                }
            }
        }
        return counter;
    }

}
