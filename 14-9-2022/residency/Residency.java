package residency;

public abstract class Residency {
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