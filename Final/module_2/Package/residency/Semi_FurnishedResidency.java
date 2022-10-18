package residency;



public class Semi_FurnishedResidency extends Residency{

    int furnitureCharge = 1000;
    int parkingCharge = 99;
    int price;

    @Override
    public
    long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + furnitureCharge + parkingCharge;
        return price;
    }

    Semi_FurnishedResidency() {
        super();
    }

    public Semi_FurnishedResidency(String name, int rNumber, int area, int unit_rate) {
        super.setName(name);
        super.setArea(area);
        super.setrNumber(rNumber);
        super.setUnit_rate(unit_rate);
    }

  
 
}