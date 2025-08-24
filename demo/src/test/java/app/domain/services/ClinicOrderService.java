package app.domain.services;

import app.domain.model.Order;
import app.domain.model.Patient;
import app.domain.ports.ClinicOrderPort;

import java.util.List;

public class ClinicOrderService {

    private final ClinicOrderPort clinicOrderPort;

    public ClinicOrderService(ClinicOrderPort clinicOrderPort) {
        this.clinicOrderPort = clinicOrderPort;
    }

    // Create a new order
    public void createOrder(Order order) throws Exception {
        if (clinicOrderPort.findById(order) != null) {
            throw new Exception("An order with this ID already exists");
        }
        clinicOrderPort.save(order);
    }

    // Find an order by its ID
    public Order getOrderById(Order order) throws Exception {
        Order found = clinicOrderPort.findById(order);
        if (found == null) {
            throw new Exception("Order not found");
        }
        return found;
    }

    // Find all orders by a specific patient
    public List<Order> getOrdersByPatient(Patient patient) throws Exception {
        return clinicOrderPort.findByPatient(patient);
    }
}
