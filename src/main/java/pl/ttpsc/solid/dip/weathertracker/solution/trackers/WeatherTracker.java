package pl.ttpsc.solid.dip.weathertracker.solution.trackers;


import pl.ttpsc.solid.dip.weathertracker.solution.devices.Device;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.DeviceType;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherConditions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherTracker implements Tracker {

    private WeatherConditions currentConditions;
    private List<Device> devices;
    private Set<Listener> listeners;

    public WeatherTracker(List<Device> devices, Set<Listener> listeners) {
        this.devices = devices;
        this.listeners = listeners;
    }

    @Override
    public WeatherConditions getCurrentConditions() {
        return currentConditions;
    }

    @Override
    public void setCurrentConditions(WeatherConditions conditions) {
        this.currentConditions = conditions;
        devices.stream()
                .filter(device -> getDeviceTypesByConditions(conditions).contains(device.getDeviceType()))
                .forEach(device -> System.out.println(device.generateWeatherAlert(conditions)));
    }

    private List<DeviceType> getDeviceTypesByConditions(WeatherConditions weatherConditions) {
        return listeners.stream()
                .filter(entry -> entry.weatherConditions.equals(weatherConditions))
                .map(entry -> entry.deviceType)
                .collect(Collectors.toList());
    }

    public static class Listener {
        DeviceType deviceType;
        WeatherConditions weatherConditions;

        public Listener(DeviceType deviceType, WeatherConditions weatherConditions) {
            this.deviceType = deviceType;
            this.weatherConditions = weatherConditions;
        }
    }
}
