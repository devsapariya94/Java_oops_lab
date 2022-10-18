interface Interface1{
    public abstract  void printMethod1();
}

class Testclass1 implements Interface1{
    private  int number;
    public  Testclass1(){
        number=20;
    }
    public  Testclass1(int n){
        number=n;
    }
    public  int getNumber(){
        return  number;
    }
    public  void  setNumber(int n){
        number=n;
    }
    public void printMethod1(){
        System.out.println("TestCalss1 : "+number);
    }
}

public class InterfaceTesting {
    public static void main(String[] args) {
            Interface1 i1= new Testclass1(35);
            i1.printMethod1();
    }
}
