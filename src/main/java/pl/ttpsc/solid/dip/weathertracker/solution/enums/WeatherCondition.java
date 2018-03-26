package pl.ttpsc.solid.dip.weathertracker.solution.enums;

public enum WeatherCondition {
    SUNNY("sunny weather"), RAINY("rainy weather");

    private String description;

    WeatherCondition(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
