package app.domain.model;

import java.time.LocalDate;

public class Doctor extends Users {
    private String medicalSpecialty;

    public Doctor(int userId, String fullName, String idCard, String email, String phone,
                  LocalDate birthDate, String address, String username, String password,
                  Role role, String medicalSpecialty) {

        super(userId, fullName, idCard, email, phone, birthDate, address, username, password, role);
        this.medicalSpecialty = medicalSpecialty;
    }

    public String getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(String medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }

    @Override
    public String toString() {
        return "Doctor: " + getFullName() + " | Specialty: " + medicalSpecialty;
    }
}


