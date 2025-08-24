package app.domain.model.patient;

import java.time.LocalDate;
import java.time.Period;

public class Patient {
    private final String id; // National ID
    private String username;
    private String password;
    private String fullName;
    private LocalDate birthDate;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private EmergencyContact emergencyContact;
    private Insurance insurance;

    public Patient(String id, String username, String password, String fullName, LocalDate birthDate) {
        if (username == null || username.length() > 15) {
            throw new IllegalArgumentException("Username cannot be null or longer than 15 characters");
        }
        if (password == null || !password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$")) {
            throw new IllegalArgumentException("Password must be at least 8 characters, with one uppercase, one number and one special character");
        }
        if (birthDate == null) {
            throw new IllegalArgumentException("Birth date cannot be null");
        }

        int age = Period.between(birthDate, LocalDate.now()).getYears();
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150 years");
        }

        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getFullName() { return fullName; }
    public LocalDate getBirthDate() { return birthDate; }
    public int getAge() { return Period.between(birthDate, LocalDate.now()).getYears(); }

    public void setEmergencyContact(EmergencyContact contact) {
        this.emergencyContact = contact;
    }

    public EmergencyContact getEmergencyContact() { return emergencyContact; }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() { return insurance; }
}

