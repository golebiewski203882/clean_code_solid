package pl.ttpsc.solid.isp.contactbook.solution.model;

public class Contact implements Dialable, Emailable {

    private String name;
    private String address;
    private String emailAddress;
    private String telephone;

    public Contact(String name, String address, String emailAddress, String telephone) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



