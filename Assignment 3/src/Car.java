public class Car {
    String plateNumber;
    String model;
    double mileage = 0;
    double fuelLevel;
    int tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, int  tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        if ((km/10) > fuelLevel) {
            System.out.println(">>> Driving " + km + " kilometers...");
            System.out.println("There isn't enough fuel in the tank to travel that distance.");
            System.out.println("---------------------------------------------");
        } else {
            System.out.println(">>> Driving " + km + " kilometers...");
            mileage += km;
            fuelLevel -= km/10;
            System.out.println("Current mileage: " + mileage + " km");
            System.out.println("Current fuel amount: " + fuelLevel + " / " + tankCapacity + " Litres.");
            System.out.println("---------------------------------------------");
        }
    }

    public void refuel(double amount) {
        if (amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Refilling tank...");
            System.out.println("Tank is full, extra fuel is discarted.");
            System.out.println("---------------------------------------------");
        } else {
            fuelLevel += amount;
            System.out.println("Refilling tank... \nCurrent fuel amount: " + fuelLevel + " / " + tankCapacity + " Litres.");
            System.out.println("---------------------------------------------");
        }
    }

    public void checkStatus() {
        System.out.println("Car model: " + model + "\nPlate number: " + plateNumber);
        System.out.println("Current mileage: " + mileage + " km");
        System.out.println("Current fuel amount: " + fuelLevel + " / " + tankCapacity + " Litres.");
        System.out.println("---------------------------------------------");
        if (fuelLevel < 10) {
            System.out.println("Low Fuel Warning!");
            System.out.println("---------------------------------------------");
        }
    }
}
