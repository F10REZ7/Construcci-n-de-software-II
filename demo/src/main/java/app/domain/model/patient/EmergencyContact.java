package app.domain.model.patient;

public class EmergencyContact {
    private String firstName;
    private String lastName;
    private String relationship;
    private String phone;

    public EmergencyContact(String firstName, String lastName, String relationship, String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be 10 digits");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.phone = phone;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getRelationship() { return relationship; }
    public String getPhone() { return phone; }
}
