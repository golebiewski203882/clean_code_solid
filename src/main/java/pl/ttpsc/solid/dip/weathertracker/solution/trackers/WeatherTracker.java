package pl.ttpsc.solid.dip.weathertracker.solution.trackers;


import pl.ttpsc.solid.dip.weathertracker.solution.devices.Device;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherCondition;

import java.util.List;

public class WeatherTracker implements Tracker {

    private WeatherCondition currentConditions;
    private List<Device> devices;

    public WeatherTracker(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public WeatherCondition getCurrentConditions() {
        return currentConditions;
    }

    @Override
    public void setCurrentConditions(WeatherCondition conditions) {
        this.currentConditions = conditions;
        devices.stream()
                .filter(device -> device.getSubscribedWeathers().contains(conditions))
                .forEach(device -> System.out.println(device.generateWeatherAlert(conditions)));
    }
}
