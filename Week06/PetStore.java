package Week06;
import java.util.Objects;
import java.util.Scanner;

public class PetStore {
    final static int MAX_ANIMAL_NUMBER = 10;
    private int animalCounter = 0;
    Animal[] animals = new Animal[MAX_ANIMAL_NUMBER];

    Scanner sc = new Scanner(System.in);
    public void addAnimal(Animal animal) {
        if(animalCounter < MAX_ANIMAL_NUMBER && animal != null){
            animals[animalCounter] = animal;
            this.animalCounter++;
        }
        else{
            System.out.println("Owner can not have more animal!");
        }
    }

    public void sortAnimalsByAge(){
        Animal temp;
        Animal lowest;
        int lowestIndex;
        for (int i = 0; i < animalCounter; i++){
            lowestIndex = i;
            lowest = animals[i];
            for (int j = (i + 1); j < animalCounter; j++){
                if(lowest.getAge() >= animals[j].getAge()){
                    lowest = animals[j];
                    lowestIndex = j;
                }
            }
            temp = animals[lowestIndex];
            animals[lowestIndex] = animals[i];
            animals[i] = temp;
        }
    }

    public void adoptingAnimal(){
        System.out.println("Do you want to adopt any animal(Yes/No)?: ");
        String str = sc.nextLine();

        if(Objects.equals(str, "Yes")){
            System.out.println("\nWhich animal you want to adopt(by number)?: ");
            int num1 = sc.nextInt();
            System.out.println("\n\n\n\n\n\nThank You for adopting " + animals[num1-1].getName() + ".\n");
        }
        else{
            System.out.println("\nThank You for visiting our Store.");
            System.exit(0);
        }
    }

    public void petAnimal(){
        System.out.println("Do you want to pet any animal(Yes/No)?: ");
        String str = sc.nextLine();

        if(Objects.equals(str, "Yes")){
            System.out.println("\nWhich animal you want to pet(by number)?: ");
            int num = sc.nextInt();
            System.out.println(animals[num-1].getSound());
            adoptingAnimal();
        }
        else{
            adoptingAnimal();
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("\nAvailable Animals: \n------------------ \n");
        for(int i = 0; i < animalCounter; i++ ){
            text.append("" + (i + 1) + "- ");
            text.append(animals[i]).append("\n");
        }
        return text.toString();
    }
}
