package Observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Wetterstation erstellen (Observable)
        WeatherStation weatherStation = new WeatherStation();

        // Beobachter (Wetter-Apps) erstellen und abonnieren
        WeatherApp app1 = new WeatherApp("Wetter-App 1");
        WeatherApp app2 = new WeatherApp("Wetter-App 2");
        SmartHomeSystem homeSystem = new SmartHomeSystem();

        weatherStation.addObserver(app1);
        weatherStation.addObserver(app2);
        weatherStation.addObserver(homeSystem);

        // Temperaturänderungen simulieren
        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);
    }
}
