public abstract class Equipment {
    protected String name;
    protected String description;
    protected double distanceMovedTillDate;
    protected double maintenanceCost;

    public Equipment(String name, String description) {
        this.name = name;
        this.description = description;
        this.distanceMovedTillDate = 0;
        this.maintenanceCost = 0;
    }

    public abstract void moveBy(double distance);

    public String getBasicDetails() {
        return "Name: " + name + ", Description: " + description;
    }

    public String getFullDetails() {
        return "Name: " + name + "\nDescription: " + description +
                "\nDistance Moved: " + distanceMovedTillDate + " km" +
                "\nMaintenance Cost: $" + maintenanceCost + "\n";
    }
}
