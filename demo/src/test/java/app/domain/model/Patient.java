package app.domain.model;

import java.time.LocalDate;

public class Patient extends Users {
    
    private String gender;

    public Patient(int userId, String fullName, String idCard, String email, String phone,
                   LocalDate birthDate, String address, String username, String password,
                   Role role, String gender) {
        
        super(userId, fullName, idCard, email, phone, birthDate, address, username, password, role);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient: " + getFullName() + " | Gender: " + gender;
    }
}


