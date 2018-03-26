package pl.ttpsc.solid.isp.contactbook.solution.model;

public class EmailPayload {

    private String subject;
    private String body;

    public EmailPayload(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
