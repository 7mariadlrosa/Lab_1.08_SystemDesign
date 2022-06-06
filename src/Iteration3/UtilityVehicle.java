package Iteration3;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    //SETTERS
    public void setFourWheelDrive(boolean fourWheelDrive) {

        this.fourWheelDrive = fourWheelDrive;
    }

    //GETTERS
    public boolean isFourWheelDrive() {

        return fourWheelDrive;
    }
}