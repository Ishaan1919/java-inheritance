//Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
//Tasks:
//Define a superclass Device with attributes like deviceId and status.
//Create a subclass Thermostat with additional attributes like temperatureSetting.
//Implement a method displayStatus() to show each device's current settings.
//Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.

class Device{
    private String deviceId;
    private boolean deviceStatus;

    Device(String id, boolean status){
        this.deviceId = id;
        this.deviceStatus = status;
    }

    void displayInfo(){
        System.out.println("Device Id: " + this.deviceId);
        System.out.println("Device status: " + this.deviceStatus);
    }
}

class Thermostat extends Device{
    private String temparatureSetting;

    Thermostat(String setting, String id, boolean status){
        super(id,status);
        this.temparatureSetting = setting;
    }

    @Override
    void displayInfo() {
        System.out.println("Device Setting: " + this.temparatureSetting);
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Device("90B", false);
        device.displayInfo();

        Thermostat thermostat = new Thermostat("Advance mode", "91A", false);
        thermostat.displayInfo();

        Device dynamicDispatch1 = new Thermostat("Normal mode", "9X", true);
        dynamicDispatch1.displayInfo();

//        Thermostat dynamicDispatch2 = new Device("12R", true); // error
//        dynamicDispatch2.displayInfo();

//        Device Id: 90B
//        Device status: false
//        Device Setting: Advance mode
//        Device Setting: Normal mode
    }
}