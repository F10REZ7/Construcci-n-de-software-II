package app.domain.repository;

import app.domain.model.patient.Patient;
import java.util.Optional;

public interface PatientRepository {
    void save(Patient patient);
    Optional<Patient> findById(String id);
}
