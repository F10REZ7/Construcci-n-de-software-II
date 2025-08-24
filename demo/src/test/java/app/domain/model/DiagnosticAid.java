package app.domain.model;

public class DiagnosticAid {
    private final int diagnosticAidId;
    private String name;
    private int quantity;
    private double cost;
    private boolean requiresSpecialist;
    private String specialistType;

    public DiagnosticAid(int diagnosticAidId, String name, int quantity, double cost) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.diagnosticAidId = diagnosticAidId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getDiagnosticAidId() { return diagnosticAidId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getCost() { return cost; }
    public boolean isRequiresSpecialist() { return requiresSpecialist; }
    public String getSpecialistType() { return specialistType; }

    public void setName(String name) { this.name = name; }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

    public void setCost(double cost) {
        if (cost < 0) throw new IllegalArgumentException("Cost cannot be negative");
        this.cost = cost;
    }

    public void setRequiresSpecialist(boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    public void setSpecialistType(String specialistType) {
        this.specialistType = specialistType;
    }

    @Override
    public String toString() {
        return name + " (x" + quantity + ") - $" + cost +
               (requiresSpecialist ? " | Requires: " + specialistType : "");
    }
}

