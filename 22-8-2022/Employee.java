class EmployeeDetail{
    private String eName;
    private int eId;
    private int Hour;
    private int eRate;
    static int count;

    public EmployeeDetail(String name, int id, int hour, int rate){
        set(name, id, hour, rate);
    }

    public void set(String name, int id, int hour, int rate){
        eName = name;
        eId = id + count++;
        Hour = hour;
        eRate = rate;
    }

    public void get(){
        System.out.println("Name: " + eName);
        System.out.println("Id: " + eId);
        System.out.println("Hour: " + Hour);
        System.out.println("Rate: " + eRate);
    }

}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetail e1 = new EmployeeDetail("Dev", 1, 5, 20);
        EmployeeDetail e2 = new EmployeeDetail("Dev", 1, 5, 20);
        EmployeeDetail e3 = new EmployeeDetail("Dev", 1, 5, 20);
        EmployeeDetail e4 = new EmployeeDetail("Dev", 1, 5, 20);
        EmployeeDetail e5 = new EmployeeDetail("Dev", 1, 5, 20);
        e1.get();
        e2.get();
        e3.get();
        e4.get();
        e5.get();
    }
}
