package app.domain.model;

public class EmergencyContact {
    private String contactName;
    private String relation;
    private String phoneNumber;

    public EmergencyContact(String contactName, String relation, String phoneNumber) {
        this.contactName = contactName;
        this.relation = relation;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return contactName + " (" + relation + ") - " + phoneNumber;
    }
}


