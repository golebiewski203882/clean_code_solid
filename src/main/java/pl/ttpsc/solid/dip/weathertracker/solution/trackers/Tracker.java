package pl.ttpsc.solid.dip.weathertracker.solution.trackers;

import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherConditions;

public interface Tracker {
    void setCurrentConditions(WeatherConditions conditions);
}
