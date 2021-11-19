public class Main {

    public static void main(String[] agrs) {
        Bulbul b = new Bulbul(Names.getName());
        System.out.println();

        b.dance();
//        Park p = new Park();
//        p.addAnimal("Bulbul", Names.getName());
//        p.addAnimal("Kestrel", Names.getName());
//        p.addAnimal("Cow", Names.getName());
//        p.addAnimal("Snake", Names.getName());
//        System.out.println(p.getReptilesAndBirdsPredators());
//        makeThemSing(p.getAnimals());
//        shakeDatAss(p.getAnimals());
//        p.showAnimals();
//        System.out.println(totalCalories(p.getAnimals()));
    }

    public static void makeThemSing(Animal[] animals){
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                if (animal instanceof Kestrel) {
                    ((Kestrel) animal).sing();
                } else {
                    ((Bulbul) animal).sing();
                }
            }
        }
    }

    public static void shakeDatAss(Animal[] animals){
        for (Animal animal : animals) {
            if (animal instanceof Bird || animal instanceof Snake) {
                if (animal instanceof Kestrel) {
                    ((Kestrel) animal).dance();
                } else if (animal instanceof Bulbul) {
                    ((Bulbul) animal).dance();
                } else {
                    ((Snake) animal).dance();
                }
            }
        }
    }

    public static int totalCalories(Animal[] animals){
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.eat();
        }
        return sum;
    }

    public static String getFattestHipo(Animal[] animals){
        int index = -1;
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Hipo){
                if(index != -1){
                    index = i;
                } else if(((Hipo) animals[i]).getFatPrecentage() > ((Hipo)animals[index]).getFatPrecentage()){
                    index = i;
                }
            }
        }
        return index != -1 ? animals[index].getName():"There are no Hippos on that park!";
    }

}
