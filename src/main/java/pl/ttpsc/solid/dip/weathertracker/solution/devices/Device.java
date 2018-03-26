package pl.ttpsc.solid.dip.weathertracker.solution.devices;

import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherCondition;

import java.util.Set;

public interface Device {
    String generateWeatherAlert(WeatherCondition condition);

    Set<WeatherCondition> getSubscribedWeathers();

    void subscribeToWeather(WeatherCondition condition);

    void unsubscribeToWeather(WeatherCondition condition);
}
