package app.domain.model;

import java.time.LocalDate;

public class AdminStaff extends Users {

    public AdminStaff(int idUsers, String fullName, String idCard, String email, String phone,
                               LocalDate birthDate, String address, String username, String password, Role role) {
        super(idUsers, fullName, idCard, email, phone, birthDate, address, username, password, role);
    }
}

