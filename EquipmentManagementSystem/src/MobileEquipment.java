public class MobileEquipment extends Equipment {
    private int numberOfWheels;

    public MobileEquipment(String name, String description, int numberOfWheels) {
        super(name, description);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void moveBy(double distance) {
        this.distanceMovedTillDate += distance;
        this.maintenanceCost += numberOfWheels * distance;
    }
}
