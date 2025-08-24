package app.domain.model.patient;

import java.time.LocalDate;

public class Insurance {
    private String companyName;
    private String policyNumber;
    private boolean active;
    private LocalDate expirationDate;

    public Insurance(String companyName, String policyNumber, boolean active, LocalDate expirationDate) {
        if (companyName == null || companyName.isBlank()) {
            throw new IllegalArgumentException("Company name cannot be empty");
        }
        if (policyNumber == null || policyNumber.isBlank()) {
            throw new IllegalArgumentException("Policy number cannot be empty");
        }
        if (expirationDate == null) {
            throw new IllegalArgumentException("Expiration date cannot be null");
        }

        this.companyName = companyName;
        this.policyNumber = policyNumber;
        this.active = active;
        this.expirationDate = expirationDate;
    }

    public boolean isActive() {
        return active && expirationDate.isAfter(LocalDate.now());
    }

    public String getCompanyName() { return companyName; }
    public String getPolicyNumber() { return policyNumber; }
    public boolean getStatus() { return active; }
    public LocalDate getExpirationDate() { return expirationDate; }
}

