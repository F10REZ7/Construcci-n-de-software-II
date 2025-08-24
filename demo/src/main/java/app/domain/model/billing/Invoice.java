package app.domain.model.billing;

import java.time.LocalDate;
import java.util.List;

import app.domain.model.patient.Patient;
import app.domain.model.medical.Order;

public class Invoice {
    private final String invoiceId;
    private final Patient patient;
    private final LocalDate date;
    private final List<Order> orders;
    private final double totalAmount;
    private final double copaymentAmount;
    private final double insuranceAmount;

    public Invoice(String invoiceId, Patient patient, LocalDate date, List<Order> orders,
                   double totalAmount, double copaymentAmount, double insuranceAmount) {
        this.invoiceId = invoiceId;
        this.patient = patient;
        this.date = date;
        this.orders = orders;
        this.totalAmount = totalAmount;
        this.copaymentAmount = copaymentAmount;
        this.insuranceAmount = insuranceAmount;
    }

    public String getInvoiceId() { return invoiceId; }
    public Patient getPatient() { return patient; }
    public LocalDate getDate() { return date; }
    public List<Order> getOrders() { return orders; }
    public double getTotalAmount() { return totalAmount; }
    public double getCopaymentAmount() { return copaymentAmount; }
    public double getInsuranceAmount() { return insuranceAmount; }
}
