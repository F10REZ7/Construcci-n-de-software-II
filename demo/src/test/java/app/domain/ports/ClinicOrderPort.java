package app.domain.ports;

import java.util.List;
import app.domain.model.Order;
import app.domain.model.Patient;

public interface ClinicOrderPort {

    Order findById(Order order) throws Exception;

    List<Order> findByPatient(Patient patient) throws Exception;

    void save(Order order) throws Exception;

}

