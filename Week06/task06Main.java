package Week06;

public class task06Main {
    public static void main(String[] args){
        PetStore petStore = new PetStore();

        Cat cat1 = new Cat("Fido", 5, "brown", "male");
        Cat cat2 = new Cat("Fluffy", 2, "grey", "female");

        Dog dog1 = new Dog("Whiskers", 3, "orange", "male");
        Dog dog2 = new Dog("Bella", 1, "black", "female");
        Dog dog3 = new Dog("Max", 4, "white", "male");

        petStore.addAnimal(cat1);
        petStore.addAnimal(cat2);
        petStore.addAnimal(dog1);
        petStore.addAnimal(dog2);
        petStore.addAnimal(dog3);

        petStore.sortAnimalsByAge();
        System.out.println(petStore);

        petStore.petAnimal();


    }
}
