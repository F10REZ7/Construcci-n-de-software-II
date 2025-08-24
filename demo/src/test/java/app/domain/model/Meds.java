package app.domain.model;

public class Meds {

    private int medicamentId;
    private String name;
    private String dosage;
    private String duration;
    private double cost;

    public Meds(int medicamentId, String name, String dosage, String duration, double cost) {
        this.medicamentId = medicamentId;
        this.name = name;
        this.dosage = dosage;
        this.duration = duration;
        this.cost = cost;
    }

    public int getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(int medicamentId) {
        this.medicamentId = medicamentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}

