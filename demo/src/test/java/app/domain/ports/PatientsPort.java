package app.domain.ports;

import app.domain.model.Patient;

public interface PatientsPort {

    void save(Patient patient) throws Exception;

    Patient findById(Patient patient) throws Exception;
  
}

