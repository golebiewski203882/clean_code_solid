package pl.ttpsc.solid.dip.weathertracker.solution;

import pl.ttpsc.solid.dip.weathertracker.solution.devices.Device;
import pl.ttpsc.solid.dip.weathertracker.solution.devices.Emailer;
import pl.ttpsc.solid.dip.weathertracker.solution.devices.Phone;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.DeviceType;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherConditions;
import pl.ttpsc.solid.dip.weathertracker.solution.trackers.Tracker;
import pl.ttpsc.solid.dip.weathertracker.solution.trackers.WeatherTracker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeatherApp {
    public static void main(String[] args) {
        List<Device> deviceList = new ArrayList<>();
        deviceList.add(new Emailer());
        deviceList.add(new Phone());

        Set<WeatherTracker.Listener> listeners = new HashSet<>();
        listeners.add(new WeatherTracker.Listener(DeviceType.PHONE, WeatherConditions.RAINY));
        listeners.add(new WeatherTracker.Listener(DeviceType.PHONE, WeatherConditions.SUNNY));
        listeners.add(new WeatherTracker.Listener(DeviceType.EMAILER, WeatherConditions.RAINY));

        Tracker tracker = new WeatherTracker(deviceList, listeners);
        tracker.setCurrentConditions(WeatherConditions.RAINY);
        tracker.setCurrentConditions(WeatherConditions.SUNNY);
        System.out.println(tracker.getCurrentConditions());
    }
}
