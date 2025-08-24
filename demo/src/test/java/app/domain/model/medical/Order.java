package app.domain.model.medical;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Order {
    private final String orderNumber;
    private final String patientId;
    private final String doctorId;
    private final LocalDate creationDate;

    public Order(String orderNumber, String patientId, String doctorId, LocalDate creationDate) {
        if (!isValidOrderNumber(orderNumber)) {
            throw new IllegalArgumentException("Order number must be 1–6 characters long");
        }

        this.orderNumber = Objects.requireNonNull(orderNumber, "Order number cannot be null");
        this.patientId = Objects.requireNonNull(patientId, "Patient ID cannot be null");
        this.doctorId = Objects.requireNonNull(doctorId, "Doctor ID cannot be null");
        this.creationDate = Objects.requireNonNullElse(creationDate, LocalDate.now());
    }

    private boolean isValidOrderNumber(String number) {
        return number != null && number.length() > 0 && number.length() <= 6;
    }

    public String getOrderNumber() { return orderNumber; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public LocalDate getCreationDate() { return creationDate; }
}

