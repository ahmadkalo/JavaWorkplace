package Observer;

// Wetter-App 1
class WeatherApp implements Observer {
    private String name;

    public WeatherApp(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " aktualisiert: Neue Temperatur = " + temperature + "°C");
    }
}

// Wetter-App 2
class SmartHomeSystem implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("SmartHome-System passt die Heizung an: " + temperature + "°C");
    }
}
