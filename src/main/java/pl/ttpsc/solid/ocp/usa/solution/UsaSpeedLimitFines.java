package pl.ttpsc.solid.ocp.usa.solution;

import pl.ttpsc.solid.ocp.usa.solution.states.Arizona;
import pl.ttpsc.solid.ocp.usa.solution.states.California;
import pl.ttpsc.solid.ocp.usa.solution.states.StateFine;
import pl.ttpsc.solid.ocp.usa.solution.states.Texas;

import java.util.ArrayList;
import java.util.List;

public class UsaSpeedLimitFines {

    public static void main(String[] args) {
        List<StateFine> states = new ArrayList<>();
        states.add(new California());
        states.add(new Texas());
        states.add(new Arizona());
        double speed = 100;

        states.forEach(state -> System.out.printf("Fine for %.2f mph is %.2f.\n",
                speed, state.calcSpeedLimitFine(speed)));
    }


}
