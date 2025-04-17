package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern.WeatherForecastSystem;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private float windSpeed;
    private Subject weatherData; // Reference to the subject (weather data)

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData; // Initialize the subject reference
        weatherData.subscribe(this); // Subscribe to the subject
    }

    @Override
    public void update() {
        this.temperature = ((WeatherData) weatherData).getTemparature(); // Get temperature from the subject
        this.humidity = ((WeatherData) weatherData).getHumidity(); // Get humidity from the subject
        this.pressure = ((WeatherData) weatherData).getPressure(); // Get pressure from the subject
        this.windSpeed = ((WeatherData) weatherData).getWindSpeed(); // Get wind speed from the subject
        display(); // Call display method to show updated data
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity, " +
                pressure + " pressure and " + windSpeed + " wind speed"); // Display current conditions
    }
    
}
// The CurrentConditionsDisplay class implements the Observer interface and is responsible for displaying the current weather conditions.
// It subscribes to the WeatherData subject and updates its display whenever the weather data changes.