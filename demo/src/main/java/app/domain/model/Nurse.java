package app.domain.model;

import java.time.LocalDate;

public class Nurse extends Users {
    
    private String workShift;

    public Nurse(int userId, String fullName, String idCard, String email, String phone,
                 LocalDate birthDate, String address, String username, String password, Role role,
                 String workShift) {
        
        super(userId, fullName, idCard, email, phone, birthDate, address, username, password, role);
        this.workShift = workShift;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @Override
    public String toString() {
        return "Nurse: " + getFullName() + " | Shift: " + workShift;
    }
}

