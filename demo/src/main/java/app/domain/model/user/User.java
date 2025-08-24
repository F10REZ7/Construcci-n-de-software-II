package app.domain.model.user;

import java.util.Objects;

public class User {
    private final String id; // National ID
    private String fullName;
    private String email;
    private String phone;
    private String role; // Doctor, Nurse, Admin, HR

    public User(String id, String fullName, String email, String phone, String role) {
        if (id == null || id.length() > 15)
            throw new IllegalArgumentException("Invalid ID");
        this.id = id;
        this.fullName = Objects.requireNonNull(fullName);
        this.email = Objects.requireNonNull(email);
        this.phone = phone;
        this.role = role;
    }

    public String getId() { return id; }
    public String getRole() { return role; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
