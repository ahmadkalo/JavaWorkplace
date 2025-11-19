package Factory;

// Die Factory-Klasse, die Fahrzeuge erstellt
class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {

            return new Motorcycle();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("Unbekannter Fahrzeugtyp: " + type);
        }
    }
}

