import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

class WeatherStation {
    private List<Observer> observers;
    private float temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

class CurrentConditionsDisplay implements Observer {
    public void update(float temperature) {
        System.out.println("Current conditions: " + temperature + "°C");
    }
}

class StatisticsDisplay implements Observer {
    private List<Float> temperatures = new ArrayList<>();

    public void update(float temperature) {
        temperatures.add(temperature);
        float avg = (float) temperatures.stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
        float max = temperatures.stream().max(Float::compare).orElse(0.0f);
        float min = temperatures.stream().min(Float::compare).orElse(0.0f);
        System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statsDisplay = new StatisticsDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statsDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
        weatherStation.setTemperature(20);
    }
}
