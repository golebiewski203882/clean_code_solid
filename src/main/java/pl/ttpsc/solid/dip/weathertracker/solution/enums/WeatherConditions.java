package pl.ttpsc.solid.dip.weathertracker.solution.enums;

public enum WeatherConditions {
    SUNNY("sunny weather"), RAINY("rainy weather");

    private String description;

    WeatherConditions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
