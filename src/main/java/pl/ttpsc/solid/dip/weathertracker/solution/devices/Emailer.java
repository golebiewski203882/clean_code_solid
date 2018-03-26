package pl.ttpsc.solid.dip.weathertracker.solution.devices;


import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherCondition;

import java.util.HashSet;
import java.util.Set;

public class Emailer implements Device {

    private Set<WeatherCondition> conditions = new HashSet<>();

    @Override
    public String generateWeatherAlert(WeatherCondition conditions) {
        return String.format("Email: It is %s", conditions.getDescription());
    }

    @Override
    public Set<WeatherCondition> getSubscribedWeathers() {
        return conditions;
    }

    @Override
    public void subscribeToWeather(WeatherCondition condition) {
        conditions.add(condition);
    }

    @Override
    public void unsubscribeToWeather(WeatherCondition condition) {
        conditions.remove(condition);
    }
}
