package pl.ttpsc.solid.isp.contactbook.solution;

import pl.ttpsc.solid.isp.contactbook.solution.model.Contact;
import pl.ttpsc.solid.isp.contactbook.solution.model.EmailPayload;
import pl.ttpsc.solid.isp.contactbook.solution.services.Dialler;
import pl.ttpsc.solid.isp.contactbook.solution.services.Emailer;

class InterfaceSegregationPrinciple {

    private Emailer emailer;
    private Dialler dialler;

    private InterfaceSegregationPrinciple() {
        emailer = new Emailer();
        dialler = new Dialler();
    }

    public static void main(String[] args) {
        InterfaceSegregationPrinciple interfaceSegregationPrinciple = new InterfaceSegregationPrinciple();
        interfaceSegregationPrinciple.contactPeople();
    }

    private void contactPeople() {
        Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
        EmailPayload emailPayload = new EmailPayload("promocja", "tanio dzisiaj!");
        emailer.sendMessage(contact, emailPayload);
        dialler.makeCall(contact);
    }
}
