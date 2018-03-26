package pl.ttpsc.solid.ocp.usa.solution.states;

public class Texas implements StateFine {

    @Override
    public double calcSpeedLimitFine(double speedMiles) {
        if (speedMiles <= 70) {
            return 0;
        } else if (speedMiles > 70 && speedMiles < 90) {
            return 100;
        } else if (speedMiles >= 90 && speedMiles < 140) {
            return 200;
        } else {
            return 400;
        }
    }
}
