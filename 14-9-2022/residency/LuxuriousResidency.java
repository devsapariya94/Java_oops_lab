package residency;

public class LuxuriousResidency extends Residency {

    int amenityCharge = 66600;
    int price;

    @Override
    public long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + amenityCharge;
        return price;
    }

    public LuxuriousResidency() {
        super();

    }

    public LuxuriousResidency(String name, int rNumber, int area, int unit_rate) {
        super.setName(name);
        super.setArea(area);
        super.setrNumber(rNumber);
        super.setUnit_rate(unit_rate);
    }
}

public interface Rentable {
    abstract public long getRent();
}

class TwoBHKResidency extends Semi_FurnishedResidency implements Rentable {
    long rent;

    @Override
    public long getRent() {
        rent = (getPriceOfResidency() * 5) / 100;
        return rent;
    }

}