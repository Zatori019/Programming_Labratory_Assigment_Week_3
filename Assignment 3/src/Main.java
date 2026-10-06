
public class Main {
    public static void main(String[] args) {
        Car car = new Car("38 AB 4456", "Toyota Corolla", 10.00, 50);

        car.checkStatus();
        car.drive(150);
        car.refuel(20);
        car.drive(150);
        car.refuel(100);
        car.drive(450);
        car.checkStatus();
    }
}