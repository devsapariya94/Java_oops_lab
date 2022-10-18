abstract class Residency {
    public String name;
    private int rNumber;
    private int area;
    private int unit_rate;

    public Residency() {
        name = null;
        rNumber = 0;
        area = 0;
        unit_rate = 0;
    }

    public Residency(String name, int rNumber, int area, int unit_rate) {
        this.name = name;
        this.rNumber = rNumber;
        this.area = area;
        this.unit_rate = unit_rate;
    }

    Residency(Residency r) {
        this(r.name, r.rNumber, r.area, r.unit_rate);
    }

    public int getArea() {
        return area;
    }

    public int getrNumber() {
        return rNumber;
    }

    public int getUnit_rate() {
        return unit_rate;
    }

    public String getName() {
        return name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit_rate(int unit_rate) {
        this.unit_rate = unit_rate;
    }

    public void setrNumber(int rNumber) {
        this.rNumber = rNumber;
    }

    abstract long getPriceOfResidency();
}

abstract class Semi_FurnishedResidency extends Residency {

    int furnitureCharge = 1000;
    int parkingCharge = 99;
    int price;

    Semi_FurnishedResidency() {
        super();
    }

    Semi_FurnishedResidency(String name, int rNumber, int area, int unit_rate) {
        super.setName(name);
        super.setArea(area);
        super.setrNumber(rNumber);
        super.setUnit_rate(unit_rate);
    }

}

class LuxuriousResidency extends Residency {

    int amenityCharge = 66600;
    int price;

    @Override
    long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + amenityCharge;
        return price;
    }

    LuxuriousResidency() {
        super();

    }

    LuxuriousResidency(String name, int rNumber, int area, int unit_rate) {
        super.setName(name);
        super.setArea(area);
        super.setrNumber(rNumber);
        super.setUnit_rate(unit_rate);
    }
}

interface Rentable {
    abstract public long getRent();
}

class TwoBHKResidency extends Semi_FurnishedResidency implements Rentable {
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
    long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + furnitureCharge + parkingCharge;
        return price;
    }

}

public class Residency_main {
    public static void main(String[] args) {
        LuxuriousResidency r1 = new LuxuriousResidency("PYTHON", 1,2000,63);
        System.out.println("The price of Luxurious Residency is: "+r1.getPriceOfResidency());
        

        Semi_FurnishedResidency r2 = new TwoBHKResidency("JAVA", 2, 1000, 50);
        System.out.println("The price of Semi Furnished Residency Residency is:"+r2.getPriceOfResidency());
        System.out.println("Rent of 2 BHK  Semi Furnished Residency is :"+((Rentable) r2).getRent());
        
    }
}