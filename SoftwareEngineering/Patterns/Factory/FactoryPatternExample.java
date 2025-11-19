package Factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        // Erstellen von Fahrzeugen mit der Factory
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive(); // Ausgabe: Auto fährt auf der Straße.

        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.drive(); // Ausgabe: Motorrad fährt auf zwei Rädern.

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive(); // Ausgabe: LKW transportiert schwere Ladung.
    }
}
