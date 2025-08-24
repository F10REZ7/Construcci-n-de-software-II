package app.domain.services;

import app.domain.model.Meds;
import app.domain.ports.MedicationPort;

import java.util.List;

public class MedicationService {

    private final MedicationPort medicationPort;

    public MedicationService(MedicationPort medicationPort) {
        this.medicationPort = medicationPort;
    }

    // Register a new medication
    public void registerMedication(Meds meds) throws Exception {
        if (medicationPort.findById(meds.getId()) != null) {
            throw new Exception("Medication with this ID already exists");
        }
        medicationPort.save(meds);
    }

    // Get a medication by its ID
    public Meds getMedicationById(int id) throws Exception {
        Meds meds = medicationPort.findById(id);
        if (meds == null) {
            throw new Exception("Medication not found");
        }
        return meds;
    }

    // List medications prescribed to a specific patient
    public List<Meds> getMedicationsByPatient(String patientId) {
        return medicationPort.findByPatient(patientId);
    }

    // List all medications in the system
    public List<Meds> listAllMedications() {
        return medicationPort.findAll();
    }
}
