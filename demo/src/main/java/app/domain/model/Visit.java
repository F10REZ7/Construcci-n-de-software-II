package app.domain.model;

public class Visit {
    private String bloodPressure;
    private double temperature;
    private int heartRate;
    private int oxygenLevel;
    private double weight;
    private String notes;

    public Visit(String bloodPressure, double temperature, int heartRate, int oxygenLevel,
                 double weight, String notes) {
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.heartRate = heartRate;
        this.oxygenLevel = oxygenLevel;
        this.weight = weight;
        this.notes = notes;
    }

    public String getBloodPressure() { return bloodPressure; }
    public void setBloodPressure(String bloodPressure) { this.bloodPressure = bloodPressure; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public int getHeartRate() { return heartRate; }
    public void setHeartRate(int heartRate) { this.heartRate = heartRate; }

    public int getOxygenLevel() { return oxygenLevel; }
    public void setOxygenLevel(int oxygenLevel) { this.oxygenLevel = oxygenLevel; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return "Visit [BP=" + bloodPressure +
               ", Temp=" + temperature +
               ", HR=" + heartRate +
               ", O2=" + oxygenLevel +
               ", Weight=" + weight +
               ", Notes=" + notes + "]";
    }
}

