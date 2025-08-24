package app.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClinicalHistory {
    private LocalDate date;
    private String doctorIdCard;
    private String consultationReason;
    private String symptoms;
    private String diagnosis;

    private final List<String> historyEntries;

    public ClinicalHistory(LocalDate date, String doctorIdCard, String consultationReason,
                           String symptoms, String diagnosis) {
        this.date = date;
        this.doctorIdCard = doctorIdCard;
        this.consultationReason = consultationReason;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
        this.historyEntries = new ArrayList<>();
    }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getDoctorIdCard() { return doctorIdCard; }
    public void setDoctorIdCard(String doctorIdCard) { this.doctorIdCard = doctorIdCard; }

    public String getConsultationReason() { return consultationReason; }
    public void setConsultationReason(String consultationReason) { this.consultationReason = consultationReason; }

    public String getSymptoms() { return symptoms; }
    public void setSymptoms(String symptoms) { this.symptoms = symptoms; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public List<String> getHistoryEntries() {
        return Collections.unmodifiableList(historyEntries);
    }

    public void addEntry(String entry) {
        historyEntries.add(entry);
    }
}

