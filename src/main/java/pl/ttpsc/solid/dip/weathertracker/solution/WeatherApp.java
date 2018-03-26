package pl.ttpsc.solid.dip.weathertracker.solution;

import pl.ttpsc.solid.dip.weathertracker.solution.devices.Device;
import pl.ttpsc.solid.dip.weathertracker.solution.devices.Emailer;
import pl.ttpsc.solid.dip.weathertracker.solution.devices.Phone;
import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherCondition;
import pl.ttpsc.solid.dip.weathertracker.solution.trackers.Tracker;
import pl.ttpsc.solid.dip.weathertracker.solution.trackers.WeatherTracker;

import java.util.ArrayList;
import java.util.List;

public class WeatherApp {
    public static void main(String[] args) {
        Device emailer = new Emailer();
        emailer.subscribeToWeather(WeatherCondition.RAINY);
        emailer.subscribeToWeather(WeatherCondition.SUNNY);

        Device phone = new Phone();
        phone.subscribeToWeather(WeatherCondition.RAINY);

        List<Device> deviceList = new ArrayList<>();
        deviceList.add(emailer);
        deviceList.add(phone);

        Tracker tracker = new WeatherTracker(deviceList);
        tracker.setCurrentConditions(WeatherCondition.RAINY);
        tracker.setCurrentConditions(WeatherCondition.SUNNY);
        System.out.println(tracker.getCurrentConditions());
    }
}
