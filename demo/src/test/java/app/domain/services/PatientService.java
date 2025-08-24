package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientsPort;

public class PatientService {

    private final PatientsPort patientsPort;

    public PatientService(PatientsPort patientsPort) {
        this.patientsPort = patientsPort;
    }

    // Register a new patient
    public void registerPatient(Patient patient) throws Exception {
        if (patientsPort.findById(patient) != null) {
            throw new Exception("A patient with this ID already exists");
        }
        patientsPort.save(patient);
    }

    // Get patient by ID
    public Patient getPatient(Patient patient) throws Exception {
        Patient found = patientsPort.findById(patient);
        if (found == null) {
            throw new Exception("Patient not found");
        }
        return found;
    }

    // Update patient info
    public void updatePatient(Patient patient) throws Exception {
        Patient existing = patientsPort.findById(patient);
        if (existing == null) {
            throw new Exception("Cannot update: patient does not exist");
        }
        patientsPort.save(patient);
    }
}


