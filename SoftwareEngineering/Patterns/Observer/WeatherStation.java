package Observer;

import java.util.ArrayList;
import java.util.List;

// Subjekt, das von mehreren Beobachtern abonniert werden kann
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    // Beobachter hinzufügen
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Beobachter entfernen
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Temperatur aktualisieren und alle Beobachter benachrichtigen
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    // Alle Abonnenten benachrichtigen
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
