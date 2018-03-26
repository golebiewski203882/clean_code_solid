package pl.ttpsc.solid.dip.weathertracker.solution.trackers;

import pl.ttpsc.solid.dip.weathertracker.solution.enums.WeatherCondition;

public interface Tracker {
    WeatherCondition getCurrentConditions();
    void setCurrentConditions(WeatherCondition conditions);
}
