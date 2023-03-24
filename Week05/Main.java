package Week05;

public class Main {
    public static void main(String[] args){
        Car car01 = new Car("Fiat", "500", 10000, 105000);
        Car car02 = new Car("Porsche", "911", 100000, 11250);
        Car car03 = new Car("BMW", "M8", 130000, 45000);
        Car car04 = new Car("Ford", "Focus", 45000, 1000);
        Car car05 = new Car("Bugatti", "Chiron", 9000000, 5500);

        Garage garage = new Garage();
        garage.addCars(car01);
        garage.addCars(car02);
        garage.addCars(car03);
        garage.addCars(car04);
        garage.addCars(car05);
        garage.sortCarByMileage();

        System.out.println("The available Cars sorted by mileage\n------------------------------------");
        System.out.println(garage);
        System.out.println("The most expensive Car is: " + garage.getMostExpensiveCar());

    }
}
