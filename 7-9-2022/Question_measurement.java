
abstract class Measurement {
    protected int unit1;
    protected int unit2;
    protected int foot1;
    protected int foot2;
    protected int inch1;
    protected int inch2;

    Measurement() {
        unit1 = 10;
        unit2 = 20;
    }

    Measurement(int foot1, int inch1, int foot2, int inch2) {
        this.foot1 = foot1;
        this.foot2 = foot2;
        this.inch1 = inch1;
        this.inch2 = inch2;
        unit1 = (foot1 * 12) + inch1;
        unit2 = (foot2 * 12) + inch2;

    }

    Measurement(Measurement m) {
        foot1 = m.foot1;
        foot2 = m.foot2;
        inch1 = m.inch1;
        inch2 = m.inch2;
        unit1 = (foot1 * 12) + inch1;
        unit2 = (foot2 * 12) + inch2;
    }

    public int getUnit1() {
        return unit1;
    }

    public int getUnit2() {
        return unit2;
    }

    public void setUnit1(int unit1) {
        this.unit1 = unit1;
    }

    public void setUnit2(int unit2) {
        this.unit2 = unit2;
    }

    abstract Measurement getDifference(Measurement m);
}

class MeasurementPrint extends Measurement {
    int foot;
    int inch;

    MeasurementPrint(int foot, int inch) {
        this.foot = foot;
        this.inch = inch;

    }

    void printfootinch() {
        System.out.println("foot :" + foot + " inch: " + inch);
    }

    @Override
    Measurement getDifference(Measurement m) {

        return null;
    }
}

class HeightMeasurement extends Measurement {

    HeightMeasurement(int foot1, int inch1, int foot2, int inch2) {
        super(foot1, inch1, foot2, inch2);

    }

    HeightMeasurement(Measurement m) {
        super(m);
    }

    @Override
    Measurement getDifference(Measurement m) {
        int diff = m.unit2 - m.unit1;

        int foot = (diff) / 12;
        int inch = diff % 12;

        Measurement m6 = new MeasurementPrint(foot, inch);
        return m6;
    }

}

public class Question_measurement {
    public static void main(String[] args) {
        Measurement m = new HeightMeasurement(6, 2, 9, 3);
        ((MeasurementPrint) m.getDifference(m)).printfootinch();

    }
}