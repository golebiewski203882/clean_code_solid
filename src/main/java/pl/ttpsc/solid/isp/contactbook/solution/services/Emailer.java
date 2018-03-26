package pl.ttpsc.solid.isp.contactbook.solution.services;

import pl.ttpsc.solid.isp.contactbook.solution.model.EmailPayload;
import pl.ttpsc.solid.isp.contactbook.solution.model.Emailable;

public class Emailer {

    public void sendMessage(Emailable emailable, EmailPayload payload) {
        String emailAddress = emailable.getEmailAddress();
        sendEmail(emailAddress, payload);
    }

    private void sendEmail(String emailAddress, EmailPayload payload) {
        System.out.printf("Sending email to %s...\n", emailAddress);
        System.out.printf("Subject: %s\n", payload.getSubject());
        System.out.printf("Body: %s\n", payload.getBody());
    }
}