package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern.WeatherForecastSystem;

public class StatisticsDisplay implements Observer {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.subscribe(this); // Subscribe to the weather data subject
    }

    @Override
    public void update() {
        float temp = ((WeatherData) weatherData).getTemparature(); // Get the temperature from the weather data
        tempSum += temp; // Update the sum of temperatures
        numReadings++; // Increment the number of readings

        if (temp > maxTemp) {
            maxTemp = temp; // Update maximum temperature
        }
        if (temp < minTemp) {
            minTemp = temp; // Update minimum temperature
        }
        display(); // Display the statistics
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
    
}
// The StatisticsDisplay class implements the Observer interface and is responsible for displaying the statistics of the weather data.
// It subscribes to the WeatherData subject and updates its display whenever the weather data changes.
