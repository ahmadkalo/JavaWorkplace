package Factory;

// Konkrete Implementierung: Auto
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Auto fährt auf der Straße.");
    }
}

// Konkrete Implementierung: Motorrad
class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Motorrad fährt auf zwei Rädern.");
    }
}

// Konkrete Implementierung: LKW
class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("LKW transportiert schwere Ladung.");
    }
}
