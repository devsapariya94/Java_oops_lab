class InvalidBoxException extends Exception{
    InvalidBoxException(String s){
        super(s);
    }
}

class Box{
    int length;
    int width;
    int height;
    Box(int l, int w,int h) throws InvalidBoxException{
        if (l<0 || w<0 || h<0) {
            throw new InvalidBoxException("invaild input");  
        }
        else{
            System.out.println("Done");
        }
    }
}

public class Exception_checked_box{

    public static void main(String[] args) {
        
        try {
            Box b =new Box(1,-22,4);
        } catch (InvalidBoxException e) {
            System.out.println(e);
        }
    }
}