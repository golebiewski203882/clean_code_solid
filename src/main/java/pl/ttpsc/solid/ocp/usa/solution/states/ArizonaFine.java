package pl.ttpsc.solid.ocp.usa.solution.states;

public class ArizonaFine implements StateFine {

    @Override
    public double calcSpeedLimitFine(double speedMiles) {
        if (speedMiles < 90) {
            return 0;
        } else if (speedMiles >= 90 && speedMiles < 110) {
            return 100;
        } else if (speedMiles >= 110 && speedMiles < 150) {
            return 200;
        } else {
            return 300;
        }
    }
}
