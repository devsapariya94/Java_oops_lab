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

class Semi_FurnishedResidency extends Residency {

    int furnitureCharge = 1000;
    int parkingCharge = 99;
    int price;

    @Override
    long getPriceOfResidency() {
        price = (getUnit_rate() * getArea()) + furnitureCharge + parkingCharge;
        return price;
    }

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

    @Override
    public long getRent() {
        rent = (getPriceOfResidency() * 5) / 100;
        return rent;
    }

}

public class Residency_main {
    public static void main(String[] args) {
        Semi_FurnishedResidency r = new Semi_FurnishedResidency("JAVA", 7, 1800, 45);
        System.out.println(r.getPriceOfResidency());

        LuxuriousResidency r1 = new LuxuriousResidency("PYTHON", 1,2000,63);
        System.out.println(r1.getPriceOfResidency());
        
        Rentable r2 = (Rentable)r;
    
        System.out.println(r2.getRent());
        
    }
}
