package app.domain.services;

import java.util.List;

import app.domain.model.Order;
import app.domain.model.Patient;
import app.domain.ports.ClinicOrderPort;
import app.domain.ports.PatientsPort;

public class SearchOrderByPatients {
    
    private final PatientsPort patientsPort;
    private final ClinicOrderPort clinicOrderPort;

    public SearchOrderByPatients(PatientsPort patientsPort, ClinicOrderPort clinicOrderPort) {
        this.patientsPort = patientsPort;
        this.clinicOrderPort = clinicOrderPort;
    }

    public List<Order> search(String patientId) throws Exception {
        Patient patient = patientsPort.findById(patientId);
        if (patient == null) {
            throw new Exception("You must search orders for a registered patient");
        }
        return clinicOrderPort.findByPatient(patient);
    }
}



