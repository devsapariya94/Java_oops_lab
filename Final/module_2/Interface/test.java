interface Rentable{
    abstract public int getRent();
}
abstract class Residency{
    private String name;
    private int rNumber;
    private float area;
    private long unit_rate;

    public Residency(){
        name="XYZ";
        rNumber=100;
        area=1500;
        unit_rate=100000;
    }
    public Residency(String name, int rNumber, float area, long unit_rate){
        this.name=name;
        this.rNumber=rNumber;
        this.area=area;
        this.unit_rate=unit_rate;
    }

    public Residency(Residency r1){
        this.name=r1.name;
        this.rNumber=r1.rNumber;
        this.area=r1.area;
        this.unit_rate=r1.unit_rate;
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
    public void setArea(float area) {
        this.area = area;
    }

    public int getrNumber() {
        return rNumber;
    }
    public String getName() {
        return name;
    }
    public float getArea() {
        return area;
    }
    public long getUnit_rate() {
        return unit_rate;
    }

    abstract long getPriceOfResidency(long p);

}

abstract class Semi_FurnishedResidency extends Residency{
    private int furnitureCharge;
    private int parkingCharge;

    public void setFurnitureCharge(int furnitureCharge) {
        this.furnitureCharge = furnitureCharge;
    }
    public void setParkingCharge(int parkingCharge) {
        this.parkingCharge = parkingCharge;
    }

    public int getFurnitureCharge() {
        return furnitureCharge;
    }
    public int getParkingCharge() {
        return parkingCharge;
    }
}

class LuxuriousResidency extends Residency{
    private int amenityCharge;
    public void setAmenityCharge(int amenityCharge) {
        this.amenityCharge = amenityCharge;
    }
    public int getAmenityCharge() {
        return amenityCharge;
    }
    public long getPriceOfResidency(long p){
        return p;
    }
    
}

class TwoBHKResidency extends Semi_FurnishedResidency implements Rentable{
    public int getRent(){
        return 1000;
    }

    long getPriceOfResidency(long p) {
        return p;
    }
}


class Interface_2{
    public static void main(String[] args) {
        Rentable r1[];
        

        
        
    }
}