//Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
//Tasks:
//Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
//Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
//Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
//Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.

class Vehicle{
    protected int maxSpeed;
    protected String fuelType;

    Vehicle(int speed, String type){
        this.maxSpeed = speed;
        this.fuelType = type;
    }

    void displayInfo(){
        System.out.println("Max Speed -> " + this.maxSpeed);
        System.out.println("Fuel Type -> " + this.fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;

    Car(int capacity, int speed, String fuelType){
        super(speed,fuelType);
        this.seatCapacity = capacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity -> " + this.seatCapacity);
    }
}

class Truck extends Vehicle{
    int seatCapacity;

    Truck(int capacity, int speed, String fuelType){
        super(speed,fuelType);
        this.seatCapacity = capacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity -> " + this.seatCapacity);
    }
}

class Motorcycle extends Vehicle{
    int seatCapacity;

    Motorcycle(int capacity, int speed, String fuelType){
        super(speed,fuelType);
        this.seatCapacity = capacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity -> " + this.seatCapacity);
    }
}

public class TransportVehicleSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(200, 5, "Petrol");
        vehicles[1] = new Truck(120, 10, "Diesel");
        vehicles[2] = new Motorcycle(180, 2, "Petrol");

        for(Vehicle v : vehicles){
            v.displayInfo();
        }

//        Max Speed -> 5
//        Fuel Type -> Petrol
//        Seat Capacity -> 200

//        Max Speed -> 10
//        Fuel Type -> Diesel
//        Seat Capacity -> 120

//        Max Speed -> 2
//        Fuel Type -> Petrol
//        Seat Capacity -> 180
    }
}