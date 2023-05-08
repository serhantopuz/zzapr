package Week06;

public class Owner {
    final static int MAX_ANIMAL_NUMBER = 10;
    private String name;
    private int animalCounter = 0;
    Animal[] animals = new Animal[MAX_ANIMAL_NUMBER];

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        if(animalCounter < MAX_ANIMAL_NUMBER && animal != null){
            animals[animalCounter] = animal;
            this.animalCounter++;
        }
        else{
            System.out.println("Owner can not have more animal!");
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(this.name + " owns: \n------------------ \n");
        for(int i = 0; i < animalCounter; i++ ){
            text.append(animals[i]).append("\n");
        }
        return text.toString();
    }
}
