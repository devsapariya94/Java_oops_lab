class InvalidTriangleException extends RuntimeException {
    InvalidTriangleException(String s){
        super(s);
    }
}

class Triangle{
    int side1;
    int side2;
    int side3;

    Triangle(int a,int b, int c){
        if((a+b)<c || (b+c)<a || (a+c)<b){
            throw new InvalidTriangleException("the Triangle is invalid");
        }
        else{
            System.out.println("Done");
        }
    }
}


public class Exception_unchecked_triangle {
    public static void main(String[] args) {
        Triangle t= new Triangle(1,2,7);
    }
}
