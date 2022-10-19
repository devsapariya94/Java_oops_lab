abstract class TwoDShape {
    int length;
    int width;

    TwoDShape() {
        length = 0;
        width = 0;
    }

    TwoDShape(int length, int width) {
        this.length = length;
        this.width = width;

    }

    TwoDShape(TwoDShape t) {
        length = t.length;
        width = t.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    abstract float getArea();

}

class Rectangle extends TwoDShape {
    public Rectangle() {
        length = 10;
        width = 10;
    }

    public Rectangle(int l, int w) {
        super(l, w);
    }

    public Rectangle(TwoDShape r) {
        super(r);
    }

    public float getArea() {
        return length * width;

    }
}

class Triangle extends TwoDShape {
    public Triangle(int l, int w) {
        super(l, w);
    }

    public float getArea() {
        return (float) (0.5 * length * width);
    }
}

public class Question_area {
    public static void main(String[] args) {
        TwoDShape t = new Rectangle(5, 6);
        TwoDShape t1 = new Rectangle(t);
        Rectangle r = new Rectangle(4, 6);
        TwoDShape tri = new Triangle(3, 6);
        System.out.println(t.getArea());
        System.out.println(tri.getArea());
    }

}
