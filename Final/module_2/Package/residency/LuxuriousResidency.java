package residency;

public class LuxuriousResidency extends Residency {

    int amenityCharge = 66600;
    int price;

    @Override
    public
    long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + amenityCharge;
        return price;
    }

    LuxuriousResidency() {
        super();

    }

    public LuxuriousResidency(String name, int rNumber, int area, int unit_rate) {
        super.setName(name);
        super.setArea(area);
        super.setrNumber(rNumber);
        super.setUnit_rate(unit_rate);
    }
}

