package Week06;

public class task06Main {
    public static void main(String[] args){
        Owner john = new Owner("John");

        Mammal cat = new Mammal("Whiskers", 3, "orange");
        Mammal dog = new Mammal("Fido", 5, "brown");
        Reptile lizard = new Reptile("Spike", 2, true);

        john.addAnimal(cat);
        john.addAnimal(dog);
        john.addAnimal(lizard);

        System.out.println(john);
    }
}
