package app.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderCode;
    private String patientId;
    private String doctorId;
    private LocalDate creationDate;
    private List<String> items;

    public Order(String orderCode, String patientId, String doctorId, LocalDate creationDate) {
        this.orderCode = orderCode;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.creationDate = creationDate;
        this.items = new ArrayList<>();
    }

    public String getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<String> getItems() {
        return items;
    }
    public void setItems(List<String> items) {
        this.items = items;
    }

    // Método para agregar ítems
    public void addItem(String item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Order " + orderCode + " | Patient: " + patientId +
               " | Doctor: " + doctorId +
               " | Date: " + creationDate +
               " | Items: " + items;
    }
}

