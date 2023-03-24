package Week05;

public class Garage {
    final static int MAX_CARS_GARAGE = 100;
    private int carCounter = 0;
    Car[] cars = new Car[MAX_CARS_GARAGE];

    public void addCars(Car car){
        if(carCounter < MAX_CARS_GARAGE && car != null){
            cars[carCounter] = car;
            this.carCounter++;
        }
        else{
            System.out.println("Garage is FULL or the car is NULL!");
        }
    }

    public Car getMostExpensiveCar(){
        Car mostExpensive = null;
        if(0 < carCounter){
            mostExpensive = cars[0];

            for (int i = 1; i < carCounter; i++) {
                if (mostExpensive.getPricePaid() < cars[i].getPricePaid()) {
                    mostExpensive = cars[i];
                }
            }
        }

        return mostExpensive;
    }

    public void sortCarByMileage(){
        Car temp;
        Car lowest;
        int lowestIndex;
        for (int i = 0; i < carCounter; i++){
            lowestIndex = i;
            lowest = cars[i];
            for (int j = (i + 1); j < carCounter; j++){
                if(lowest.getOdometer() >= cars[j].getOdometer()){
                    lowest = cars[j];
                    lowestIndex = j;
                }
            }
            temp = cars[lowestIndex];
            cars[lowestIndex] = cars[i];
            cars[i] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for(int i = 0; i < carCounter; i++ ){
            text.append(cars[i]).append("\n");
        }
        return text.toString();
    }


}
