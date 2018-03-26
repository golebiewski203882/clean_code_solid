package pl.ttpsc.solid.dip.weathertracker.solution.devices;

import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherConditions;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.DeviceType;

public interface Device {
    String generateWeatherAlert(WeatherConditions conditions);
    DeviceType getDeviceType();
}
