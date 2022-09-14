package residency;

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