package app.domain.ports;

import app.domain.model.Meds;
import java.util.List;

public interface MedicationPort {

    void save(Meds medicament);

    Meds findById(int id);

    List<Meds> findByPatient(String patientId);

    List<Meds> findAll();
}



