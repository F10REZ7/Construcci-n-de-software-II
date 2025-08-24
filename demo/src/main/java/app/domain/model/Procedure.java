package app.domain.model;

public class Procedure {
    private int id;
    private String name;
    private double cost;
    private boolean requiresSpecialist;

    public Procedure(int id, String name, double cost, boolean requiresSpecialist) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.requiresSpecialist = requiresSpecialist;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }
    public void setRequiresSpecialist(boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    @Override
    public String toString() {
        return "Procedure: " + name + " | Cost: $" + cost + " | Needs specialist: " + requiresSpecialist;
    }
}

