package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern.WeatherForecastSystem;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // Create a WeatherData object

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); // Create a display object
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); // Create another display object

        weatherData.setMeasurements(30, 65, 30.4f, 10.0f); // Set initial measurements
        weatherData.setMeasurements(28, 70, 29.2f, 12.0f); // Update measurements
        weatherData.setMeasurements(26, 90, 29.2f, 15.0f); // Update measurements again

        currentDisplay.display();
        statisticsDisplay.display(); // Display the statistics
    }
}
// The Client class demonstrates the Observer pattern by creating a WeatherData object and two display objects (CurrentConditionsDisplay and StatisticsDisplay).
// It sets the weather measurements and updates the displays accordingly. The displays will show the current conditions and statistics based on the weather data.