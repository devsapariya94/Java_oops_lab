class EmployeeDetails {
    String name;
    int eID;
    private int hours;
    private int rate;
    static int count;
    {
        eID=101+count++;
    }
    public EmployeeDetails(String name,int hours,int rate){
        this.name=name;
        this.hours=hours;
        this.rate=rate;
    }

    public String getName(){
        return name;
    }
    public int getHours(){
        return hours;
    }
    public int getRate(){
        return rate;
    }

    public int findSalary(){
        int salary;

        if(getHours()>180) {
            int extra = (getHours() - 180) * getRate() / 2;
            salary = getHours() * getRate() + extra;
        }
        else{
            salary=getHours()*getRate();
        }

        return salary;
    }

    public void printInfo(){
        System.out.printf("EMP ID: %d\n",this.eID);
        System.out.printf("The name is : %s\n",getName());
        System.out.printf("The hours are : %d\n",getHours());
        System.out.printf("rate per hour is : %d\n",getRate());
        System.out.printf("The salary of the employee is :RS.%d\n",findSalary());
    }



}

public class Employee{
    public static void main(String[] args) {
        EmployeeDetails emp1=new EmployeeDetails("Dev",240,50);
        emp1.printInfo();
        EmployeeDetails emp2=new EmployeeDetails("Het",210,70);
        emp2.printInfo();

    }
}