package residency;

public class TwoBHKResidency extends Semi_FurnishedResidency implements Rentable {
    long rent;

    public TwoBHKResidency(String name, int rNumber, int area, int unit_rate) {
        super(name, rNumber, area, unit_rate);
    }
    @Override
    public long getRent() {
        rent = (getPriceOfResidency() * 5) / 100;
        return rent;
    }
    @Override
    public long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + furnitureCharge + parkingCharge;
        return price;
    }

}