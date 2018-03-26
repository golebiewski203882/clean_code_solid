package pl.ttpsc.solid.dip.weathertracker.solution.devices;

import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherConditions;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.DeviceType;

public class Phone implements Device {

    @Override
    public String generateWeatherAlert(WeatherConditions conditions) {
        return String.format("%s: It is %s", getDeviceType(), conditions.getDescription());
    }

    @Override
    public DeviceType getDeviceType() {
        return DeviceType.PHONE;
    }
}
