package app.domain.model;

import java.time.LocalDate;

public class Users {
    private int userId;
    private String fullName;
    private String idCard;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String address;
    private String username;
    private String password;
    private Role role;

    public Users(int userId, String fullName, String idCard, String email, String phone,
                 LocalDate birthDate, String address, String username, String password, Role role) {

        this.userId = userId;
        this.fullName = fullName;
        this.idCard = idCard;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getIdCard() { return idCard; }
    public void setIdCard(String idCard) { this.idCard = idCard; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    @Override
    public String toString() {
        return "User: " + fullName + " | Role: " + role + " | Username: " + username;
    }
}
 


