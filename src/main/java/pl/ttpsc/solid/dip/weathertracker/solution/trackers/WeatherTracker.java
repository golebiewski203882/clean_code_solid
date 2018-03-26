package pl.ttpsc.solid.dip.weathertracker.solution.trackers;


import pl.ttpsc.solid.dip.weathertracker.solution.devices.Device;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.DeviceType;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherConditions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherTracker implements Tracker {

    private WeatherConditions currentConditions;
    private List<Device> deviceList;
    private Map<DeviceType, WeatherConditions> weatherListenersMap;

    public WeatherTracker(List<Device> deviceList, Map<DeviceType, WeatherConditions> weatherListenersMap) {
        this.deviceList = deviceList;
        this.weatherListenersMap = weatherListenersMap;
    }

    public void setCurrentConditions(WeatherConditions conditions) {
        this.currentConditions = conditions;
        deviceList.stream()
                .filter(device -> getDeviceTypesByConditions(conditions).contains(device.getDeviceType()))
                .forEach(device -> System.out.println(device.generateWeatherAlert(conditions)));
    }

    private List<DeviceType> getDeviceTypesByConditions(WeatherConditions weatherConditions) {
        return weatherListenersMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(weatherConditions))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
