package pl.ttpsc.solid.ocp.usa.solution.states;

public class California implements StateFine {

    @Override
    public double calcSpeedLimitFine(double speedMiles) {
        if (speedMiles <= 100) {
            return 0;
        } else if (speedMiles > 100 && speedMiles < 120) {
            return 100;
        } else if (speedMiles >= 120 && speedMiles < 140) {
            return 200;
        } else {
            return 400;
        }
    }
}
