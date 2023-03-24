package Week05;

public class Car {
    private String manufacturer, model;
    private int pricePaid, odometer;

    public Car(String manufacturer, String model, int pricePaid, int odometer) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.pricePaid = pricePaid;
        this.odometer = odometer;

    }

    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String newManufacturer){
        this.manufacturer = newManufacturer;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }

    public int getPricePaid(){
        return pricePaid;
    }
    public void setPricePaid(int newPricePaid){
        this.pricePaid = newPricePaid;
    }


    public int getOdometer(){
        return odometer;
    }
    public void setOdometer(int newOdometer){
        this.odometer = newOdometer;
    }


    @Override
    public String toString() {
        String text = "";
        text += this.manufacturer + ", " + this.model + ", Price: " + this.pricePaid + " EUR, Mileage: " + this.odometer + " km";

        return text;
    }
}
