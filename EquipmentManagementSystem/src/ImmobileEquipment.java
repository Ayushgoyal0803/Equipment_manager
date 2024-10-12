public class ImmobileEquipment extends Equipment {
    private double weight;

    public ImmobileEquipment(String name, String description, double weight) {
        super(name, description);
        this.weight = weight;
    }

    @Override
    public void moveBy(double distance) {
        this.distanceMovedTillDate += distance;
        this.maintenanceCost += weight * distance;
    }
}
