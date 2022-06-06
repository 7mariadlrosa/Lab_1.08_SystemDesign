package Iteration3;

public class Truck extends Car{

    private int towingCapacity;

    public Truck(int vinNumber, String make, String model, int mileage) {

        super(vinNumber, make, model, mileage);
    }

    public Truck(int vinNumber, String make, String model, int mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    //SETTERS
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    //GETTERS
    public int getTowingCapacity() {
        return towingCapacity;
    }

}
