package pl.ttpsc.solid.isp.contactbook.solution.services;

import pl.ttpsc.solid.isp.contactbook.solution.model.Dialable;

public class Dialler {

    public void makeCall(Dialable dialable) {
        String telephone = dialable.getTelephone();
        call(telephone);
    }

    private void call(String telephone) {
        System.out.printf("Calling %s...", telephone);
    }
}