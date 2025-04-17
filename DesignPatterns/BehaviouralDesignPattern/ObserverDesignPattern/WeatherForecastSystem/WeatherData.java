package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern.WeatherForecastSystem;

public class WeatherData extends Subject {
    private float temparature;
    private float humidity;
    private float pressure;
    private float windSpeed;

    public void setMeasurements(float temparature, float humidity, float pressure, float windSpeed) {
        this.temparature = temparature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        measurementsChanged(); // Notify observers about the change in measurements
    }
    public void measurementsChanged() {
        notifySubscribers(); // Notify all observers about the change in measurements
    }

    public float getTemparature() {
        return temparature;
    }
    public float getHumidity() {
        return humidity;
    }  
    public float getPressure() {
        return pressure;
    }
    public float getWindSpeed() {
        return windSpeed;
    }
}
// The WeatherData class extends the Subject class and maintains the weather data measurements. 
//It provides methods to set the measurements and notify observers when the measurements change.
// The get methods are used to retrieve the current values of temperature, humidity, pressure, and wind speed.
